package cn.itest_04;
/*
 *   进制转换
 *   
 *   
 */
public class IntegerDemo {
	public static void main(String[] args) {
		System.out.println(Integer.toBinaryString(100));
		System.out.println(Integer.toOctalString(100));
		System.out.println(Integer.toHexString(100));
		System.out.println(Integer.toString(100,2));
		System.out.println(Integer.toString(100,8));
		System.out.println(Integer.toString(100,16));
		System.out.println(Integer.toString(100,5));
		System.out.println(Integer.toString(100,7));
		
		//其它进制到十进制
		System.out.println(Integer.parseInt("100",10));
		System.out.println(Integer.parseInt("100",2));
		System.out.println(Integer.parseInt("4F",2));
	}
}
