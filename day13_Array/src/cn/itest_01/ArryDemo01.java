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
public class ArryDemo01 {
	public static void main(String[] args) {
		int [] arr = {11,22,33,44,55,66,77};
		int reult = getArrys(arr,55);
		System.out.println(reult);
		
	}
	public static int getArrys(int []arr,int value) {
		int max = arr.length-1;
		int min = 0;
		int mid = (min+max)/2;
		while(value!=arr[mid]) {
			if(value>arr[mid]) {
				max = mid -1;
			}else if(value<arr[mid]){
				min = min+1;
			}
			mid = (min+max)/2;
		}
		return mid;
	}
		
	}
