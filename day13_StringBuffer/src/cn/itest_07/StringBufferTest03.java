package cn.itest_07;
/*
 * �ж��ǲ��ǶԳ��ַ�����abc���ǶԳƣ�aba�ǶԳ�;
 * ��������һ�������һ��;
 * 		�ڶ����͵����ڶ���;
 * 		
 */
import java.util.Scanner;
public class StringBufferTest03 {
	public static void main(String[] args) {
		String r = "abba";
		boolean b = isSame(r);
		System.out.println("ֵ:"+b);
		//boolean e = isSame2(r);
		//System.out.println(e);
		
	}
	public static boolean isSame(String a) {
		char [] ch = a.toCharArray();
		boolean flag = true;
		//int start=0,end=ch.length-1;start<=end;start++,end--
		
		for(int start=0,end=ch.length-1;start<=end;start++,end--) {
			//if(ch[0]a != ch[3]a):���ù�
			//if(ch[1]b != ch[2]b):
			//if(ch[2]b != ch[1]b):
			//if(ch[3]a != ch[0]a):
			//if(ch[4]a != ch[-1]a):
			if(ch[start] != ch[end]) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	/*
	public static boolean isSame2(String r) {
		StringBuffer sb = new StringBuffer();
		return sb.append(r).reverse().toString().equals(r);
	}
	*/


}
