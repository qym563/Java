/*
 *	需求：遍历获取字符串中的每一个字符
 *  分析：
 *  A：如何才能够拿到每一个字符
 *  	char charAt(int index)
 *  B:我怎么知道字符到底有多少个
 *  	int length() 
 */
package cn.itest_04;

public class StringTest {
	public static void main(String[] args) {
		String s = "helloworld";
		int b = s.length();
		System.out.println(b);
		for(int x=0;x<b;x++) {
			System.out.print(s.charAt(x));
		}
		
	}
}
