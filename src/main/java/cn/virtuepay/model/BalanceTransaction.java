package cn.virtuepay.model;

import cn.virtuepay.exception.VirtuePayException;
import cn.virtuepay.net.APIResource;
import cn.virtuepay.net.AppBasedResource;
import cn.virtuepay.net.RequestOptions;

import java.util.Map;

public class BalanceTransaction extends AppBasedResource {
    String id;
    String object;
    String app;
    Integer amount;
    Integer availableBalance;
    Long created;
    String description;
    Boolean livemode;
    String source;
    String type;
    String user;

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

    public Integer getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(Integer availableBalance) {
        this.availableBalance = availableBalance;
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

    public Boolean getLivemode() {
        return livemode;
    }

    public void setLivemode(Boolean livemode) {
        this.livemode = livemode;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    /**
     * ?????? balance_transaction
     *
     * @param id
     * @return BalanceTransaction
     * @throws VirtuePayException
     */
    public static BalanceTransaction retrieve(String id)
            throws VirtuePayException {
        return retrieve(id, null);
    }

    /**
     * ?????? balance_transaction
     *
     * @param id
     * @param options the specific options
     * @return BalanceTransaction
     * @throws VirtuePayException
     */
    public static BalanceTransaction retrieve(String id, RequestOptions options)
            throws VirtuePayException {
        return APIResource.request(APIResource.RequestMethod.GET, instanceURL(BalanceTransaction.class, id), null, BalanceTransaction.class, options);
    }

    /**
     * ?????? balance_transaction ??????
     *
     * @param params
     * @return BalanceTransactionCollection
     * @throws VirtuePayException
     */
    public static BalanceTransactionCollection list(Map<String, Object> params)
            throws VirtuePayException {
        return list(params, null);
    }

    /**
     * ?????? balance_transaction ??????
     *
     * @param params
     * @param options the specific options
     * @return BalanceTransactionCollection
     * @throws VirtuePayException
     */
    public static BalanceTransactionCollection list(Map<String, Object> params, RequestOptions options)
            throws VirtuePayException {
        return APIResource.request(APIResource.RequestMethod.GET, classURL(BalanceTransaction.class), params, BalanceTransactionCollection.class, options);
    }
}
