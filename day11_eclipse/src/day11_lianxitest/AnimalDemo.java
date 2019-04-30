package day11_lianxitest;

import com.test02.Animal;
import com.test02.Cat;
import com.test02.Dog;

public class AnimalDemo {
	public static void main(String[] args) {
		Animal a = new Cat();
		a.eat();
		a.sleep();
		a = new Dog();
		a.eat();
		a.sleep();
		Dog d = new Dog();
		d.jump();
	}
}
