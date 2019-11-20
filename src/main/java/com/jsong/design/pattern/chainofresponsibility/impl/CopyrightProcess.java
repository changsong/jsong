package com.jsong.design.pattern.chainofresponsibility.impl;

import com.jsong.design.pattern.chainofresponsibility.Process;

/**
 * Function:
 *
 * @author jsong
 *         Date: 2018/10/21 23:56
 * @since JDK 1.8
 */
public class CopyrightProcess implements Process {

    @Override
    public void doProcess(String msg) {
        System.out.println(msg + "版权处理");
    }
}
