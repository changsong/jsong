package com.jsong.javabasic.abstractclass;

public class AbstractDemo
{
    public static void main(String [] args)
    {
        /* 以下是不允许的，会引发错误 */
        // Employee e = new Employee("George W.", "Houston, TX", 43);

        System.out.println("\n Call mailCheck using Employee reference--");
        // e.mailCheck();


        Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);

        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();

        System.out.println("\n Call mailCheck using Employee reference--");
        e.mailCheck();
    }
}
