package com.jsong.javabasic.exception;

/**
 * 自定义异常类，继承Exception类
 *
 * @author changsong
 */
public class SysException extends Exception
{
    // 此处的amount用来储存当出现异常（取出钱多于余额时）所缺乏的钱
    private double amount;
    // 此处的amount用来储存当出现异常（取出钱多于余额时）所缺乏的钱
    private String message;
    public SysException(double amount)
    {
        this.amount = amount;
    }
    public SysException(String message)
    {
        this.message = message;
    }
    public double getAmount()
    {
        return amount;
    }
}
