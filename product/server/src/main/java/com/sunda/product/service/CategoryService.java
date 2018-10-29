package com.sunda.product.service;

import com.sunda.product.dataobject.ProductCategory;

import java.util.List;

/**
 * Created by 老蹄子 on 2018/10/26 下午4:56
 */
public interface CategoryService {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

}
