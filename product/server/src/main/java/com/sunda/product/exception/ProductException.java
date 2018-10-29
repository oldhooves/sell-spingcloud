package com.sunda.product.exception;

import com.sunda.product.enums.ResultEnum;

/**
 * Created by 老蹄子 on 2018/10/26 下午4:31
 */
public class ProductException extends RuntimeException {

    private Integer code;

    public ProductException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public ProductException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
