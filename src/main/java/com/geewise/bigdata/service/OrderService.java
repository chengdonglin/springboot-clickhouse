package com.geewise.bigdata.service;

import com.geewise.bigdata.entity.Order;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author linchengdong
 * @created 2021-01-13 9:39
 */
public interface OrderService {
    BigDecimal getTotalAmountBySkuId(String skuId);
    List<Order> getOrderById(Integer id);
}
