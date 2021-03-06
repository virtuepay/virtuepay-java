package cn.virtuepay.withdrawal;

import cn.virtuepay.VirtuePayTestBase;
import cn.virtuepay.VirtuePayTestData;
import cn.virtuepay.exception.VirtuePayException;
import cn.virtuepay.model.Withdrawal;
import cn.virtuepay.model.WithdrawalCollection;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class WithdrawalTest extends VirtuePayTestBase {
    /**
     * 创建提现申请
     */
    @Test
    public void testCreateWithdrawal() throws VirtuePayException {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("user", VirtuePayTestData.userId); // 用户 ID, 必传
        params.put("channel", "wx_wap"); // 提现使用渠道。银联：unionpay，支付宝：alipay，微信：wx_pub，通联：allinpay，京东：jdpay, 可选
        params.put("amount", 1);  // 转账金额, 必传
        params.put("description", "custom description");    // 描述, 可选
        params.put("order_no", "1010" + System.currentTimeMillis()); // 提现订单号, 必传
        Map<String, String> extra = new HashMap<String, String>();
//        extra.put("account_type", "ALIPAY_USERID");
//        extra.put("account", "2088802684855318");
//        params.put("extra", extra);
        params.put("user_fee", 0);  // 用户需要承担的手续费, 必传
        params.put("settle_account", "b7cd7d70e0cb4869836be1ffb7857df0"); // 使用结算账户提现，不需要填写 extra 参数，同时填写时，结算账号不生效

        Withdrawal withdrawal = Withdrawal.create(params); // 创建 Withdrawal 对象
        String withdrawalString = withdrawal.toString();
        System.out.println(withdrawalString);
//        assertEquals("object should be withdrawal", "withdrawal", withdrawal.getObject());
//        assertEquals("user should be same as the value in params", params.get("user"), withdrawal.getUser());
//        assertEquals("amount should be same as the value in params", params.get("amount"), withdrawal.getAmount());
//        assertEquals("description should be same as the value in params", params.get("description"), withdrawal.getDescription());
//        assertEquals("order_no should be same as the value in params", params.get("order_no"), withdrawal.getOrderNo());
//        assertEquals("user_name should be same as the value in params", extra.get("user_name"), withdrawal.getExtra().get("user_name"));
//        assertEquals("account should be same as the value in params", extra.get("account"), withdrawal.getExtra().get("account"));
//        assertEquals("user_fee should be same as the value in params", params.get("user_fee"), withdrawal.getUserFee());
//        assertEquals("status should be created", "created", withdrawal.getStatus());
//        assertEquals("time_canceled should be null", null, withdrawal.getTimeCanceled());
//        assertEquals("time_succeeded should be created", null, withdrawal.getTimeSucceeded());
//        assertEquals("failure_msg should be null", null, withdrawal.getFailureMsg());
//        assertNull("operation_url should be null", withdrawal.getOperationUrl());
    }

    /**
     * 获取提现对象
     */
    @Test
    public void testWithdrawalRetrieve() throws VirtuePayException {

        // 查询 Withdrawal
        // 参数: withdrawal id
        Withdrawal withdrawal = Withdrawal.retrieve("1701708221834035593");

        assertEquals("object should be withdrawal", "withdrawal", withdrawal.getObject());
    }

    /**
     * 获取提现列表
     */
    @Test
    public void testGetWithdrawalList() throws VirtuePayException {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("page", 1);
        params.put("per_page", 3);

        WithdrawalCollection withdrawals = Withdrawal.list(params); // 查询 Withdrawal 列表

        assertNotNull("total_withdrawal_list should not be null", withdrawals.getTotalWithdrawalsAmount());
        assertEquals("object should be list", "list", withdrawals.getObject());
        assertEquals("data count should be same with limit", ((Integer) params.get("per_page")).intValue(), withdrawals.getData().size());
    }

    /**
     * 更新提现对象
     */
    @Test
    public void testWithdrawalUpdate() throws VirtuePayException {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("status", "pending"); // 更新状态。确认：pending，取消：canceled。
        // 更新 Withdrawal 方法
        // 参数一: withdrawal id
        // 参数二: params
        Withdrawal withdrawal = Withdrawal.update("4ef99dad926b4d37a860255a19181964", params);
        // 或者使用以下方法来更新 Withdrawal 状态
        // Withdrawal.cancel("1701708221834035593"); // 取消 Withdrawal
        // Withdrawal.confirm("1701708221834035593"); // 确认 Withdrawal

        assertEquals("object should be withdrawal", "withdrawal", withdrawal.getObject());
    }
}
