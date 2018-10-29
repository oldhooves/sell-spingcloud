package com.sunda.product.enums;

import lombok.Getter;

/**
 * Created by 老蹄子 on 2018/10/26 下午4:30
 */
@Getter
public enum ResultEnum {


    PRODUCT_NOT_EXIST(1, "商品不存在"),
    PRODUCT_STOCK_ERROR(2, "库存有误"),
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
