package com.geewise.bigdata.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author linchengdong
 * @created 2021-01-13 15:24
 */
@Data
public class Order {
    private Integer id;
    private String skuId;
    private BigDecimal totalAmount;
    private Date createTime;
}
