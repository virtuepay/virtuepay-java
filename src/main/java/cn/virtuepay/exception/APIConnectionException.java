package cn.virtuepay.exception;

public class APIConnectionException extends VirtuePayException {

    private static final long serialVersionUID = 2L;

    public APIConnectionException(String message) {
        super(message);
    }

    public APIConnectionException(String message, Throwable e) {
        super(message, e);
    }

}
