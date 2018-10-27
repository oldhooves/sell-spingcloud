package com.sunda.order.enums;

import lombok.Getter;

/**
 * Created by 老蹄子 on 2018/10/26 下午9:07
 */
@Getter
public enum PayStatusEnum {

    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),
    ;
    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
