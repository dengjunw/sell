package com.dengjunw;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by dengjunwu on 2018/12/12.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {

    @Test
    public void testLog(){
        log.debug("name:{}",    "debug name");
        log.info("name:{}",     "info name");
        log.warn("name:{}",     "warn name");
        log.error("name:{}",    "error name");
    }
}
