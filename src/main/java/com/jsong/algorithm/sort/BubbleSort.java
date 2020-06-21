package com.jsong.algorithm.sort;

import java.util.Arrays;

public class BubbleSort{
	public static int[] bubbleSort(int[] arr){
		// 外层循环控制比较轮数
		for(int i = 0; i < arr.length; i++){
			// 内层循环控制每轮比较次数
			for(int j = 0; j < arr.length - i - 1; j++){
				// 按照从小到大排列
				if(arr[j] > arr[j + 1]){
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}// bubbleSort		
	
	
	public static void main(String[] args) {
		int[] sorted = bubbleSort(new int[] { 5, 2, 0, 10, 11 });
		for (int i : sorted) {
			System.out.print(i + "\t");
		}
	}
}