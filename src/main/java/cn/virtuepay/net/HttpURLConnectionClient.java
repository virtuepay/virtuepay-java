package cn.virtuepay.net;

import cn.virtuepay.VirtuePay;
import cn.virtuepay.exception.APIConnectionException;
import cn.virtuepay.util.StreamUtils;
import cn.virtuepay.util.StringUtils;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.*;

public class HttpURLConnectionClient extends HttpClient {
    /** Initializes a new instance of the {@link HttpURLConnectionClient}. */
    public HttpURLConnectionClient() {
        super();
    }

    /**
     * Sends the given request to VirtuePay's API.
     *
     * @param request the request
     * @return the response
     * @throws APIConnectionException if an error occurs when sending or receiving
     */
    @Override
    public VirtuePayResponse request(VirtuePayRequest request) throws APIConnectionException {
        HttpURLConnection conn = null;

        try {
            conn = createVirtuePayConnection(request);

            // trigger the request
            int responseCode = conn.getResponseCode();
            HttpHeaders headers = HttpHeaders.of(conn.getHeaderFields());
            String responseBody;

            if (responseCode >= 200 && responseCode < 300) {
                responseBody = StreamUtils.readToEnd(conn.getInputStream(), APIResource.CHARSET);
            } else {
                responseBody = StreamUtils.readToEnd(conn.getErrorStream(), APIResource.CHARSET);
            }

            return new VirtuePayResponse(responseCode, responseBody, headers);
        } catch (IOException e) {
            throw new APIConnectionException(
                    String.format(
                            "IOException during API request to VirtuePay (%s): %s "
                                    + "Please check your internet connection and try again.",
                            VirtuePay.getApiBase(), e.getMessage()),
                    e);
        } finally {
            if (conn != null) {
                conn.disconnect();
            }
        }
    }

    static HttpHeaders getHeaders(VirtuePayRequest request) {
        Map<String, List<String>> userAgentHeadersMap = new HashMap<>();

        userAgentHeadersMap.put("User-Agent", Collections.singletonList(buildUserAgentString()));
        userAgentHeadersMap.put(
                "X-Client-User-Agent", Collections.singletonList(buildVirtuePayClientUserAgentString()));

        return request.getHeaders().withAdditionalHeaders(userAgentHeadersMap);
    }

    private static HttpURLConnection createVirtuePayConnection(VirtuePayRequest request)
            throws IOException {
        HttpURLConnection conn = (HttpURLConnection) request.url.openConnection();

        conn.setConnectTimeout(request.options.getConnectTimeout());
        conn.setReadTimeout(request.options.getReadTimeout());
        conn.setUseCaches(false);
        for (Map.Entry<String, List<String>> entry : getHeaders(request).map().entrySet()) {
            conn.setRequestProperty(entry.getKey(), StringUtils.join(",", entry.getValue()));
        }

        conn.setRequestMethod(request.method.name());

        String requestTime = currentTimeString();
        conn.setRequestProperty("X-Request-Timestamp", requestTime);
        String signature = buildVirtuePaySignature(request, requestTime);
        if (signature != null) {
            conn.setRequestProperty("X-Signature", signature);
        }

        if (request.content != null) {
            conn.setDoOutput(true);
            conn.setRequestProperty("Content-Type", request.content.contentType);

            try (OutputStream output = conn.getOutputStream()) {
                output.write(request.content.byteArrayContent);
            }
        }

        return conn;
    }
}
