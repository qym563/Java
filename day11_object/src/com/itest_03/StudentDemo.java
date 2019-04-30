package com.itest_03;

public class StudentDemo {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setAge(19);
		s1.setName("««");
		Student s2 = new Student("««",19);
		System.out.println(s1.equals(s2));
		Student s3 = s1;
		System.out.println(s1.equals(s2)); 
		System.out.println(s1.equals(s1));
		System.out.println(s1.equals(s3));
		Student s4 = new Student("∑Á«Â—Ô",30);
		Student s5 = new Student("««",19);
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s5));
	}
}
