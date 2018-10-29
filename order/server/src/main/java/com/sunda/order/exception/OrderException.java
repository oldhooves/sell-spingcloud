package com.sunda.order.exception;

import com.sunda.order.enums.ResultEnum;

/**
 * Created by 老蹄子 on 2018/10/26 下午9:08
 */
public class OrderException extends RuntimeException {

    private Integer code;

    public OrderException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public OrderException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
