package cn.virtuepay.model;

import cn.virtuepay.exception.VirtuePayException;
import cn.virtuepay.net.APIResource;
import cn.virtuepay.net.RequestOptions;

import java.util.List;
import java.util.Map;

public class BatchRefund extends APIResource {
    String id;
    String object;
    String app;
    String batchNo;
    Long created;
    String description;
    Boolean livemode;
    Map<String, Object> metadata;
    List<BatchRefundPayments> payments;
    PaymentRefundCollection refunds;
    String refundUrl;
    String status;
    Long timeSucceeded;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, Object> getMetadata() {
        return metadata;
    }

    public Boolean getLivemode() {
        return livemode;
    }

    public void setLivemode(Boolean livemode) {
        this.livemode = livemode;
    }

    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }

    public List<BatchRefundPayments> getPayments() {
        return payments;
    }

    public void setPayments(List<BatchRefundPayments> payments) {
        this.payments = payments;
    }

    public PaymentRefundCollection getRefunds() {
        return refunds;
    }

    public void setRefunds(PaymentRefundCollection refunds) {
        this.refunds = refunds;
    }

    public String getRefundUrl() {
        return refundUrl;
    }

    public void setRefundUrl(String refundUrl) {
        this.refundUrl = refundUrl;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getTimeSucceeded() {
        return timeSucceeded;
    }

    public void setTimeSucceeded(Long timeSucceeded) {
        this.timeSucceeded = timeSucceeded;
    }

    /**
     * @param clazz
     * @return String
     */
    protected static String classURL(Class<?> clazz) {
        return apiBasePrefixedURL("/v2/batch_refunds");
    }

    /**
     * ?????? batch_refund
     *
     * @param params
     * @return BatchRefund
     * @throws VirtuePayException
     */
    public static BatchRefund create(Map<String, Object>params)
            throws VirtuePayException {
        return create(params, null);
    }

    /**
     * ?????? batch_refund
     *
     * @param params
     * @param options the specific options
     * @return BatchRefund
     * @throws VirtuePayException
     */
    public static BatchRefund create(Map<String, Object>params, RequestOptions options)
            throws VirtuePayException {
        return APIResource.request(APIResource.RequestMethod.POST, classURL(BatchRefund.class), params, BatchRefund.class, options);
    }

    /**
     * ?????? batch_refund
     *
     * @param id
     * @return BatchRefund
     * @throws VirtuePayException
     */
    public static BatchRefund retrieve(String id)
            throws VirtuePayException {
        return retrieve(id, null);
    }

    /**
     * ?????? batch_refund
     *
     * @param id
     * @param options the specific options
     * @return BatchRefund
     * @throws VirtuePayException
     */
    public static BatchRefund retrieve(String id, RequestOptions options)
            throws VirtuePayException {
        return APIResource.request(APIResource.RequestMethod.GET, instanceURL(BatchRefund.class, id), null, BatchRefund.class, options);
    }

    /**
     * ?????? batch_refund ??????
     *
     * @param params
     * @return BatchRefundCollection
     * @throws VirtuePayException
     */
    public static BatchRefundCollection list(Map<String, Object> params)
            throws VirtuePayException {
        return list(params, null);
    }

    /**
     * ?????? batch_refund ??????
     *
     * @param params
     * @param options the specific options
     * @return BatchRefundCollection
     * @throws VirtuePayException
     */
    public static BatchRefundCollection list(Map<String, Object> params, RequestOptions options)
            throws VirtuePayException {
        return APIResource.request(APIResource.RequestMethod.GET, classURL(BatchRefund.class), params, BatchRefundCollection.class, options);
    }
}
