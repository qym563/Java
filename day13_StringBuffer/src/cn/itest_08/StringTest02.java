package cn.itest_08;
public class StringTest02 {
	public static void main(String[] args) {
		int []arr = {11,44,22,66,77,33};
		getArrys(arr);
		printArrys(arr);
	}
	public static void getArrys(int []arr) {
		int temp = 0;
		for(int i=0;i<arr.length-1;i++) {
			for(int x=0;x<arr.length-1-i;x++) {
				if(arr[x]>arr[x+1]) {
					temp = arr[x+1];
					arr[x+1] = arr[x];
					arr[x] = temp;
				}
			}
		}
	}
	public static void printArrys(int []arr) {
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
