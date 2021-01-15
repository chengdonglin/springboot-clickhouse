package com.geewise.bigdata.controller;

import com.geewise.bigdata.entity.Order;
import com.geewise.bigdata.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author linchengdong
 * @created 2021-01-13 9:41
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/{skuId}")
    public BigDecimal getAmountBySkuId(
            @PathVariable(name = "skuId", required = true) String skuId
    ){
        return orderService.getTotalAmountBySkuId(skuId);
    }

    @GetMapping("/detail/{id}")
    public List<Order> getOderBySkuId(
            @PathVariable(name = "id", required = true) Integer id
    ){
        return orderService.getOrderById(id);
    }
}
