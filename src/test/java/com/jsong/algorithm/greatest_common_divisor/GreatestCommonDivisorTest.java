package com.jsong.algorithm.greatest_common_divisor;

import org.junit.Test;

public class  GreatestCommonDivisorTest {
    /**
     *
     * Testcase 1:
     * Input:[1, 0, 0, 0, 0, 1, 0, 0],
     * Expected Return Value:
     * 0 1 0 0 1 0 1 0
     *
     * Testcase 2:
     * Input:
     * [1, 1, 1, 0, 1, 1, 1, 1], 2
     *
     * Expected Return Value:
     * 0 0 0 0 0 1 1 0
     */
    @Test
    public void test1(){
        int[] inputAr = new int[]{2,3,4,5,6};
        GreatestCommonDivisor greatestCommonDivisor = new GreatestCommonDivisor();
        greatestCommonDivisor.generalizedGCD(5, inputAr);
    }
}
