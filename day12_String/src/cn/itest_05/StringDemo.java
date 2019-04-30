package cn.itest_05;

import java.security.acl.LastOwnerException;

public class StringDemo {
	public static void main(String[] args) {
		String s ="JavaSE";
		String s1 ="QYM";
		byte[] bys = s.getBytes();
		for(int x=0;x<s.length();x++) {
			System.out.print(bys[x]);
		}
		System.out.println("-----");
		char[] ch = s.toCharArray();
		for(int x=0;x<s.length();x++) {
			System.out.print(ch[x]);
		}
		System.out.println("-----");
		String ss = String.valueOf(ch);
		System.out.println(ss);
		int i = 100;  
		String st = String.valueOf(i);
		System.out.println(st);
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.concat(s1));
		
	}
}
