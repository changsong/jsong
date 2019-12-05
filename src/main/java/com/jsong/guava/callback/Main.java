package com.jsong.guava.callback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Function:
 *
 * @author jsong
 *         Date: 2018/7/15 14:18
 * @since JDK 1.8
 */
public class Main {

    private final static Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Notifier notifier = new Notifier() ;

        Caller caller = new Caller() ;
        caller.setNotifier(notifier) ;
        caller.setQuestion("where are you ?");
        caller.setCallBackListener(new CallBackListener() {
            @Override
            public void callBackNotify(String msg) {
                LOGGER.info("replay ={}" ,msg);
            }
        });

        caller.call();
    }
}
