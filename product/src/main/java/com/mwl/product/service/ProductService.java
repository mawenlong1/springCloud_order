package com.mwl.product.service;

import com.mwl.product.bean.ProductInfo;
import org.apache.catalina.LifecycleState;

import java.util.List;

public interface ProductService {
    /**
     * 查询所有在架商品
     */
    List<ProductInfo> findUpAll();
    /**
     * 查询商品列表
     */
    List<ProductInfo> findList(List<String> productIdList);
}