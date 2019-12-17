package com.jsong.disruptor;

import com.lmax.disruptor.EventHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 事件消费处理
 *
 * @author jsong
 *         Date: 2018/8/29 01:43
 * @since JDK 1.8
 */
public class LongEventHandler implements EventHandler<LongEvent> {

    private final static Logger LOGGER = LoggerFactory.getLogger(LongEventHandler.class);

    @Override
    public void onEvent(LongEvent event, long sequence, boolean endOfBatch) throws InterruptedException {
        LOGGER.info("消费 Event=[{}]",event.getValue()) ;
        //Thread.sleep(1000);
    }
}
