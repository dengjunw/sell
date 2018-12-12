package com.dengjunw.dao;

import com.dengjunw.entity.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by dengjunwu on 2018/12/13.
 */
@Repository
public interface ProductInfoDao extends JpaRepository<ProductInfo, String>{

    List<ProductInfo> findByProductStatus(Integer productStatus);
}
