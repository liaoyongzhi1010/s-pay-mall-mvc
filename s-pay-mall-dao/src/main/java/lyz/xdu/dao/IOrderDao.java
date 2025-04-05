package lyz.xdu.dao;

import lyz.xdu.domain.po.PayOrder;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IOrderDao {
    void insert(PayOrder payOrder);

    PayOrder queryUnPayOrder(PayOrder payOrder);

}
