package com.test02;

import com.itest01.Jump;

public class Dog extends Animal implements Jump {

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("������");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("���Թ���");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("��˯��");
	}

}
