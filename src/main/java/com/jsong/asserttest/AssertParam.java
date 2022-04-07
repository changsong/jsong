package com.jsong.asserttest;

import org.springframework.util.Assert;

public class AssertParam {

    private String param;

    public AssertParam(String param) {
        Assert.hasText(param, "param must not be null or empty");
        this.param = param;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    @Override
    public String toString() {
        return "AssertParam [param=" + param + "]";
    }

    public boolean validate(AssertParam dParam) {
        return true;
    }
}
