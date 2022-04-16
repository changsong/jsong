package com.jsong.amap;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;


public class AmapTest {

    private final static Logger LOGGER = LoggerFactory.getLogger(AmapTest.class);

    // /**
    //  *  注入接口实例
    //  */
    // @Autowired
    // private AmapClient amapClient;

    /**
     * 取得地址
     *
     * @param longitude
     * @param latitude
     * @return
     */
    Map getLocation(String longitude, String latitude){
        // // 调用接口
        // Map result = amapClient.getLocation("121.475078", "31.223577");
        Map result = null;
        LOGGER.info(JSON.toJSONString(result));
        return result;
    }

}
