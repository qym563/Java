package cn.itest_04;
/*  ����:ͳ��һ���ַ����д�д�ַ���Сд�ַ��������ַ����ֵĴ���
 *	������
 *		"Hello123World"
 *	�����
 *		��д�ַ���2��	
 *		Сд�ַ���8��
 *		�����ַ���3��
 * 	������
 * 		A:��������ͳ�Ʊ���
 * 			bigCount=0;
 * 			smallCount=0;
 * 			numberCount=0;
 * 		B:�����ַ������õ�ÿһ���ַ�
 * 			leng()��charAt()���
 * 		C:�ж��ַ������������������͵�
 * 			��:bigCount++
 * 			С:smallCount++
 * 			����:number++ 
 * 		�ؼ���������жϴ�,С,����
 * 	    	if()
 */
import java.util.Scanner;
public class StringTest01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		String b = in;
		int n = b.length();
		int bigCount=0;
		int smallCount=0;
		int numberCount=0;
		for(int x=0;x<n;x++){
			char c = b.charAt(x);
			if(c>'0' && c<='9') {
				numberCount++;
			}else if (c>='a' && c<='z') {
				smallCount++;
			}else if(c>='A' && c<='Z'){
				bigCount++;
			}
		}
		System.out.println(numberCount+":"+smallCount+":"+bigCount);
	}
}
