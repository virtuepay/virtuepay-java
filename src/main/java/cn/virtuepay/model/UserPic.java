package cn.virtuepay.model;

import cn.virtuepay.exception.VirtuePayException;
import cn.virtuepay.net.APIResource;
import cn.virtuepay.net.AppBasedResource;
import cn.virtuepay.net.RequestOptions;

import java.util.Map;

public class UserPic extends AppBasedResource {
    String user;
    Boolean livemode;
    String type;
    String operateType;
    String picFmt;
    String picType;
    String accNo;
    String picExternalId;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Boolean getLivemode() {
        return livemode;
    }

    public void setLivemode(Boolean livemode) {
        this.livemode = livemode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public String getPicFmt() {
        return picFmt;
    }

    public void setPicFmt(String picFmt) {
        this.picFmt = picFmt;
    }

    public String getPicType() {
        return picType;
    }

    public void setPicType(String picType) {
        this.picType = picType;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getPicExternalId() {
        return picExternalId;
    }

    public void setPicExternalId(String picExternalId) {
        this.picExternalId = picExternalId;
    }

    /**
     * 证件上传
     *
     * @param params 请求参数
     * @return UserPic
     * @throws VirtuePayException
     */
    public static UserPic upload(Map<String, Object> params)
            throws VirtuePayException {
        return upload(params, null);
    }

    /**
     * 证件上传
     *
     * @param params 请求参数
     * @param options the specific options
     * @return UserPic
     * @throws VirtuePayException
     */
    public static UserPic upload(Map<String, Object> params, RequestOptions options)
            throws VirtuePayException {
        return APIResource.request(APIResource.RequestMethod.POST, singleClassURL(UserPic.class), params, UserPic.class, options);
    }
}
