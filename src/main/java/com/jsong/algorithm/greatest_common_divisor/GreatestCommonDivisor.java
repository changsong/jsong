package com.jsong.algorithm.greatest_common_divisor;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * The greatest common divisor (GCD),
 * also called highest common factor (HCF) of N numbers is the largest positive integer
 * that divides all numbers without giving a remainder.
 * Write an algorithm to determine the GCD of N positive integers.
 *
 * 最大公约数（GCD）又称N个数的最大公约数（HCF），
 * 是不求余数而将所有数相除的最大正整数，
 * 编写一个算法来确定N个正整数的GCD。
 *
 */
public class GreatestCommonDivisor {

    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public int generalizedGCD(int num, int[] arr)
    {
        // {2,3,4,5,6};
        int result = 1;
        Set<Integer> set = new HashSet<Integer>();
        // 取交集
        for(int i=0; i< arr.length; i ++ ){
           Set<Integer> temp = getFactor(arr[i]);
           if(set.size() == 0){
               set.addAll(temp);
           }
           set.retainAll(temp);
        }
        // 取最大
        System.out.println(set.toString());
        result = Collections.max(set);
        System.out.println(result);
        return result;
    }

    private static Set<Integer> getFactor(int m) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 1; i <= m; i++) {
            if (m % i == 0) {
                set.add(i);
            }
        }
        return set;
    }
}
