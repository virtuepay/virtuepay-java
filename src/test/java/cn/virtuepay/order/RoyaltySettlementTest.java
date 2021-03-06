package cn.virtuepay.order;

import cn.virtuepay.exception.VirtuePayException;
import cn.virtuepay.model.RoyaltySettlement;
import cn.virtuepay.model.RoyaltySettlementCollection;
import cn.virtuepay.VirtuePayTestBase;
import cn.virtuepay.VirtuePayTestData;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class RoyaltySettlementTest extends VirtuePayTestBase {
    /**
     * 创建 royalty_settlement
     */
    @Test
    public void testRoyaltySettlementCreate() throws VirtuePayException {
        Map<String, Object> params = new HashMap<>();
        params.put("payer_app", VirtuePayTestData.getAppID());  // 分润发起方所在应用的 id, 必传
        params.put("method", "wx_wap");     // 分润的方式，余额 balance 或渠道名称，例如 alipay, 必传
//        params.put("recipient_app", VirtuePayTestData.getAppID()); // 分润接收方的应用 id，即分润用户关联的应用 id。可选
        params.put("is_preview", false); // 是否预览，选择预览不会真实创建分润结算对象，也不会修改分润对象的状态, 可选
        // 创建 royalty_settlement 方法
        // 参数: params
        RoyaltySettlement obj = RoyaltySettlement.create(params);

        System.out.println(obj);
        assertEquals("object should be royalty_settlement", "royalty_settlement", obj.getObject());
    }

    /**
     * 查询单个 royalty_settlement
     */
    @Test
    public void testRoyaltySettlementRetrieve() throws VirtuePayException {
        // 查询单个 royalty_settlement 方法
        // 参数: royalty_settlement id
        RoyaltySettlement obj = RoyaltySettlement.retrieve("b555bf10149b4d5aa66294c418da2f37");
        System.out.println(obj);
        assertEquals("object should be royalty_settlement", "royalty_settlement", obj.getObject());
    }

    /**
     * 查询 royalty_settlement list
     */
    @Test
    public void testRoyaltySettlementList() throws VirtuePayException {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("payer_app", VirtuePayTestData.getAppID());
        params.put("per_page", 3);
        params.put("page", 1);
        // 查询 royalty_settlement list 列表方法
        // 参数: params
        RoyaltySettlementCollection objs = RoyaltySettlement.list(params);

        assertEquals("object should be list", "list", objs.getObject());
    }

    /**
     * 更新 royalty_settlement
     */
    @Test
    public void testRoyaltySettlementUpdate() throws VirtuePayException {
        Map<String, Object> params = new HashMap<>();
        params.put("status", "pending"); // 需要更新的状态  [pending, canceled]
        // 更新 royalty_settlement 方法
        // 参数: params
        RoyaltySettlement.update("b555bf10149b4d5aa66294c418da2f37", params);
        // 777c81e79b0b4130bc8440cfccb63485
    }
}
