package cn.virtuepay.model;

import cn.virtuepay.exception.VirtuePayException;
import cn.virtuepay.net.APIResource;
import cn.virtuepay.net.RequestOptions;

import java.util.Map;

public class Identification extends APIResource {
    String type;
    Object app;
    Integer resultCode;
    String message;
    Boolean paid;
    Map<String, String> data;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getPaid() {
        return paid;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public Map<String, String> getData() {
        return data;
    }

    public void setData(Map<String, String> data) {
        this.data = data;
    }

    public Object getApp() {
        return app;
    }

    public void setApp(Object app) {
        this.app = app;
    }

    /**
     * 请求认证
     *
     * @param params
     * @return Identification
     * @throws VirtuePayException
     */
    public static Identification identify(Map<String, Object> params)
            throws VirtuePayException {
        return identify(params, null);
    }

    /**
     * 请求认证
     *
     * @param params
     * @param options the specific options
     * @return Identification
     * @throws VirtuePayException
     */
    public static Identification identify(Map<String, Object> params, RequestOptions options)
            throws VirtuePayException {
        return APIResource.request(APIResource.RequestMethod.POST, singleClassURL(Identification.class), params, Identification.class, options);
    }
}
