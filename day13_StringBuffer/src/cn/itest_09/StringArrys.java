package cn.itest_09;
import java.util.Arrays;
public class StringArrys {
	public static void main(String[] args) {
		int [] arr = {23,98,78,99};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.binarySearch(arr,78));
	}
}
