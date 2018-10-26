package com.sunda.product.service.Impl;

import com.sunda.product.dataobject.ProductInfo;
import com.sunda.product.enums.ProductStatusEnum;
import com.sunda.product.repository.ProductInfoRepository;
import com.sunda.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 老蹄子 on 2018/10/26 下午5:04
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }
}
