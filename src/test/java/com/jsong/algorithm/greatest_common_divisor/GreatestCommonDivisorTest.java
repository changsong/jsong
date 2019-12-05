package com.jsong.algorithm.greatest_common_divisor;

import org.junit.Test;

public class  GreatestCommonDivisorTest {
    /**
     * Testcase 1:
     */
    @Test
    public void test1(){
        int[] inputAr = new int[]{2,3,4,5,6};
        GreatestCommonDivisor greatestCommonDivisor = new GreatestCommonDivisor();
        greatestCommonDivisor.generalizedGCD(5, inputAr);


        inputAr = new int[]{2,4,8,16};
        greatestCommonDivisor.generalizedGCD(4, inputAr);

        inputAr = new int[]{4,8,16,42};
        greatestCommonDivisor.generalizedGCD(4, inputAr);
    }
}
