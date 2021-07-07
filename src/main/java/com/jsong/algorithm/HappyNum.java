package com.jsong.algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * Function: 判断一个数字是否为快乐数字 19 就是快乐数字  11就不是快乐数字
 *
 * 快乐数（happy number）有以下的特性：
 * 在给定的进位制下，该数字所有数位(digits)的平方和，得到的新数再次求所有数位的平方和，如此重复进行，最终结果必为1。
 *
 * 19
 * 1*1+9*9=82
 * 8*8+2*2=68
 * 6*6+8*8=100
 * 1*1+0*0+0*0=1
 *
 * 11
 * 1*1+1*1=2
 * 2*2=4
 * 4*4=16
 * 1*1+6*6=37
 * 3*3+7*7=58
 * 5*5+8*8=89
 * 8*8+9*9=145
 * 1*1+4*4+5*5=42
 * 4*4+2*2=20
 * 2*2+0*0=2
 *
 * 这里结果 1*1+1*1=2 和 2*2+0*0=2 重复，所以不是快乐数字
 * 所有不快乐数的数位平方和计算，最後都会进入 4 → 16 → 37 → 58 → 89 → 145 → 42 → 20 → 4 的循环中。
 *
 * @author jsong
 *         Date: 04/01/2018 14:12
 * @since JDK 1.8
 */
public class HappyNum {

    /**
     * 判断一个数字是否为快乐数字
     * @param number
     * @return
     */
    public boolean isHappy(int number) {
        Set<Integer> set = new HashSet<>(30);
        while (number != 1) {
            int sum = 0;
            while (number > 0) {
                //计算当前值的每位数的平方 相加的和 在放入set中，如果存在相同的就认为不是 happy数字
                sum += (number % 10) * (number % 10);
                number = number / 10;
            }
            if (set.contains(sum)) {
                return false;
            } else {
                set.add(sum);
            }
            number = sum;
        }
        return true;
    }


    public static void main(String[] args) {
        int num = 345;
        int i = num % 10;
        int i1 = num / 10;
        int i2 = i1 / 10;
        System.out.println(i);
        System.out.println(i1);
        System.out.println(i2);
    }
}
