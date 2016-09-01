package com.neo.sort;
/**
 * 冒泡排序
 * @author lile
 * @date   2016年8月31日  
 * @time   下午7:07:33
 */
public class BubbleSort {
	public static void bubbleSort(int [] arr){
		int len = arr.length;
		int temp;
		int count = 0;
		for(int i = 0; i < len - 1; i++){
			for(int j = len - 1; j > i; j--){
				if(arr[j - 1] > arr[j]){
					temp  = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					count ++;
				}
			}
		}
		System.out.println("count: "+count);
	}
}

