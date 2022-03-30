package cn.virtuepay.model;

import cn.virtuepay.VirtuePay;
import cn.virtuepay.exception.VirtuePayException;
import cn.virtuepay.net.APIResource;
import cn.virtuepay.net.RequestOptions;

import java.util.Map;

public class PaymentRefundCollection extends XPayCollectionAPIResource<Refund> {

    public PaymentRefundCollection list(Map<String, Object> params)
            throws VirtuePayException {

        return list(params, null);
    }

    public PaymentRefundCollection list(Map<String, Object> params, RequestOptions options)
            throws VirtuePayException {

        String url = String.format("%s%s", VirtuePay.getApiBase(), this.getURL());
        return APIResource.request(APIResource.RequestMethod.GET, url, params, PaymentRefundCollection.class, options);
    }

    public Refund retrieve(String id)
            throws VirtuePayException {

        return retrieve(id, null);
    }

    public Refund retrieve(String id, RequestOptions options)
            throws VirtuePayException {

        String url = String.format("%s%s/%s", VirtuePay.getApiBase(), this.getURL(), id);
        return APIResource.request(APIResource.RequestMethod.GET, url, null, Refund.class, options);
    }

    public Refund create(Map<String, Object> params)
            throws VirtuePayException {

        return create(params, null);
    }

    public Refund create(Map<String, Object> params, RequestOptions options)
            throws VirtuePayException {

        String url = String.format("%s%s", VirtuePay.getApiBase(), this.getURL());
        return APIResource.request(APIResource.RequestMethod.POST, url, params, Refund.class, options);
    }

}
