package cn.virtuepay.sub_app;

import cn.virtuepay.exception.VirtuePayException;
import cn.virtuepay.model.SubAppCollection;
import cn.virtuepay.VirtuePayTestBase;
import cn.virtuepay.VirtuePayTestData;
import cn.virtuepay.model.DeletedSubApp;
import cn.virtuepay.model.SubApp;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class SubAppTest extends VirtuePayTestBase {
    /**
     * 创建子商户 app
     */
    @Test
    public void testSubAppCreate() throws VirtuePayException {
        String userId = VirtuePayTestData.userId + "royalty_2";
        String displayName = "royalty_2";

        String parentId = VirtuePayTestData.getAppID();
        parentId = "e16cbf9a945345e6807aa0cc44dc27b3";

        Map<String, Object> params = new HashMap<>();
        params.put("user", userId);
        params.put("display_name", displayName);
        params.put("parent_app", parentId); //父商户应用 ID，必须为平台或者平台下其他的子商户，默认值为平台

        // 创建子商户 app 方法
        // 参数: params
        SubApp obj = SubApp.create(params);
        System.out.println(obj);

        assertEquals("object should be sub_app", "sub_app", obj.getObject());
        assertEquals("user", userId, obj.getUser());
        assertEquals("display_name", displayName, obj.getDisplayName());
    }

    /**
     * 查询子商户 app
     */
    @Test public void testSubAppRetrieve() throws VirtuePayException {
        String subAppId = VirtuePayTestData.getAppID();
        // 查询子商户 app
        // 参数: SubApp id
        SubApp obj = SubApp.retrieve(subAppId);
        System.out.println(obj);
        assertEquals("object should be sub_app", "sub_app", obj.getObject());
        assertEquals("id", subAppId, obj.getId());
    }

    /**
     * 查询子商户 app 列表
     */
    @Test public void testSubAppList() throws VirtuePayException {
        Map<String, Object> params = new HashMap<>();
        params.put("page", 1);
        params.put("per_page", 30);
//        params.put("level", 2);
        params.put("parent_app", VirtuePayTestData.getAppID());
//        params.put("created[gt]", 1624611679000L);
//        params.put("created[gte]", 1624611750000L);
//        params.put("created[lt]", 1624611750000L);
//        params.put("created[lte]", 1624611679000L);
        // 查询子商户 app 列表方法
        // 参数: params
        SubAppCollection objs = SubApp.list(params);
        System.out.println(objs);
        assertEquals("object should be list", "list", objs.getObject());
    }

    /**
     * 更新子商户 app
     */
    @Test public void testSubAppUpdate() throws VirtuePayException {
        String subAppId = "ab412326861b4d75b1f48ae7024aa804";
        Map<String, Object> params = new HashMap<>();
        // 更新子商户 app 方法
        // 参数一: SubApp id
        // 参数二: params
        params.put("display_name", "list_6");
        params.put("description", "test");
        SubApp obj = SubApp.update(subAppId, params);
        System.out.println(obj);

        assertEquals("object should be sub_app", "sub_app", obj.getObject());
    }

    /**
     * 删除子商户 app
     */
    @Test public void testSubAppDelete() throws VirtuePayException {
        String subAppId = "cd6760232d9f4862aecb399094234d26";
        // 删除子商户 app 方法
        // 参数: SubApp id
        DeletedSubApp obj = SubApp.delete(subAppId);
        System.out.println(obj);
        assertEquals("id", subAppId, obj.getId());
    }
}
