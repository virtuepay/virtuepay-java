package cn.virtuepay.agreement;

import cn.virtuepay.VirtuePayTestBase;
import cn.virtuepay.VirtuePayTestData;
import cn.virtuepay.exception.InvalidRequestException;
import cn.virtuepay.exception.VirtuePayException;
import cn.virtuepay.model.Agreement;
import cn.virtuepay.model.AgreementCollection;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AgreenmentTest extends VirtuePayTestBase {

    @Test
    public void testCreate() throws VirtuePayException {
        Map<String, Object> params = new HashMap<>();
        params.put("app", VirtuePayTestData.getAppID()); // App ID
        params.put("contract_no", "2018051700001"); // 签约协议号
        params.put("channel", "qpay"); // 签约渠道
        Map<String, Object> extra = new HashMap<>();
        extra.put("display_account", "签约测试"); // 可选，签约用户的名称，用于页面展示，如商户侧账号，昵称。
        params.put("extra", extra);
        Map<String, Object> metadata = new HashMap<>();
        params.put("metadata", metadata); // metadata 元数据

        Agreement agreement;
        try {
            agreement = Agreement.create(params);

            assertEquals("object should be agreement", "agreement", agreement.getObject());
        } catch (InvalidRequestException e) {
            assertTrue("error message should be", e.getMessage().contains("该签约协议号 2018051700001 在 qpay 渠道下已使用。请用新的签约协议号发起签约。"));
        }
    }

    @Test
    public void testRetrieve() throws VirtuePayException {
        String id = "agr_19EEE7QdgGMCoY";
        Agreement agreement = Agreement.retrieve(id);

        assertEquals("object should be agreement", "agreement", agreement.getObject());
        assertEquals("object id should be", id, agreement.getId());
    }

    @Test
    public void testList() throws VirtuePayException {
        Map<String, Object> params = new HashMap<>();
        params.put("per_page", 3); // 每页数量
        params.put("app", VirtuePayTestData.getAppID()); // App ID 此参数必填

        AgreementCollection objs = Agreement.list(params);

        assertEquals("object should be list", "list", objs.getObject());
    }

    @Test
    public void testCancel() throws VirtuePayException {
        String id = "agr_19EEE7QdgGMCoY";

        Agreement agreement;

        try {
            agreement = Agreement.cancel(id);

            assertEquals("object should be agreement", "agreement", agreement.getObject());
            assertEquals("object id should be", id, agreement.getId());
            assertEquals("object status should be", "canceled", agreement.getStatus());
        } catch (InvalidRequestException e) {
            assertTrue("error message should be", e.getMessage().contains("该签约对象不能被更新状态。") && e.getMessage().contains("当前的状态为：canceled。"));
        }
    }
}
