package cn.itest_08;

public class StringTest04 {
	public static void main(String[] args) {
		int [] arr = {24,68,80,57,13};
		printArrys(arr);
		printArry(arr);
		
	}
	public static void printArrys(int []arr) {
		for(int x=0;x<arr.length-1;x++) {
			for(int y=x+1;y<arr.length;y++) {
				if(arr[x]>arr[y]) {
					int temp = arr[y];
						arr[y] = arr[x];
						arr[x] = temp;
				}
			}
		}
	}
	public static void printArry(int []arr) {
		System.out.print("[");
		for(int x=0;x<arr.length;x++) {
			if(x==arr.length-1) {
				System.out.print(arr[x]);
			}else {
				System.out.print(arr[x]+",");
			}
		}
		System.out.println("]");
	}
}
