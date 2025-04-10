package lyz.xdu.service;

import lyz.xdu.domain.req.ShopCartReq;
import lyz.xdu.domain.res.PayOrderRes;

import java.util.List;

public interface IOrderService {

    PayOrderRes createOrder(ShopCartReq shopCartReq) throws Exception;

    void changeOrderPaySuccess(String orderId);

    List<String> queryNoPayNotifyOrder();

    List<String> queryTimeoutCloseOrderList();

    boolean changeOrderClose(String orderId);

}
