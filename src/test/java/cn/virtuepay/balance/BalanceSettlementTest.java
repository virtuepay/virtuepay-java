package cn.virtuepay.balance;

import cn.virtuepay.exception.VirtuePayException;
import cn.virtuepay.model.BalanceSettlementCollection;
import cn.virtuepay.VirtuePayTestBase;
import cn.virtuepay.VirtuePayTestData;
import cn.virtuepay.model.BalanceSettlement;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class BalanceSettlementTest extends VirtuePayTestBase {
    /**
     * 查询单个结算到余额
     */
    @Test
    public void testRetrieve() throws VirtuePayException {

        // 查询单个 balance_settlement 方法
        // 参数: balance_settlement id
        BalanceSettlement obj = BalanceSettlement.retrieve("670180130750711562240001");
        System.out.println(obj);
        assertEquals("object should be balance_settlement", "balance_settlement", obj.getObject());
    }

    /**
     * 查询结算到余额列表
     */
    @Test
    public void testList() throws VirtuePayException {
        Map<String, Object> params = new HashMap<>();
        params.put("page", 1);
        params.put("per_page", 3);
        params.put("user", VirtuePayTestData.userId);
        // 查询 balance_settlement 列表方法
        // 参数: params
        BalanceSettlementCollection objs = BalanceSettlement.list(params);
        System.out.println(objs);

        assertEquals("object should be list", "list", objs.getObject());
    }
}
