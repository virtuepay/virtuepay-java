package cn.virtuepay.model;

import cn.virtuepay.exception.VirtuePayException;
import cn.virtuepay.net.APIResource;
import cn.virtuepay.net.AppBasedResource;
import cn.virtuepay.net.RequestOptions;

import java.util.Map;

public class BalanceSettlement extends AppBasedResource {
    String id;
    String object;
    String app;
    Integer amount;
    Integer amountRefunded;
    Long created;
    String payment;
    Boolean livemode;
    String failureMsg;
    Boolean refunded;
    String orderNo;
    String status;
    Long timeCredited;
    Long timeSucceeded;
    String transactionNo;
    String user;
    String userFee;

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

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getAmountRefunded() {
        return amountRefunded;
    }

    public void setAmountRefunded(Integer amountRefunded) {
        this.amountRefunded = amountRefunded;
    }

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public Boolean getLivemode() {
        return livemode;
    }

    public void setLivemode(Boolean livemode) {
        this.livemode = livemode;
    }

    public String getFailureMsg() {
        return failureMsg;
    }

    public void setFailureMsg(String failureMsg) {
        this.failureMsg = failureMsg;
    }

    public Boolean getRefunded() {
        return refunded;
    }

    public void setRefunded(Boolean refunded) {
        this.refunded = refunded;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getTimeCredited() {
        return timeCredited;
    }

    public void setTimeCredited(Long timeCredited) {
        this.timeCredited = timeCredited;
    }

    public Long getTimeSucceeded() {
        return timeSucceeded;
    }

    public void setTimeSucceeded(Long timeSucceeded) {
        this.timeSucceeded = timeSucceeded;
    }

    public String getTransactionNo() {
        return transactionNo;
    }

    public void setTransactionNo(String transactionNo) {
        this.transactionNo = transactionNo;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUserFee() {
        return userFee;
    }

    public void setUserFee(String userFee) {
        this.userFee = userFee;
    }

    /**
     * ?????? balance_settlement
     *
     * @param id balance_settlement ID
     * @return BalanceSettlement
     * @throws VirtuePayException
     */
    public static BalanceSettlement retrieve(String id)
            throws VirtuePayException {
        return retrieve(id, null);
    }

    /**
     * ?????? balance_settlement
     *
     * @param id balance_settlement ID
     * @param options the specific options
     * @return BalanceSettlement
     * @throws VirtuePayException
     */
    public static BalanceSettlement retrieve(String id, RequestOptions options)
            throws VirtuePayException {
        return APIResource.request(APIResource.RequestMethod.GET, instanceURL(BalanceSettlement.class, id), null, BalanceSettlement.class, options);
    }

    /**
     * ?????? balance_transaction ??????
     *
     * @param params ????????????
     * @return BalanceSettlementCollection
     * @throws VirtuePayException
     */
    public static BalanceSettlementCollection list(Map<String, Object> params)
            throws VirtuePayException {
        return list(params, null);
    }

    /**
     * ?????? balance_transaction ??????
     *
     * @param params ????????????
     * @param options the specific options
     * @return BalanceSettlementCollection
     * @throws VirtuePayException
     */
    public static BalanceSettlementCollection list(Map<String, Object> params, RequestOptions options)
            throws VirtuePayException {
        return APIResource.request(APIResource.RequestMethod.GET, classURL(BalanceSettlement.class), params, BalanceSettlementCollection.class, options);
    }
}
