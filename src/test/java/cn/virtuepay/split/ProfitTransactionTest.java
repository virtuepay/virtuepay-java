package cn.virtuepay.split;

import cn.virtuepay.exception.VirtuePayException;
import cn.virtuepay.model.ProfitTransactionCollection;
import cn.virtuepay.VirtuePayTestBase;
import cn.virtuepay.VirtuePayTestData;
import cn.virtuepay.model.ProfitTransaction;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class ProfitTransactionTest extends VirtuePayTestBase {

    @Test public void testListAll() throws VirtuePayException {
        Map<String, Object> params = new HashMap<>();
        params.put("app", VirtuePayTestData.getAppID());
        params.put("page", 1);
        params.put("per_page", 3);
        ProfitTransactionCollection obj = ProfitTransaction.list(params);

        System.out.println(obj);

        assertEquals("list", obj.getObject());
        assertEquals("profit_transaction", obj.getData().get(0).getObject());
    }

    @Test public void testRetrieve() throws VirtuePayException {
        ProfitTransaction obj  = ProfitTransaction.retrieve("ptxn_1m3xtoBMRqu2qC");

        System.out.println(obj);

        assertEquals("profit_transaction", obj.getObject());
    }
}
