package com.neo.sort;
/**
 * 插入排序
 * @author lile
 * @date   2016年8月31日  
 * @time   下午7:21:47
 */
public class InsertSort {
	public static void insertSort(int []arr){
		int index;
	    int len = arr.length;
	    int j;
		for(int i = 1; i<len ; i++){		//第一次插入第一个记录，自成一格有序序列
			index = arr[i];
			j = i;
			if(arr[j-1] > index){
				while( j >= 1 && arr[j-1] > index){
					arr[j] = arr[j-1];
					j--;
				}
			} 
			arr[j] = index;//这一步记得，是j--以后，向前移动下标，然后给前面的值赋值
		}
	}
}

