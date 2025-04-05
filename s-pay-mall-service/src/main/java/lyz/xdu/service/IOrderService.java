package lyz.xdu.service;

import lyz.xdu.domain.req.ShopCartReq;
import lyz.xdu.domain.res.PayOrderRes;

public interface IOrderService {

    PayOrderRes createOrder(ShopCartReq shopCartReq) throws Exception;

}
