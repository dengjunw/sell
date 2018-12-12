package com.dengjunw.dao;

import com.dengjunw.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by dengjunwu on 2018/12/13.
 */
@Repository
public interface ProductCategoryDao extends JpaRepository<ProductCategory, Integer>{

}
