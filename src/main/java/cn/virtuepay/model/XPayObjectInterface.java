package cn.virtuepay.model;

import cn.virtuepay.net.XPayResponse;

public interface XPayObjectInterface {
    public XPayResponse getLastResponse();

    public void setLastResponse(XPayResponse response);
}
