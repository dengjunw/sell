package com.dengjunw.service.impl;

import com.dengjunw.dao.ProductInfoDao;
import com.dengjunw.entity.ProductInfo;
import com.dengjunw.enums.ProductStatus;
import com.dengjunw.service.ProductInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dengjunwu on 2018/12/13.
 */
@Slf4j
@Service
public class ProductInfoServiceImpl implements ProductInfoService{

    @Autowired
    private ProductInfoDao productInfoDao;

    @Override
    public List<ProductInfo> findUpProduct() {
        return productInfoDao.findByProductStatus(ProductStatus.UP.getStatus());
    }
}
