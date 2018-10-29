package com.sunda.order.enums;

import lombok.Getter;

/**
 * Created by 老蹄子 on 2018/10/26 下午9:07
 */
@Getter
public enum ResultEnum {

    PARAM_ERROR(1, "参数错误"),
    CART_EMPTY(2, "购物车为空")
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
