package cn.virtuepay.model;

import cn.virtuepay.exception.VirtuePayException;
import cn.virtuepay.net.APIResource;
import cn.virtuepay.net.AppBasedResource;
import cn.virtuepay.net.RequestOptions;

import java.util.Map;

public class RechargeRefund extends AppBasedResource {
    /**
     * 创建 recharge_refund
     *
     * @param rechargeId
     * @param params
     * @return Refund
     * @throws VirtuePayException
     */
    public static Refund create(String rechargeId, Map<String, Object> params)
            throws VirtuePayException {
        return create(rechargeId, params, null);
    }

    /**
     * 创建 recharge_refund
     *
     * @param rechargeId
     * @param params
     * @param options the specific options
     * @return Refund
     * @throws VirtuePayException
     */
    public static Refund create(String rechargeId, Map<String, Object> params, RequestOptions options)
            throws VirtuePayException {
        return APIResource.request(APIResource.RequestMethod.POST, String.format("%s/refunds", instanceURL(Recharge.class, rechargeId)),
                params, Refund.class, options);
    }

    /**
     * 查询 recharge_refund
     *
     * @param rechargeId
     * @param refundId
     * @return Refund
     * @throws VirtuePayException
     */
    public static Refund retrieve(String rechargeId, String refundId)
            throws VirtuePayException {
        return retrieve(rechargeId, refundId, null);
    }

    /**
     * 查询 recharge_refund
     *
     * @param rechargeId
     * @param refundId
     * @param options the specific options
     * @return Refund
     * @throws VirtuePayException
     */
    public static Refund retrieve(String rechargeId, String refundId, RequestOptions options)
            throws VirtuePayException {
        return APIResource.request(APIResource.RequestMethod.GET, String.format("%s/refunds/%s", instanceURL(Recharge.class, rechargeId), refundId),
                null, Refund.class, options);
    }

    /**
     * 查询 recharge_refund 列表
     *
     * @param rechargeId
     * @return RechargeRefundCollection
     * @throws VirtuePayException
     */
    public static RechargeRefundCollection list(String rechargeId)
            throws VirtuePayException {
        return list(rechargeId, null, null);
    }

    /**
     * 查询 recharge_refund 列表
     *
     * @param rechargeId
     * @param options the specific options
     * @return RechargeRefundCollection
     * @throws VirtuePayException
     */
    public static RechargeRefundCollection list(String rechargeId, RequestOptions options)
            throws VirtuePayException {
        return list(rechargeId, null, options);

    }

    /**
     * 查询 recharge_refund 列表
     *
     * @param rechargeId
     * @param params
     * @return RechargeRefundCollection
     * @throws VirtuePayException
     */
    public static RechargeRefundCollection list(String rechargeId, Map<String, Object>params)
            throws VirtuePayException {
        return list(rechargeId, params, null);
    }

    /**
     * 查询 recharge_refund 列表
     *
     * @param rechargeId
     * @param params
     * @param options the specific options
     * @return RechargeRefundCollection
     * @throws VirtuePayException
     */
    public static RechargeRefundCollection list(String rechargeId, Map<String, Object>params, RequestOptions options)
            throws VirtuePayException {
        return APIResource.request(APIResource.RequestMethod.GET, String.format("%s/refunds", instanceURL(Recharge.class, rechargeId)),
                params, RechargeRefundCollection.class, options);
    }
}
