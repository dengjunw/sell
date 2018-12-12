package com.dengjunw.dao.product_info;

import com.dengjunw.dao.ProductInfoDao;
import com.dengjunw.entity.ProductInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

/**
 * Created by dengjunwu on 2018/12/13.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductInfoDaoTest {

    @Autowired
    private ProductInfoDao productInfoDao;

    @Test
    public void productInfoAddTest(){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("1");
        productInfo.setProductName("香蕉");
        productInfo.setProductPrice(new BigDecimal(8.9));
        productInfo.setProductStock(1000);
        productInfo.setProductDescription("好吃不贵");
        productInfo.setProductIcon("http://pic.shangdao.xin/123234.jpg");
        productInfo.setCategoryType(1);
        productInfo.setProductStatus(0);

        productInfoDao.save(productInfo);
    }
}