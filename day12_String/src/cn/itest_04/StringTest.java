/*
 *	���󣺱�����ȡ�ַ����е�ÿһ���ַ�
 *  ������
 *  A����β��ܹ��õ�ÿһ���ַ�
 *  	char charAt(int index)
 *  B:����ô֪���ַ������ж��ٸ�
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
