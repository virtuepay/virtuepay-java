package cn.virtuepay.exception;

public class APIException extends VirtuePayException {

    private static final long serialVersionUID = 2L;

    public APIException(String message, String type, String code, int statusCode, Throwable e) {
        super(message, type, code, statusCode, e);
    }
}
