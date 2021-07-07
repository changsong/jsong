package com.jsong.algorithm.mdian_sorted_array;

import java.util.ArrayList;
import java.util.List;

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如，数组[3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为 1。
 * 
 */
public class ReVerseArr {
    
    public int minArray(int[] numbers) {
        //设置 start, end 指针分别指向 numbers 数组左右两端
        int start = 0, end = numbers.length - 1;

        //循环判断处理，直到找到结果
        while (start < end) {

            // mid 为中点（这里向下取整，比如 （ 2 + 7 ）/ 2 = 4 )
            int mid = (start + end) / 2;

            //当 mid 点所在元素大于数组末端的元素时，这意味着 [start , mid] 是有序的数组
            if (numbers[mid] > numbers[end]){

                // 所以旋转点在 [ mid + 1, end ] 区间里面 ，更新 start 的位置为 mid + 1
                start = mid + 1;

            }else if (numbers[mid] < numbers[end]){

                // 当 mid 点所在元素小于数组开始端的元素时，这意味着 [mid , end] 是有序的数组
                // 所以旋转点在 [ start, mid ] 区间里面 ，更新 end 的位置为 mid 
                end = mid;

                //思考题🤔：为什么 start 是更新为 mid + 1，而 end 却是更新为 mid

            }else{

                //此时，出现了 numbers[mid] = numbers[end] 的情况，无法判断 
                //    [ start , mid ]  为有序数组区间
                //  还是  [ mid , end ]  为有序数组区间
                //  比如： [1, 0, 1, 1, 1] 和  [1, 1, 1, 0, 1]
                //  所以这里采取遍历的方式
                return findMin(numbers,start,end);

            }
        }
        return numbers[start];
    }


     public int findMin(int[] numbers,int start,int end){

        int result = numbers[start];

        for(int i = start;i <= end;i++){

            if (numbers[i] < result) {
                result = numbers[i];
            }
        }
        return result;
    }
}