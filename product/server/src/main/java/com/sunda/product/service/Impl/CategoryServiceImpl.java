package com.sunda.product.service.Impl;

import com.sunda.product.dataobject.ProductCategory;
import com.sunda.product.repository.ProductCategoryRepository;
import com.sunda.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 老蹄子 on 2018/10/26 下午5:03
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return productCategoryRepository.findByCategoryTypeIn(categoryTypeList);
    }
}
