package com.jsong.algorithm.greatest_common_divisor;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class GreatestCommonDivisor {

    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public int generalizedGCD(int num, int[] arr)
    {
        int result = 1;
        Set<Integer> set = new HashSet<Integer>();
        // 取交集
        for(int i=0; i< arr.length; i ++ ){
           Set<Integer> temp = getFactor(arr[i]);
           set.addAll(temp);
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
