package com.jsong.algorithm.bitwise;

import java.util.ArrayList;
import java.util.List;

/**
 * Eight houses, represented as cells, are arranged in a straight line.
 * Each day every cell competes with its adjacent cells (neighbors).
 * An integer value of 1 represents an active cell and a value of 0 represents an inactive cell.
 * If the neighbors on both the sides of a cell are either active or inactive, the cell becomes inactive on the next day;
 * otherwise the cell becomes active. The two cells on each end have a single adjacent cell,
 * so assume that the unoccupied space on the opposite side is an inactive cell.
 * Even after updating the cell state, consider its previous state when updating the state of other cells.
 * The state information of all cells should be updated simultaneously.
 * Write an algorithm to output the state of the cells after the given number of days.days an integer representing the number of days.
 *
 * Input:
 * The input to the function/method consists of two arguments:
 * states, a list of integers representing the current state of cells;
 * days, an integer representing the number of days.
 *
 * OutPut:
 * Return a list of integers representing the state of the cells after the given number of days.
 *
 * Note:
 * The elements of the list ;contains 0s and 1s only.
 *
 * 八间房屋，以单元为代表，排列成一条直线。
 * 每天每一个细胞都与其相邻的细胞（邻居）竞争。
 * 整数值1表示活动单元格，值0表示非活动单元格。如果单元格两侧的邻居处于活动状态或非活动状态，
 * 则该单元格在第二天将变为非活动状态；否则，该单元格将变为活动状态两端的两个单元都有一个相邻的单元，
 * 因此假设对面的未占用空间是一个不活动的单元。
 * 即使在更新单元状态之后，在更新其他单元的状态时也要考虑其先前的状态。所有单元格的状态信息应同时更新。编写算法以输出给定天数后单元格的状态
 *
 * 表示天数的整数。
 * 返回表示给定天数后单元格状态的整数列表。
 *
 *
 * 列表中的元素仅包含0和1。
 */
public class HouseRoom {

    /**
     *
     *
     * @param states
     * @param days
     * @return
     */
    public List<Integer> cellCompete(int[] states, int days)
    {
        double num = 0;
        for(int i =0 ;i< states.length; i++){
            num = num + states[states.length - i - 1] * Math.pow(2, i);
        }
        System.out.println(num);
        int byteNum = new Double(num).intValue();
        for(int i = 0 ; i < days; i ++){
            byteNum = editNum(byteNum);
        }

        System.out.println("result byteNum: " + Integer.toBinaryString(byteNum));
        String arr = "0" + Integer.toBinaryString(byteNum);
        char[] arrList = arr.toCharArray();

        List<Integer> resultList = new ArrayList<Integer>();
        for (int i = 0; i < arrList.length; i++) {
            resultList.add(arrList[i] - 48);
        }

        System.out.println(resultList.toString());
        return resultList;
    }

    /**
     *
     *
     * @param byteNum
     * @return
     */
    private int editNum( int byteNum)
    {
        System.out.println(Integer.toBinaryString(byteNum));
        // left move
        int leftNum = byteNum << 1;
        System.out.println("leftNum: " + leftNum);
        String left = Integer.toBinaryString(leftNum).substring(1);

        // right move
        int rightNum = byteNum >> 1;
        System.out.println("rightNum: " + rightNum);
        String right = "0" + Integer.toBinaryString(rightNum);

        System.out.println("left " + left);
        System.out.println("right " + right);

        int s_left =Integer.parseInt(left,2);//
        int s_right =Integer.parseInt(right,2);//

        int result = s_left | s_right;
        System.out.println("result: " + result);
        System.out.println("result: " + Integer.toBinaryString(result));

        return result;

    }
}
