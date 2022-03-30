package cn.virtuepay.model;

import cn.virtuepay.exception.VirtuePayException;
import cn.virtuepay.net.APIResource;
import cn.virtuepay.net.AppBasedResource;
import cn.virtuepay.net.RequestOptions;

import java.util.Map;

public class Contact extends AppBasedResource {
    String user;
    Boolean livemode;
    String accNo;
    String contactNo;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public Boolean getLivemode() {
        return livemode;
    }

    public void setLivemode(Boolean livemode) {
        this.livemode = livemode;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    /**
     * 新增联系人
     *
     * @param params 请求参数
     * @return Contact
     * @throws VirtuePayException
     */
    public static Contact create(Map<String, Object> params)
            throws VirtuePayException {
        return create(params, null);
    }

    /**
     * 新增联系人
     *
     * @param params 请求参数
     * @param options the specific options
     * @return Contact
     * @throws VirtuePayException
     */
    public static Contact create(Map<String, Object> params, RequestOptions options)
            throws VirtuePayException {
        return APIResource.request(APIResource.RequestMethod.POST, singleClassURL(Contact.class), params, Contact.class, options);
    }
}
