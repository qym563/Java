package cn.itest_03;
/*
 *  ģ���¼�������λ��ᣬ����ʾ���м��Σ� 
 *  ������
 *  A:�����û������룬�Ѵ��ڵģ�
 *  B:����¼���û���������;
 *  C:�Ƚ��û��������롣
 *  	�������ͬ�����¼�ɹ�
 *  	�����һ����ͬ�����¼ʧ��
 *  D:�����λ��ᣬ��ѭ���Ľ��������forѭ��
 *
 */
import java.util.Scanner;
public class StringDemo01 {
	public static void main(String[] args) {
		String name = "qym";
		String passwd = "123456";

		for(int x=0;x<3;x++) { 
			Scanner sc = new Scanner(System.in);
			System.out.println("�������û���:");
			String n = sc.nextLine();
			String nameinput = new String(n);
			System.out.println("����������:");
			String p = sc.nextLine();
			String passwdinput = p;
			if(name.equals(nameinput) & passwd.equals(passwdinput)) {
				System.out.println("�ɹ���¼");
				break;
			}else {
				//2,1,0
				if(2-x==0){
					System.out.println("�˺ű���");
				}else {
				System.out.println("��¼ʧ��,�㻹��"+(2-x)+"�λ���");
				}
			}
		}
	}
}

