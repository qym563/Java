package cn.itest_09;

/*
 * ���ַ����е��ַ���������
 * 		������"adcb"
 * 		����"abcd"
 * ������
 *  	A:����һ���ַ���
 *  	B:���ַ���ת��Ϊ�ַ�����
 *      C:�������������
 *      D:���������ַ�����ת���ַ���
 *      E:��������ַ���
 * 
 */
public class StringNum {
	public static void main(String[] args) {
		String num = "adcb";
		char [] arr = num.toCharArray();
		for(int i=0;i<arr.length-1;i++) {
			for(int x=0;x<arr.length-1-i;x++) {
				if(arr[x]>arr[x+1]) {
					char temp = arr[x+1];
					arr[x+1] = arr[x];
					arr[x] = temp;
				}
			}
		}
		arr.toString();
		System.out.println(arr);
	}
}
