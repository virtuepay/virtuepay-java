package cn.virtuepay.model;

import cn.virtuepay.exception.VirtuePayException;
import cn.virtuepay.net.APIResource;
import cn.virtuepay.net.RequestOptions;

import java.util.Map;

public class Customs extends APIResource {
    String id;
    String object;
    Long created;
    Object app;
    String channel;
    String tradeNo;
    String customsCode;
    Integer amount;
    String payment;
    Integer transportAmount;
    Boolean isSplit;
    String subOrderNo;
    Map<String, Object> extra;
    Long timeSucceeded;
    String status;
    String failureCode;
    String failureMsg;
    String transactionNo;

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

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public Object getApp() {
        return app;
    }

    public void setApp(Object app) {
        this.app = app;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getCustomsCode() {
        return customsCode;
    }

    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public Integer getTransportAmount() {
        return transportAmount;
    }

    public void setTransportAmount(Integer transportAmount) {
        this.transportAmount = transportAmount;
    }

    public Boolean getSplit() {
        return isSplit;
    }

    public void setSplit(Boolean split) {
        isSplit = split;
    }

    public String getSubOrderNo() {
        return subOrderNo;
    }

    public void setSubOrderNo(String subOrderNo) {
        this.subOrderNo = subOrderNo;
    }

    public Map<String, Object> getExtra() {
        return extra;
    }

    public void setExtra(Map<String, Object> extra) {
        this.extra = extra;
    }

    public Long getTimeSucceeded() {
        return timeSucceeded;
    }

    public void setTimeSucceeded(Long timeSucceeded) {
        this.timeSucceeded = timeSucceeded;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFailureCode() {
        return failureCode;
    }

    public void setFailureCode(String failureCode) {
        this.failureCode = failureCode;
    }

    public String getFailureMsg() {
        return failureMsg;
    }

    public void setFailureMsg(String failureMsg) {
        this.failureMsg = failureMsg;
    }

    public String getTransactionNo() {
        return transactionNo;
    }

    public void setTransactionNo(String transactionNo) {
        this.transactionNo = transactionNo;
    }

    /**
     * ?????? customs
     *
     * @param params
     * @return Customs
     * @throws VirtuePayException
     */
    public static Customs create(Map<String, Object> params)
            throws VirtuePayException {
        return create(params, null);
    }

    /**
     * ?????? customs
     *
     * @param params
     * @param options the specific options
     * @return Customs
     * @throws VirtuePayException
     */
    public static Customs create(Map<String, Object> params, RequestOptions options)
            throws VirtuePayException {
        return APIResource.request(APIResource.RequestMethod.POST, classURL(Customs.class), params, Customs.class, options);
    }

    /**
     * ?????? customs
     *
     * @param id
     * @return Customs
     * @throws VirtuePayException
     */
    public static Customs retrieve(String id) throws VirtuePayException {
        return retrieve(id, null);
    }

    /**
     * ?????? customs
     *
     * @param id
     * @param options the specific options
     * @return Customs
     * @throws VirtuePayException
     */
    public static Customs retrieve(String id, RequestOptions options) throws VirtuePayException {
        return APIResource.request(APIResource.RequestMethod.GET, instanceURL(Customs.class, id), null, Customs.class, options);
    }

    /**
     * ?????? customs ??????
     *
     * @param params
     * @return CustomsCollection
     * @throws VirtuePayException
     */
    public static CustomsCollection list(Map<String, Object> params)
            throws VirtuePayException {
        return list(params, null);
    }

    /**
     * ?????? customs ??????
     *
     * @param params
     * @param options the specific options
     * @return CustomsCollection
     * @throws VirtuePayException
     */
    public static CustomsCollection list(Map<String, Object> params, RequestOptions options)
            throws VirtuePayException {
        return APIResource.request(APIResource.RequestMethod.GET, classURL(Customs.class), params, CustomsCollection.class, options);
    }
}
