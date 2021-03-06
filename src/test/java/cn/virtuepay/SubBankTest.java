package cn.virtuepay;

import cn.virtuepay.exception.VirtuePayException;
import cn.virtuepay.model.SubBank;
import cn.virtuepay.model.SubBankCollection;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class SubBankTest extends VirtuePayTestBase {
    /**
     * 银行支行列表查询
     */
    @Test public void testSubBankQuery() throws VirtuePayException {
        Map<String, Object> params = new HashMap<>();
        params.put("app", VirtuePayTestData.getAppID());
        params.put("open_bank_code", "0308"); // 银行开户行编号
        params.put("prov", "浙江省"); // 省份
        params.put("city", "宁波市"); // 城市
        params.put("channel", "chanpay"); // 相关 transfer 渠道

        SubBankCollection obj = SubBank.query(params);

        System.out.println(obj);

        SubBank subBank = obj.getData().get(0);

        assertEquals("list", obj.getObject());
        assertEquals("sub_bank", subBank.getObject());
        assertEquals("浙江省", subBank.getProv());
        assertEquals("宁波市", subBank.getCity());
    }
}
