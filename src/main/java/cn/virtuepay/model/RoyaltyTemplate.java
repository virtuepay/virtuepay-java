package cn.virtuepay.model;

import cn.virtuepay.exception.VirtuePayException;
import cn.virtuepay.net.APIResource;
import cn.virtuepay.net.RequestOptions;

import java.util.Map;

public class RoyaltyTemplate extends APIResource {
    String id;
    String object;
    Boolean livemode;
    String app;
    String name;
    Long created;
    String description;
    Map<String, Object> rule;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public Map<String, Object> getRule() {
        return rule;
    }

    public void setRule(Map<String, Object> rule) {
        this.rule = rule;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public Boolean getLivemode() {
        return livemode;
    }

    public void setLivemode(Boolean livemode) {
        this.livemode = livemode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 创建 royalty_template
     *
     * @param params
     * @return RoyaltyTemplate
     * @throws VirtuePayException
     */
    public static RoyaltyTemplate create(Map<String, Object> params) throws VirtuePayException {
        return create(params, null);
    }

    /**
     * 创建 royalty_template
     *
     * @param params
     * @param options the specific options
     * @return RoyaltyTemplate
     * @throws VirtuePayException
     */
    public static RoyaltyTemplate create(Map<String, Object> params, RequestOptions options) throws VirtuePayException {
        return APIResource.request(APIResource.RequestMethod.POST, classURL(RoyaltyTemplate.class), params, RoyaltyTemplate.class, options);
    }

    /**
     * 查询 royalty_template
     *
     * @param id
     * @return RoyaltyTemplate
     * @throws VirtuePayException
     */
    public static RoyaltyTemplate retrieve(String id) throws VirtuePayException {
        return retrieve(id, null);
    }

    /**
     * 查询 royalty_template
     *
     * @param id
     * @param options the specific options
     * @return RoyaltyTemplate
     * @throws VirtuePayException
     */
    public static RoyaltyTemplate retrieve(String id, RequestOptions options) throws VirtuePayException {
        return APIResource.request(APIResource.RequestMethod.GET, instanceURL(RoyaltyTemplate.class, id), null, RoyaltyTemplate.class, options);
    }

    /**
     * 查询 royalty_template 列表
     *
     * @param params
     * @return RoyaltyTemplateCollection
     * @throws VirtuePayException
     */
    public static RoyaltyTemplateCollection list(Map<String, Object> params)
            throws VirtuePayException {
        return list(params, null);
    }

    /**
     * 查询 royalty_template 列表
     *
     * @param params
     * @param options the specific options
     * @return RoyaltyTemplateCollection
     * @throws VirtuePayException
     */
    public static RoyaltyTemplateCollection list(Map<String, Object> params, RequestOptions options)
            throws VirtuePayException {
        return APIResource.request(APIResource.RequestMethod.GET, classURL(RoyaltyTemplate.class), params, RoyaltyTemplateCollection.class, options);
    }

    /**
     * 删除 royalty_template
     *
     * @param id
     * @return DeleteRoyaltyTemplate
     * @throws VirtuePayException
     */
    public static DeleteRoyaltyTemplate delete(String id)
            throws VirtuePayException {
        return delete(id, null);
    }

    /**
     * 删除 royalty_template
     *
     * @param id
     * @param options the specific options
     * @return DeleteRoyaltyTemplate
     * @throws VirtuePayException
     */
    public static DeleteRoyaltyTemplate delete(String id, RequestOptions options)
            throws VirtuePayException {
        return APIResource.request(APIResource.RequestMethod.DELETE, instanceURL(RoyaltyTemplate.class, id), null, DeleteRoyaltyTemplate.class, options);
    }

    /**
     *  更新 royalty_template
     *
     * @param id
     * @return RoyaltyTemplate
     * @throws VirtuePayException
     */
    public static RoyaltyTemplate update(String id, Map<String, Object> params)
            throws VirtuePayException {
        return update(id, params, null);
    }

    /**
     *  更新 royalty_template
     *
     * @param id
     * @param options the specific options
     * @return RoyaltyTemplate
     * @throws VirtuePayException
     */
    public static RoyaltyTemplate update(String id, Map<String, Object> params, RequestOptions options)
            throws VirtuePayException {
        return APIResource.request(APIResource.RequestMethod.PUT, instanceURL(RoyaltyTemplate.class, id), params, RoyaltyTemplate.class, options);
    }
}
