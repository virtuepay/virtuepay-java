package cn.virtuepay.balance;

import cn.virtuepay.exception.VirtuePayException;
import cn.virtuepay.model.BalanceTransferCollection;
import cn.virtuepay.VirtuePayTestBase;
import cn.virtuepay.model.BalanceTransfer;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class BalanceTransferTest extends VirtuePayTestBase {
    /**
     * 创建 balance_transfer
     */
    @Test
    public void testBalanceTransfer() throws VirtuePayException {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("user", "test_user_001");
        params.put("recipient", "test_user_003");
        params.put("amount", 10);
        params.put("order_no", "2017" + System.currentTimeMillis());
        params.put("description", "Balance transfer description.");

        // 创建 balance_transfer 方法
        // 参数: params
        BalanceTransfer obj = BalanceTransfer.create(params);

        assertEquals("object should be balance_transfer", "balance_transfer", obj.getObject());
    }

    /**
     * 查询单个 balance_transfer
     */
    @Test public void testBalanceTransferRetrieve() throws VirtuePayException {

        // 查询单个 balance_transfer 方法
        // 参数: balance_transfer id
        BalanceTransfer obj = BalanceTransfer.retrieve("660170821690361139200002");

        assertEquals("object should be balance_transfer", "balance_transfer", obj.getObject());
    }

    /**
     * 查询 balance_transfer 列表
     */
    @Test public void testBalanceTransferList() throws VirtuePayException {
        Map<String, Object> params = new HashMap<>();
        params.put("page", 1);
        params.put("per_page", 10);
        // 查询 balance_transfer 列表方法
        // 参数: params
        BalanceTransferCollection objs = BalanceTransfer.list(params);

        assertEquals("object should be list", "list", objs.getObject());
    }
}
