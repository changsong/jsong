package com.jsong.asserttest;

import com.google.common.collect.Lists;
import org.springframework.util.Assert;

import java.util.List;

/**
 * @author changsong
 */
public class AssertTest {

    public List<String> demo(AssertParam dParam) {
        Assert.isTrue(dParam.validate(dParam), "参数验证失败-" + AssertParam.class.getSimpleName() +"验证失败：" + dParam);
        List<String> demoResult = Lists.newArrayList();
        // doSomething();
        return demoResult;
    }
}
