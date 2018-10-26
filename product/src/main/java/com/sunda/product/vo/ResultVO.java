package com.sunda.product.vo;

import lombok.Data;

/**
 * Created by 老蹄子 on 2018/10/26 下午4:40
 */
@Data
public class ResultVO<T> {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体内容
     */
    private T data;
}
