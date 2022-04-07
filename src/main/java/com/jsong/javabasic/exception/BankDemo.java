package com.jsong.javabasic.exception;

import lombok.extern.slf4j.Slf4j;

/**
 * 模拟自定义异常
 */
@Slf4j
public class BankDemo {
    public static void main(String [] args)
    {
        CheckingAccount c = new CheckingAccount(101);
        log.info("Depositing $500...");
        c.deposit(500.00);
        try
        {
            log.info("\nWithdrawing $100...");
            c.withdraw(100.00);

            log.info("\nWithdrawing $600...");
            c.withdraw(600.00);
        }catch(InsufficientFundsException e) {
            log.error("Sorry, but you are short $" + e.getAmount(), e);
            e.printStackTrace();
        }
    }
}
