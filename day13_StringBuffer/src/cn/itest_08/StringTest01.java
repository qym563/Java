package cn.itest_08;
import java.awt.print.Printable;
/*
 * 1.两两比较，打的往后放;
 * 2.每一次比较完毕后，下一次比较的时候就会少一个元素;
 * 3.第一次比较,有0个元素不比;
 * 	   第二次比较,有1个元素不比;
 * 	   第三次比较,有2个元素不比;
 * 4.最终比的次数是数组长度-1;
 */
import java.util.Arrays;
public class StringTest01 {
	public static void main(String[] args) {
		int [] arr = {24,69,80,57,13};//0,1,2,3,4
		StringArray.bubbSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
}
