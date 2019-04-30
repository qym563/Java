package cn.itest_09;

import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("one");
		int x = sc.nextInt();
		System.out.println("two");
		int y = sc.nextInt();
		System.out.println("three");
		int z = sc.nextInt();
		int result = x > y ? x:y;
		int max = result > z ? result:z;
		System.out.println(max);
	}
} -