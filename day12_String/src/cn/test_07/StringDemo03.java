/*
 * ×Ö·û´®·´×ª
 * ¾ÙÀı£º¼üÅÌÂ¼Èë "a,b,c"
 * Êä³ö½á¹û£º"c,b,a"
 * 
 * 
 */
package cn.test_07;
import java.util.Scanner;

public class StringDemo03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ÇëÊäÈë×Ö·û:");
		String s = sc.nextLine();
		String result = "";
		char [] line = s.toCharArray();
		for(int x=s.length()-1;x>=0;x--) {
			result+=line[x];
		}
		System.out.println(result);
	}
}
