package com.sunda.order.vo;

import lombok.Data;

/**
 * Created by 老蹄子 on 2018/10/26 下午9:10
 */
@Data
public class ResultVO<T> {

    private Integer code;

    private String msg;

    private T data;
}
