package cn.virtuepay.model;

import cn.virtuepay.exception.VirtuePayException;
import cn.virtuepay.net.APIResource;
import cn.virtuepay.net.RequestOptions;
import cn.virtuepay.net.SubAppBasedResource;

import java.util.Map;

public class Channel extends SubAppBasedResource {
    String object;
    Long created;
    String channel;
    Boolean banned;
    String bannedMsg;
    String description;
    Map<String, Object> params;

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public Boolean getBanned() {
        return banned;
    }

    public void setBanned(Boolean banned) {
        this.banned = banned;
    }

    public String getBannedMsg() {
        return bannedMsg;
    }

    public void setBannedMsg(String bannedMsg) {
        this.bannedMsg = bannedMsg;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }

    /**
     * 创建渠道参数
     *
     * @param subAppId
     * @param params
     * @return Channel
     * @throws VirtuePayException
     */
    public static Channel create(String subAppId, Map<String, Object>params)
            throws VirtuePayException {
        return create(subAppId, params, null);
    }

    /**
     * 创建渠道参数
     *
     * @param subAppId
     * @param params
     * @param options the specific options
     * @return Channel
     * @throws VirtuePayException
     */
    public static Channel create(String subAppId, Map<String, Object>params, RequestOptions options)
            throws VirtuePayException {
        return APIResource.request(APIResource.RequestMethod.POST, classURL(Channel.class, subAppId), params, Channel.class, options);
    }

    /**
     * 查询渠道参数
     *
     * @param subAppId
     * @param channel
     * @return Channel
     * @throws VirtuePayException
     */
    public static Channel retrieve(String subAppId, String channel)
            throws VirtuePayException {
        return retrieve(subAppId, channel, null);
    }


    /**
     * 查询渠道参数
     *
     * @param subAppId
     * @param channel
     * @param options the specific options
     * @return Channel
     * @throws VirtuePayException
     */
    public static Channel retrieve(String subAppId, String channel, RequestOptions options)
            throws VirtuePayException {
        return APIResource.request(APIResource.RequestMethod.GET, instanceURL(Channel.class, subAppId, channel), null, Channel.class, options);
    }

    /**
     * 更新渠道参数
     *
     * @param subAppId
     * @param channel
     * @param params
     * @return Channel
     * @throws VirtuePayException
     */
    public static Channel update(String subAppId, String channel, Map<String, Object>params)
            throws VirtuePayException {
        return update(subAppId, channel, params, null);
    }

    /**
     * 更新渠道参数
     *
     * @param subAppId
     * @param channel
     * @param params
     * @param options the specific options
     * @return Channel
     * @throws VirtuePayException
     */
    public static Channel update(String subAppId, String channel, Map<String, Object>params, RequestOptions options)
            throws VirtuePayException {
        return APIResource.request(APIResource.RequestMethod.PUT, instanceURL(Channel.class, subAppId, channel), params, Channel.class, options);
    }

    /**
     * 删除渠道参数
     *
     * @param subAppId
     * @param channel
     * @return DeletedChannel
     * @throws VirtuePayException
     */
    public static DeletedChannel delete(String subAppId, String channel)
            throws VirtuePayException {
        return delete(subAppId, channel, null);
    }

    /**
     * 删除渠道参数
     *
     * @param subAppId
     * @param channel
     * @param options the specific options
     * @return DeletedChannel
     * @throws VirtuePayException
     */
    public static DeletedChannel delete(String subAppId, String channel, RequestOptions options)
            throws VirtuePayException {
        return APIResource.request(APIResource.RequestMethod.DELETE, instanceURL(Channel.class, subAppId, channel), null, DeletedChannel.class, options);
    }
}
