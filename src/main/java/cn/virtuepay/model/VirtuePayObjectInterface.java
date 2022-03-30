package cn.virtuepay.model;

import cn.virtuepay.net.VirtuePayResponse;

public interface VirtuePayObjectInterface {

    public VirtuePayResponse getLastResponse();

    public void setLastResponse(VirtuePayResponse response);
}
