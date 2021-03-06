package com.topaiebiz.trade.order.dto.customer;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Description 用户端 订单详情DTO
 * <p>
 * Author hxpeng
 * <p>
 * Date 2018/1/12 9:58
 * <p>
 * Copyright Cognieon technology group co.LTD. All rights reserved.
 * <p>
 * Notice 本内容仅限于授权后使用，禁止非授权传阅以及私自用于其他商业目的。
 */
@Data
public class CmOrderPageDetailDTO implements Serializable{

    private static final long serialVersionUID = -1794763783362011621L;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品属性
     */
    private String fieldValue;

    /**
     * 商品数量
     */
    private Integer goodsNum;

    /**
     * 商品原单价
     */
    private BigDecimal goodsPrice;;

    /**
     * 商品实际总价
     */
    private BigDecimal payPrice;

    /**
     * 商品图片
     */
    private String goodsImage;

    /**
     * 售后状态
     */
    private Integer refundState;

    /**
     * 物流公司ID
     */
    private Long expressComId;

    /**
     * 物流公司名称
     */
    private String expressComName;

    /**
     * 单种商品的物流编号，如果分批次发可记录多个
     */
    private String expressNo;

}
