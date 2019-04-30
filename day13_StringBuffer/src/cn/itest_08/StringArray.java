package cn.itest_08;

public class StringArray {
	public static void bubbSort(int []arr) {
		int temp = 0;
		for(int k=0;k<arr.length-1;k++) {
				for(int x=0;x<arr.length-1-k;x++) {
					if(arr[x]>arr[x+1]) {
						temp = arr[x];
					    arr[x] = arr[x+1];
					    arr[x+1] = temp;
					}
				}
		}	
	}
}
