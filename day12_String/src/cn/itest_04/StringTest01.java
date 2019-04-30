package cn.itest_04;
/*  需求:统计一个字符串中大写字符，小写字符，数字字符出现的次数
 *	举例：
 *		"Hello123World"
 *	结果：
 *		大写字符：2个	
 *		小写字符：8个
 *		数字字符：3个
 * 	分析：
 * 		A:定义三个统计变量
 * 			bigCount=0;
 * 			smallCount=0;
 * 			numberCount=0;
 * 		B:遍历字符串，得到每一个字符
 * 			leng()和charAt()结合
 * 		C:判断字符到底是属于那种类型的
 * 			大:bigCount++
 * 			小:smallCount++
 * 			数字:number++ 
 * 		关键点是如果判断大,小,数字
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
