package cn.itest_03;
import java.util.Scanner;
public class GuessNumberGame {
	private GuessNumberGame(){};
		public static void start() {
			int number = (int) (Math.random()*100)+1;
			while(true) {
				Scanner sc = new Scanner(System.in);
				int guessnumber = sc.nextInt();
				if(guessnumber>number) {
					System.out.println("���µ����ݴ���");
				}else if(guessnumber<number) {
					System.out.println("���µ�����С��");
				}else {
					System.out.println("���¶���");
				}
			}
	}
}
