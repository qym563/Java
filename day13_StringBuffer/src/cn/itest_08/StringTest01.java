package cn.itest_08;
import java.awt.print.Printable;
/*
 * 1.�����Ƚϣ���������;
 * 2.ÿһ�αȽ���Ϻ���һ�αȽϵ�ʱ��ͻ���һ��Ԫ��;
 * 3.��һ�αȽ�,��0��Ԫ�ز���;
 * 	   �ڶ��αȽ�,��1��Ԫ�ز���;
 * 	   �����αȽ�,��2��Ԫ�ز���;
 * 4.���ձȵĴ��������鳤��-1;
 */
import java.util.Arrays;
public class StringTest01 {
	public static void main(String[] args) {
		int [] arr = {24,69,80,57,13};//0,1,2,3,4
		StringArray.bubbSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
}
