package com.jsong.orderbook;

import lombok.Data;

import java.math.BigDecimal;

/**
 * OrderBook类
 * @author changsong
 */
@Data
public class OrderBook{


    /**
     * 交易所
     */
    private String exchange;

    /**
     * 价格
     */
    private BigDecimal price;
    /**
     * 数量
     */
    private BigDecimal count;
    /**
     * 总量
     */
    private BigDecimal SumOfCount;

}
