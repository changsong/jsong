package com.jsong.retry;

import com.jsong.Application;
import lombok.SneakyThrows;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * GatewayManagement接口黑盒测试类
 * @author KevinHuangwl
 *
 */
@SpringBootTest(classes = Application.class)
@RunWith(MockitoJUnitRunner.class)
public class RetryServiceTest {

    @Mock
    private RetryServiceImpl retryService;

    @Test
    public void testRetry() {
        try {
            retryService.testRetry(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
