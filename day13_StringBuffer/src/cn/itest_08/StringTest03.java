package cn.itest_08;

public class StringTest03 {
	public static void main(String[] args) {
		int [] arr = {24,69,80,57,13};
 		printArrys(arr);
		System.out.println("---");
		getArrys(arr);
		System.out.println("---");
		printArrys(arr);
		
	}
	public static void getArrys(int []arr){
		int temp = 0;
		for(int x=0;x<arr.length-1;x++) {
			for(int y=x+1;y<arr.length;y++) {
				if(arr[x]>arr[y]) {
					temp = arr[y];
					arr[y] = arr[x];
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
