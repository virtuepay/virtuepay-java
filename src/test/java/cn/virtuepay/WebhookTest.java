package cn.virtuepay;

import cn.virtuepay.model.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/*
 * @author Afon, @date 17-03-28
 */
public class WebhookTest extends VirtuePayTestBase {
    /**
     * 解析 webhooks 消息 (withdrawal)
     */
    @Test
    public void testWebhooksParseWithdrawal() {
        String webhookData = VirtuePayTestData.getWithdrawalWebhooksData();

        VirtuePayObject obj = Webhooks.getObject(webhookData);

        assertTrue("object should be an instance of Withdrawal", obj instanceof Withdrawal);
        assertEquals("object should be withdrawal", "withdrawal", ((Withdrawal) obj).getObject());
    }

    /**
     * 解析 webhooks 消息 (recharge)
     */
    @Test
    public void testWebhooksParseRecharge() {
        String webhookData = VirtuePayTestData.getRechargeSucceededEventData();

        VirtuePayObject obj = Webhooks.getObject(webhookData);

        assertTrue("object should be an instance of Recharge", obj instanceof Recharge);
        assertEquals("object should be recharge", "recharge", ((Recharge) obj).getObject());
    }

    /**
     * 解析 webhooks 消息 (order)
     */
    @Test
    public void testWebhooksParseOrder() {
        String webhookData = VirtuePayTestData.getOrderSucceededEventData();

        VirtuePayObject obj = Webhooks.getObject(webhookData);

        assertTrue("object should be an instance of Order", obj instanceof Order);
        assertEquals("object should be order", "order", ((Order) obj).getObject());
    }

    /**
     * 解析 webhooks 消息 (agreement)
     */
    @Test
    public void testWebhooksParseAgreement() {
        String webhookData = VirtuePayTestData.getAgreementEventData();

        VirtuePayObject obj = Webhooks.getObject(webhookData);

        assertTrue("object should be an instance of Agreement", obj instanceof Agreement);
        assertEquals("object should be agreement", "agreement", ((Agreement) obj).getObject());
    }
}
