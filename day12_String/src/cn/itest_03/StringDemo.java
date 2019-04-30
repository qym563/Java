package cn.itest_03;
import java.util.Scanner;
public class StringDemo {
	public static void main(String[] args) {
		for (int x=0;x<3;x++) {
			Scanner sc = new Scanner(System.in);
			String a = sc.nextLine();
			String b = sc.nextLine();
			String s = new String(a);
			String s1 = new String(b);
			if(s.equals(s1)){
				System.out.println("数据一致");
			}else {
				System.out.println("数据不一致");
			}

		}	
	}

}