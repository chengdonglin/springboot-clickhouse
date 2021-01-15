package com.geewise.bigdata.mapper;

import com.geewise.bigdata.entity.Order;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author linchengdong
 * @created 2021-01-13 9:28
 */
public interface OrderMapper {
    BigDecimal selectTotalAmountSkuId(String skuId);
    List<Order> selectOrder(Integer Id);
}
