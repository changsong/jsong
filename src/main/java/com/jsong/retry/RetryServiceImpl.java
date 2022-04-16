package com.jsong.retry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

/**
 * 重試服務
 */
@Service
public class RetryServiceImpl implements RetryService {

    private final static Logger LOGGER = LoggerFactory.getLogger(RetryServiceImpl.class);

    /**
     *  測試重試
     *
     * - value：抛出指定异常才会重试
     * - include：和value一样，默认为空，当exclude也为空时，默认所有异常
     * - exclude：指定不处理的异常
     * - maxAttempts：最大重试次数，默认3次
     * - backoff：重试等待策略，默认使用@Backoff，@Backoff的value默认为1000L，
     * 我们设置为2000L；multiplier（指定延迟倍数）默认为0，表示固定暂停1秒后进行重试，
     * 如果把multiplier设置为1.5，则第一次重试为2秒，第二次为3秒，第三次为4.5秒
     *
     * @param code
     * @return
     * @throws Exception
     */
    @Override
    @Retryable(value = Exception.class,maxAttempts = 3,backoff = @Backoff(delay = 2000, multiplier = 1.5))
    public int testRetry(int code) throws Exception{
        LOGGER.info("testRetry,时间：" + LocalTime.now());
        if (code == 0){
            throw new Exception("出现异常！");
        }
        System.out.println("testRetry 成功调用！");
        return 200;
    }

    /**
     * 用于@Retryable重试失败后处理方法。
     *
     * - 方法的返回值必须与@Retryable方法一致
     * - 方法的第一个参数，必须是Throwable类型的，建议是与@Retryable配置的异常一致，其他的参数，需要哪个参数，写进去就可以了（@Recover方法中有的）
     * - 该回调方法与重试方法写在同一个实现类里面
     *
     * @param e
     * @param code
     * @return
     */
    @Recover
    public int recover(Exception e, int code){
        LOGGER.info("回调方法执行！");
        //记日志到数据库 或者调用其余的方法

        return 400;
    }

}
