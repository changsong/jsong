package com.jsong.retry;

import com.lmax.disruptor.Foo;
import org.springframework.retry.RetryCallback;
import org.springframework.retry.RetryContext;
import org.springframework.retry.policy.SimpleRetryPolicy;
import org.springframework.retry.policy.TimeoutRetryPolicy;
import org.springframework.retry.support.RetryTemplate;

import java.io.IOException;

public class TestRetry {

    public static void main(String[] args) throws Exception {
        RetryTemplate template = new RetryTemplate();

        TimeoutRetryPolicy policy = new TimeoutRetryPolicy();
        policy.setTimeout(30000L);

        SimpleRetryPolicy simpleRetryPolicy = new SimpleRetryPolicy();
        simpleRetryPolicy.setMaxAttempts(4);

        template.setRetryPolicy(simpleRetryPolicy);

        Foo result = template.execute(new RetryCallback<Foo, IOException>() {
            @Override
            public Foo doWithRetry(RetryContext context) {
                // Do stuff that might fail, e.g. webservice operation
                System.out.println("doWithRetry");
                return null;
            }
        });
    }
}
