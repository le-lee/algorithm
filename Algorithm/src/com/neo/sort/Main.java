package com.neo.sort;
/**
 *
 * @author lile
 * @date   2016年8月31日  
 * @time   下午7:08:46
 */
public class Main {
	public static void main(String[] args) {
		int []arr = {5,4,9,8,7,6,0,1,3,2};
//		int []arr1 = {0,1,2,3,4,5,6,7,8,9};
//		int []arr2 = {9,8,7,6,5,4,3,2,1,0};
//		BubbleSort.bubbleSort(arr);
//		BubbleSort.bubbleSort(arr1);
//		BubbleSort.bubbleSort(arr2);
//		SelectSort.selectSort(arr);
		InsertSort.insertSort(arr);
		for(int item : arr){
			System.out.print(item + " ");
		}
	}
}

