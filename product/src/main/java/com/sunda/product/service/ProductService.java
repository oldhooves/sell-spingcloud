package com.sunda.product.service;

import com.sunda.product.dataobject.ProductInfo;

import java.util.List;

/**
 * Created by 老蹄子 on 2018/10/26 下午4:57
 */
public interface ProductService {

    /**
     * 查询所有在架商品列表
     */
    List<ProductInfo> findUpAll();

}
