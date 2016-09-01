package com.neo.sort;
/**
 * 选择排序
 * @author lile
 * @date   2016年8月31日  
 * @time   下午7:24:12
 */
public class SelectSort {
	public static void selectSort(int []arr){
		int flag,tempMin;
		int len = arr.length;
		for(int i = 0; i<len; i++){
			tempMin = arr[i];
			flag = i;
			for(int j = i+1; j<len; j++){
				if(arr[j] < tempMin){
					tempMin = arr[j];
					flag = j;
				}
			}
			if(flag != i){
				arr[flag] = arr[i];
				arr[i] = tempMin;
			}
		}
	}
	
}

