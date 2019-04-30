package cn.test_07;
/*
 * 思路：
 * 		A:定义一个变量，初始化值是0;
 * 		B:先获取一次"java"在这个大串中第一次出现的索引
 * 			如果索引值是-1,就说明不存在,返回统计变量
 * 			如果索引值不是-1,就说明存在,统计变量++
 * 		C:把刚才的索引+小串的长度作为起始位置截取原始大串,得到一个新的字符串,并把该字符串
 * 		  重新赋值给大串
 * 		D:回到B即可
 */
public class StringTest05 {
	public static void main(String[] args) {
		String maxString = "wqweqiaowozhqweqwiqiaowozheqweqweqiaowoqweaiqiaoxinbuxssadqwewqiao";
		String minString = "qiao";
		int xx = getCount(maxString, minString);
		System.out.println("字母qiao出现的次数为:");
		System.out.print(xx);
	}
	public static int getCount(String maxString,String minString){
		int count = 0;
		int index;
		while((index=maxString.indexOf(minString))!=-1) {
			count++;
			maxString = maxString.substring(minString.length()+index);
		}	
		return count;
		
	}
}
