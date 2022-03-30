package cn.virtuepay.model;

public class WithdrawalCollection extends WithdrawalCollectionBase {
    Integer totalWithdrawalsAmount;

    public Integer getTotalWithdrawalsAmount() {
        return totalWithdrawalsAmount;
    }

    public void setTotalWithdrawalsAmount(Integer totalWithdrawalAmount) {
        this.totalWithdrawalsAmount = totalWithdrawalAmount;
    }
}
