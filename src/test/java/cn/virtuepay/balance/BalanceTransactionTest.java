package cn.virtuepay.balance;

import cn.virtuepay.exception.VirtuePayException;
import cn.virtuepay.XPayTestBase;
import cn.virtuepay.model.BalanceTransaction;
import cn.virtuepay.model.BalanceTransactionCollection;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class BalanceTransactionTest extends XPayTestBase {
    /**
     * 查询单个余额明细 (balance_transaction)
     */
    @Test
    public void testBalanceTransactionRetrieve() throws VirtuePayException {

        // 查询单个 balance_transaction 方法
        // 参数: balance_transaction id
        BalanceTransaction obj = BalanceTransaction.retrieve("53579106521089");
        System.out.println(obj);
        assertEquals("object should be balance_transaction", "balance_transaction", obj.getObject());
    }

    /**
     * 查询余额明细 (balance_transaction) 列表
     */
    @Test public void testBalanceTransactionList() throws VirtuePayException {
        Map<String, Object> params = new HashMap<>();
        params.put("page", 1);
        params.put("per_page", 3);
        // 查询 balance_transaction 列表方法
        // 参数: params
        BalanceTransactionCollection objs = BalanceTransaction.list(params);
        System.out.println(objs);

        assertEquals("object should be list", "list", objs.getObject());
    }
}
