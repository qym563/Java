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
 * 
 */
public class StringTest06 {
	public static void main(String[] args) {
		String maxString = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
		String minString = "java";
		int xx = getCount(maxString, minString);
		System.out.println(xx);
	}
	public static int getCount(String maxString,String minString){
		int count = 0;
		int index = maxString.indexOf(minString);
		
		while(index !=-1) {
			count ++;
			int startIndex = index+minString.length();
			maxString = maxString.substring(startIndex);
			index = maxString.indexOf(minString);
			System.out.println(index);
		}
		return count;
	}
}
