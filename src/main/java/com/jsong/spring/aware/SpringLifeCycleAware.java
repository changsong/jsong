package com.jsong.spring.aware;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Function:
 *
 * @author jsong
 *         Date: 20/03/2018 21:54
 * @since JDK 1.8
 */
@Component
public class SpringLifeCycleAware implements ApplicationContextAware {
    private final static Logger LOGGER = LoggerFactory.getLogger(SpringLifeCycleAware.class);

    private ApplicationContext applicationContext ;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext ;
        LOGGER.info("SpringLifeCycleAware start");
    }
}
