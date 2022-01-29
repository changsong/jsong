package com.jsong;

import com.dtflys.forest.springboot.annotation.ForestScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author jsong
 *
 */
@SpringBootApplication
@ForestScan(basePackages = "com.jsong.amap")
public class Application {

    private final static Logger LOGGER = LoggerFactory.getLogger(Application.class);


    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
        LOGGER.info("start ok!");

    }

}
