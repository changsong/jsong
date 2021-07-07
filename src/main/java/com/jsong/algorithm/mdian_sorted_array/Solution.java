package com.jsong.algorithm.mdian_sorted_array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2019/1/31.
 */
public class Solution {

    public static void main(String[] args){
        int[] num1 = new int[]{1,3};
        int[] num2 = new int[]{2};
        System.out.println(findMedianSortedArrays(num1, num2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        List<Integer> integerList = new ArrayList<Integer>();
        int index = 0;
        // get max lenth
        int size = m > n? m:n;

        for(int i = 0; i< size; i++){
            int tempM = 0;
            int tempN = 0;
            if(i >= m){
                tempM = nums1[m-1];
            } else {
                tempM = nums1[i];
            }

            if(i >= n){
                tempN = nums2[n-1];
            } else {
                tempN = nums2[i];
            }

            if(tempM <= tempN){
                integerList.add(tempM);
            } else {
                integerList.add(tempN);
            }
        }

        int lengthSize = integerList.size();
        int middle = lengthSize % 2;
        if(middle == 0){
            int result = integerList.get(lengthSize/2 - 1) + integerList.get(lengthSize/2);
            return new Double(result)/ 2;
        } else {
            return integerList.get(lengthSize/2);
        }
        // return the median

//        List<Integer> retList = new ArrayList<>();
//        retList.size()

    }
}