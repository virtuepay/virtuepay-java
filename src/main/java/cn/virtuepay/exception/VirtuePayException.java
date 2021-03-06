package cn.virtuepay.exception;

public abstract class VirtuePayException extends Exception {
    private String type;

    private String code;

    private int statusCode;

    public VirtuePayException(String message) {
        super(message, null);
    }

    public VirtuePayException(String message, Throwable e) {
        super(message, e);
    }

    public VirtuePayException(String message, String type, String code, int statusCode, Throwable e) {
        super(message, e);
        this.type = type;
        this.code = code;
        this.statusCode = statusCode;
    }

    private static final long serialVersionUID = 2L;

    public String getType() {
        return type;
    }

    public String getCode() {
        return code;
    }

    public int getStatusCode() {
        return statusCode;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(super.toString());
        if (type != null) {
            sb.append("; type: ").append(type);
        }
        if (code != null) {
            sb.append("; code: ").append(code);
        }

        return sb.toString();
    }
}
