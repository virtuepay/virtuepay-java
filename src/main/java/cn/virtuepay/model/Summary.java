package cn.virtuepay.model;

/**
 * Created by sunkai on 15/5/11.
 */
public class Summary extends VirtuePayObject {
    private String acctId;
    private String appId;

    private String acctDisplayName;
    private String appDisplayName;

    private String object;
    private Long created;
    private Long summaryFrom;
    private Long summaryTo;
    private Long paymentsAmount;
    private Long paymentsCount;

    public String getAcctId() {
        return acctId;
    }

    public void setAcctId(String acctId) {
        this.acctId = acctId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAcctDisplayName() {
        return acctDisplayName;
    }

    public void setAcctDisplayName(String acctDisplayName) {
        this.acctDisplayName = acctDisplayName;
    }

    public String getAppDisplayName() {
        return appDisplayName;
    }

    public void setAppDisplayName(String appDisplayName) {
        this.appDisplayName = appDisplayName;
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

    public Long getSummaryFrom() {
        return summaryFrom;
    }

    public void setSummaryFrom(Long summaryFrom) {
        this.summaryFrom = summaryFrom;
    }

    public Long getSummaryTo() {
        return summaryTo;
    }

    public void setSummaryTo(Long summaryTo) {
        this.summaryTo = summaryTo;
    }

    public Long getPaymentsAmount() {
        return paymentsAmount;
    }

    public void setPaymentsAmount(Long paymentsAmount) {
        this.paymentsAmount = paymentsAmount;
    }

    public Long getPaymentsCount() {
        return paymentsCount;
    }

    public void setPaymentsCount(Long paymentsCount) {
        this.paymentsCount = paymentsCount;
    }
}
