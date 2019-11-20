package com.jsong.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Function:
 *
 * @author jsong
 *         Date: 20/03/2018 18:23
 * @since JDK 1.8
 */
public class SpringLifeCycle{

    private final static Logger LOGGER = LoggerFactory.getLogger(SpringLifeCycle.class);
    public void start(){
        LOGGER.info("SpringLifeCycle start");
    }


    public void destroy(){
        LOGGER.info("SpringLifeCycle destroy");
    }
}
