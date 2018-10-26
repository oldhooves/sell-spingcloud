package com.sunda.product.enums;

import lombok.Getter;

/**
 * Created by 老蹄子 on 2018/10/26 下午4:26
 */
@Getter
public enum ProductStatusEnum {
    UP(0, "在架"),
    DOWN(1, "下架"),
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
