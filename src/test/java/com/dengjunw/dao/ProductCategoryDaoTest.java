package com.dengjunw.dao;

import com.dengjunw.entity.ProductCategory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

/**
 * Created by dengjunwu on 2018/12/13.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductCategoryDaoTest {

    @Autowired
    private ProductCategoryDao productCategoryDao;

    @Test
    public void productCategoryQueryTest(){
        Optional<ProductCategory> productCategory = productCategoryDao.findById(1);
        log.info("result :{}", productCategory);
    }

    @Test
    public void productCategoryAddTest(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("女生最爱");
        productCategory.setCategoryType(1);

        productCategoryDao.save(productCategory);
    }
}