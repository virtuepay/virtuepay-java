package cn.virtuepay.split;

import cn.virtuepay.exception.VirtuePayException;
import cn.virtuepay.VirtuePayTestBase;
import cn.virtuepay.VirtuePayTestData;
import cn.virtuepay.model.SplitProfit;
import cn.virtuepay.model.SplitProfitCollection;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class SplitProfitTest extends VirtuePayTestBase {
    @Test
    public void testCreate() throws VirtuePayException {
        Map<String, Object> params = new HashMap<>();
        params.put("app", VirtuePayTestData.getAppID());
        params.put("payment", "ch_KiT4ePn9SyXDfvfPyDevn1G0"); // 交易成功的 VirtuePay Payment ID
        params.put("order_no", "2019" + System.currentTimeMillis()); // 分账单号，由商家自行生成，规则参照微信分账参数规则
        params.put("type", "split_normal"); // 分账类型: split_normal 为普通分账, split_return 为完结分账
        List<Map<String, Object>> recipients = new ArrayList<>();
        Map<String, Object> recipient = new HashMap<>();
        recipient.put("split_receiver", "recv_1fRc57XpIehmFI");
        recipient.put("amount", 6);
        recipient.put("name", "示例商户全称"); // 可选参数
        recipient.put("description", "Your Description");
        recipients.add(recipient);
        params.put("recipients", recipients);
        SplitProfit obj = SplitProfit.create(params);

        System.out.println(obj);

        assertEquals("split_profit", obj.getObject());
    }

    @Test
    public void testListAll() throws VirtuePayException {
        Map<String, Object> params = new HashMap<>();
        params.put("app", VirtuePayTestData.getAppID());
        params.put("page", 1);
        params.put("per_page", 3);
        SplitProfitCollection obj = SplitProfit.list(params);

        System.out.println(obj);

        assertEquals("list", obj.getObject());
        assertEquals("split_profit", obj.getData().get(0).getObject());
    }

    @Test
    public void testRetrieve() throws VirtuePayException {
        SplitProfit obj = SplitProfit.retrieve("sp_1iXmM0w3VaE77Y");

        System.out.println(obj);

        assertEquals("split_profit", obj.getObject());
    }
}
