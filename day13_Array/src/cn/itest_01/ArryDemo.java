package cn.itest_01;
/*
 * 查找:
 * 		基本查找：数组元素无序（从头到尾）
                     二分查找(折半查找): 数组元素有序排列
         
 * 分析：
 * 		A:定义最大索引，最小索引
 * 		B:计算出中间索引
 * 			min = (min+mix)/2
 * 		C:拿中间索引进行比较 如果大了，就向左
 * 					         如果小了，就向右
 * 		D:大了左边，最大值为max = mid -1
 * 		小了，最小值为 min = min+1	
 */

public class ArryDemo {
	public static void main(String[] args) {
		int [] arr = {11,22,33,44,55,66,77};
		int index = getIndex(arr,33333);
		System.out.println(index); 
		System.out.println(arr[index]);
	}
	public static int getIndex(int []arr,int value) {
		
		int max = arr.length-1;
		int min = 0;
		int mid = (max+min)/2;
		while(arr[mid]!=value) {
			if(arr[mid]>value) {
				max=mid-1;
			}else if(arr[mid]<value) {
				min=mid+1;
			}if(min>max) {
				return -1;
			}
			mid = (max+min)/2;
		}
		return mid; 
	}
}
