package cn.virtuepay;

import cn.virtuepay.exception.XPayException;
import cn.virtuepay.model.User;
import cn.virtuepay.net.RequestOptions;
import cn.virtuepay.net.RequestOptions.RequestOptionsBuilder;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class RequestOptionsTest {

    @Before
    public void clearConfigs() {
        VirtuePay.apiKey = null;
        VirtuePay.appId = null;
        VirtuePay.privateKey = null;
    }

    @Test
    public void testRequestOptionsBuild() {
        String apiKey = "sk_test_ibbTe5jLGCi5rzfH4OqnzhGs";
        String appId = "app_1Gqj58ynP0mNgKsc";
        String privateKey = "-----BEGIN......END-----".trim();
        RequestOptions options = new RequestOptionsBuilder()
                .setApiKey(apiKey)
                .setAppId(appId)
                .setPrivateKey(privateKey)
                .setConnectTimeout(5000)
                .setReadTimeout(20000)
                .setAcceptLanguage("zh-CN")
                .setMaxNetworkRetries(2)
                .build();

        assertEquals("API Key should be", apiKey, options.getApiKey());
        assertEquals("App ID should be", appId, options.getAppId());
        assertEquals("Private key should be", privateKey, options.getPrivateKey());
        assertEquals("Connect timeout should be", 5000, options.getConnectTimeout());
        assertEquals("Read timeout should be", 20000, options.getReadTimeout());
    }

    @Test
    public void testDefaultRequestOptionsBuilder() {
        VirtuePay.apiKey = XPayTestData.getApiKey();
        VirtuePay.appId = XPayTestData.getAppID();
        VirtuePay.privateKey = XPayTestData.getPKCS8PrivateKey();

        RequestOptions options = new RequestOptionsBuilder().build();

        assertEquals("API Key should be", XPayTestData.getApiKey(), options.getApiKey());
        assertEquals("App ID should be", XPayTestData.getAppID(), options.getAppId());
        assertEquals("Private key should be", XPayTestData.getPKCS8PrivateKey(), options.getPrivateKey());
    }

    @Test
    public void testDefaultRequestOptions() {
        VirtuePay.apiKey = XPayTestData.getApiKey();
        VirtuePay.appId = XPayTestData.getAppID();
        VirtuePay.privateKey = XPayTestData.getPKCS8PrivateKey();

        RequestOptions options = RequestOptions.getDefault();

        assertEquals("API Key should be", XPayTestData.getApiKey(), options.getApiKey());
        assertEquals("App ID should be", XPayTestData.getAppID(), options.getAppId());
        assertEquals("Private key should be", XPayTestData.getPKCS8PrivateKey(), options.getPrivateKey());
    }

    @Test
    public void testRequestOptionsRequest() throws XPayException {
        RequestOptions options = new RequestOptionsBuilder()
                .setApiKey(XPayTestData.getApiKey())
                .setAppId(XPayTestData.getAppID())
                .setPrivateKey(XPayTestData.getPKCS8PrivateKey())
                .build();

        String userId = "test_user_001";
        User obj = User.retrieve(userId, options);

        assertNull("XPay.apiKey should be null", VirtuePay.apiKey);
        assertNull("XPay.appId should be null", VirtuePay.appId);
        assertEquals("object should be user", "user", obj.getObject());
        assertEquals("id", userId, obj.getId());
        assertEquals("app", XPayTestData.getAppID(), obj.getApp());
    }
}
