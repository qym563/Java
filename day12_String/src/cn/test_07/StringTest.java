package cn.test_07;
/*
 *  ����:�������е����ݰ���ָ����ʽƴ�ӳ�һ���ַ���
 *  ����:
 *  	int [] arr = {1,2,3}; 
 *  ������:
 *  	[1,2,3];
 *   
 */
public class StringTest {
	public static void main(String[] args) {
		int [] arr = {1,2,3};
		String s = "";
		s +="[";
		for (int x=0;x<arr.length;x++) {
			if(x==arr.length-1) {
				s+=arr[x];
				s+="]";
			}else {
				s+=arr[x];
				s+=",";
			}
		}	
		System.out.println(s);	
	}
}
