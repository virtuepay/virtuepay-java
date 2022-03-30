package cn.virtuepay.model;

public class VirtuePayError extends VirtuePayObject {
    String type;

    String message;

    String code;

    String param;

    public String getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }

    public String getCode() {
        return code;
    }

    public String getParam() {
        return param;
    }
}
