package cn.test_02;
import java.util.Scanner;
public class ChararcterTest01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		char [] chs = line.toCharArray();
		Char c = new Char();
		c.getArry(chs);
	}
}
