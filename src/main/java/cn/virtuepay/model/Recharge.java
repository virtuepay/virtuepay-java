package cn.virtuepay.model;

import cn.virtuepay.exception.VirtuePayException;
import cn.virtuepay.net.APIResource;
import cn.virtuepay.net.AppBasedResource;
import cn.virtuepay.net.RequestOptions;

import java.util.Map;

public class Recharge extends AppBasedResource {
    String id;
    String object;
    String app;
    Long created;
    Boolean livemode;
    Integer amount;
    Boolean succeeded;
    Long timeSucceeded;
    Boolean refunded;
    String user;
    String fromUser;
    Long userFee;
    Payment payment;
    BalanceBonus balanceBonus;
    String balanceTransaction;
    String description;
    Map<String, Object> metadata;

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

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public Boolean getLivemode() {
        return livemode;
    }

    public void setLivemode(Boolean livemode) {
        this.livemode = livemode;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Boolean getSucceeded() {
        return succeeded;
    }

    public void setSucceeded(Boolean succeeded) {
        this.succeeded = succeeded;
    }

    public Long getTimeSucceeded() {
        return timeSucceeded;
    }

    public void setTimeSucceeded(Long timeSucceeded) {
        this.timeSucceeded = timeSucceeded;
    }

    public Boolean getRefunded() {
        return refunded;
    }

    public void setRefunded(Boolean refunded) {
        this.refunded = refunded;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getFromUser() {
        return fromUser;
    }

    public void setFromUser(String fromUser) {
        this.fromUser = fromUser;
    }

    public Long getUserFee() {
        return userFee;
    }

    public void setUserFee(Long userFee) {
        this.userFee = userFee;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public BalanceBonus getBalanceBonus() {
        return balanceBonus;
    }

    public void setBalanceBonus(BalanceBonus balanceBonus) {
        this.balanceBonus = balanceBonus;
    }

    public String getBalanceTransaction() {
        return balanceTransaction;
    }

    public void setBalanceTransaction(String balanceTransaction) {
        this.balanceTransaction = balanceTransaction;
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

    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }

    /**
     * ?????? recharge
     *
     * @param params
     * @return Recharge
     * @throws VirtuePayException
     */
    public static Recharge create(Map<String, Object> params)
            throws VirtuePayException {
        return create(params, null);
    }

    /**
     * ?????? recharge
     *
     * @param params
     * @param options the specific options
     * @return Recharge
     * @throws VirtuePayException
     */
    public static Recharge create(Map<String, Object> params, RequestOptions options)
            throws VirtuePayException {
        return APIResource.request(APIResource.RequestMethod.POST, classURL(Recharge.class), params, Recharge.class, options);
    }

    /**
     * ?????? recharge
     *
     * @param id
     * @return Recharge
     * @throws VirtuePayException
     */
    public static Recharge retrieve(String id)
            throws VirtuePayException {
        return retrieve(id, null);
    }

    /**
     * ?????? recharge
     *
     * @param id
     * @param options the specific options
     * @return Recharge
     * @throws VirtuePayException
     */
    public static Recharge retrieve(String id, RequestOptions options)
            throws VirtuePayException {
        return APIResource.request(APIResource.RequestMethod.GET, instanceURL(Recharge.class, id), null, Recharge.class, options);
    }

    /**
     * ?????? recharge ??????
     *
     * @param params
     * @return RechargeCollection
     * @throws VirtuePayException
     */
    public static RechargeCollection list(Map<String, Object> params)
            throws VirtuePayException {
        return list(params, null);
    }

    /**
     * ?????? recharge ??????
     *
     * @param params
     * @param options the specific options
     * @return RechargeCollection
     * @throws VirtuePayException
     */
    public static RechargeCollection list(Map<String, Object> params, RequestOptions options)
            throws VirtuePayException {
        return APIResource.request(APIResource.RequestMethod.GET, classURL(Recharge.class), params, RechargeCollection.class, options);
    }
}
