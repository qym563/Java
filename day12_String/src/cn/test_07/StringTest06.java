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
 * 
 */
public class StringTest06 {
	public static void main(String[] args) {
		String maxString = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
		String minString = "java";
		int xx = getCount(maxString, minString);
		System.out.println(xx);
	}
	public static int getCount(String maxString,String minString){
		int count = 0;
		int index = maxString.indexOf(minString);
		
		while(index !=-1) {
			count ++;
			int startIndex = index+minString.length();
			maxString = maxString.substring(startIndex);
			index = maxString.indexOf(minString);
			System.out.println(index);
		}
		return count;
	}
}
