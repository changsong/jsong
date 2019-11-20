package com.jsong.proxy.jdk.impl;

import com.jsong.proxy.jdk.ISubject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Function:
 *
 * @author jsong
 *         Date: 23/12/2017 22:43
 * @since JDK 1.8
 */
public class ISubjectImpl implements ISubject {
    private final static Logger LOGGER = LoggerFactory.getLogger(ISubjectImpl.class);
    /**
     * 执行
     */
    @Override
    public void execute() {
        LOGGER.info("ISubjectImpl execute");
    }
}
