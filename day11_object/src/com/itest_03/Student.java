package com.itest_03;

public class Student {
	private String name;
	private int age;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	/*
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Student s = (Student)obj;
		if(this.name.equals(s.name) && this.age == s.age) {
			return true;
		}else {
			return false;
		}
	}*/
	/*
	public boolean equals(Object obj) {
		if (this==obj) {
			return true;
		}
		if (!(obj instanceof Student)) {
			return false;
		}
		System.out.println("如果相同则不比较");
		Student s = (Student)obj;
		return this.name.equals(s.name) && this.age == s.age;
	}
	*/
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}


