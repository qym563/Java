package cn.test_07;
/*
 * ˼·��
 * 		A:����һ����������ʼ��ֵ��0;
 * 		B:�Ȼ�ȡһ��"java"��������е�һ�γ��ֵ�����
 * 			�������ֵ��-1,��˵��������,����ͳ�Ʊ���
 * 			�������ֵ����-1,��˵������,ͳ�Ʊ���++
 * 		C:�Ѹղŵ�����+С���ĳ�����Ϊ��ʼλ�ý�ȡԭʼ��,�õ�һ���µ��ַ���,���Ѹ��ַ���
 * 		  ���¸�ֵ����
 * 		D:�ص�B����
 */
public class StringTest05 {
	public static void main(String[] args) {
		String maxString = "wqweqiaowozhqweqwiqiaowozheqweqweqiaowoqweaiqiaoxinbuxssadqwewqiao";
		String minString = "qiao";
		int xx = getCount(maxString, minString);
		System.out.println("��ĸqiao���ֵĴ���Ϊ:");
		System.out.print(xx);
	}
	public static int getCount(String maxString,String minString){
		int count = 0;
		int index;
		while((index=maxString.indexOf(minString))!=-1) {
			count++;
			maxString = maxString.substring(minString.length()+index);
		}	
		return count;
		
	}
}
