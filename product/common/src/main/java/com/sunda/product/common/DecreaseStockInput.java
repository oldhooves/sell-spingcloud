package com.sunda.product.common;

import lombok.Data;

/**
 * Created by 老蹄子 on 2018/10/29 下午5:27
 */
@Data
public class DecreaseStockInput {

    private String productId;

    private Integer productQuantity;

    public DecreaseStockInput() {
    }

    public DecreaseStockInput(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}


