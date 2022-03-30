package cn.virtuepay.model;

import cn.virtuepay.exception.VirtuePayException;
import cn.virtuepay.net.APIResource;
import cn.virtuepay.net.RequestOptions;

import java.util.Map;

public class OrderRefund extends APIResource {

    /**
     * 创建 order_refund
     *
     * @param orderId
     * @param params
     * @return OrderRefundCollection
     * @throws VirtuePayException
     */
    public static OrderRefundCollection create(String orderId, Map<String, Object> params)
            throws VirtuePayException {
        return create(orderId, params, null);
    }

    /**
     * 创建 order_refund
     *
     * @param orderId
     * @param params
     * @param options the specific options
     * @return OrderRefundCollection
     * @throws VirtuePayException
     */
    public static OrderRefundCollection create(String orderId, Map<String, Object> params, RequestOptions options)
            throws VirtuePayException {
        return APIResource.request(APIResource.RequestMethod.POST, String.format("%s/order_refunds", instanceURL(Order.class, orderId)),
                params, OrderRefundCollection.class, options);
    }

    /**
     * 查询 order_refund
     *
     * @param orderId
     * @param refundId
     * @return Refund
     * @throws VirtuePayException
     */
    public static Refund retrieve(String orderId, String refundId)
            throws VirtuePayException {
        return retrieve(orderId, refundId, null);
    }

    /**
     * 查询 order_refund
     *
     * @param orderId
     * @param refundId
     * @param options the specific options
     * @return Refund
     * @throws VirtuePayException
     */
    public static Refund retrieve(String orderId, String refundId, RequestOptions options)
            throws VirtuePayException {
        return APIResource.request(APIResource.RequestMethod.GET, String.format("%s/order_refunds/%s", instanceURL(Order.class, orderId), refundId),
                null, Refund.class, options);
    }

    /**
     * 查询 order_refund 列表
     *
     * @param orderId
     * @param params
     * @return OrderRefundCollection
     * @throws VirtuePayException
     */
    public static OrderRefundCollection list(String orderId, Map<String, Object>params)
            throws VirtuePayException {
        return list(orderId, params, null);
    }

    /**
     * 查询 order_refund 列表
     *
     * @param orderId
     * @return OrderRefundCollection
     * @throws VirtuePayException
     */
    public static OrderRefundCollection list(String orderId)
            throws VirtuePayException {
        return list(orderId, null, null);
    }

    /**
     * 查询 order_refund 列表
     *
     * @param orderId
     * @param options the specific options
     * @return OrderRefundCollection
     * @throws VirtuePayException
     */
    public static OrderRefundCollection list(String orderId, RequestOptions options)
            throws VirtuePayException {
        return list(orderId, null, options);
    }

    /**
     * 查询 order_refund 列表
     *
     * @param orderId
     * @param params
     * @param options the specific options
     * @return OrderRefundCollection
     * @throws VirtuePayException
     */
    public static OrderRefundCollection list(String orderId, Map<String, Object>params, RequestOptions options)
            throws VirtuePayException {
        return APIResource.request(APIResource.RequestMethod.GET, String.format("%s/order_refunds", instanceURL(Order.class, orderId)),
                params, OrderRefundCollection.class, options);
    }
}
