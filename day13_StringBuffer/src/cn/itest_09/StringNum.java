package cn.itest_09;

/*
 * 把字符串中的字符进行排序
 * 		举例："adcb"
 * 		排序："abcd"
 * 分析：
 *  	A:定义一个字符串
 *  	B:将字符串转换为字符数组
 *      C:把数组进行排序
 *      D:把排序后的字符数组转成字符串
 *      E:输出最后的字符串
 * 
 */
public class StringNum {
	public static void main(String[] args) {
		String num = "adcb";
		char [] arr = num.toCharArray();
		for(int i=0;i<arr.length-1;i++) {
			for(int x=0;x<arr.length-1-i;x++) {
				if(arr[x]>arr[x+1]) {
					char temp = arr[x+1];
					arr[x+1] = arr[x];
					arr[x] = temp;
				}
			}
		}
		arr.toString();
		System.out.println(arr);
	}
}
