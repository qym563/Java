package cn.itest_01;
/*
 * ����:
 * 		�������ң�����Ԫ�����򣨴�ͷ��β��
                     ���ֲ���(�۰����): ����Ԫ����������
         
 * ������
 * 		A:���������������С����
 * 		B:������м�����
 * 			min = (min+mix)/2
 * 		C:���м��������бȽ� ������ˣ�������
 * 					         ���С�ˣ�������
 * 		D:������ߣ����ֵΪmax = mid -1
 * 		С�ˣ���СֵΪ min = min+1	
 */

public class ArryDemo {
	public static void main(String[] args) {
		int [] arr = {11,22,33,44,55,66,77};
		int index = getIndex(arr,33333);
		System.out.println(index); 
		System.out.println(arr[index]);
	}
	public static int getIndex(int []arr,int value) {
		
		int max = arr.length-1;
		int min = 0;
		int mid = (max+min)/2;
		while(arr[mid]!=value) {
			if(arr[mid]>value) {
				max=mid-1;
			}else if(arr[mid]<value) {
				min=mid+1;
			}if(min>max) {
				return -1;
			}
			mid = (max+min)/2;
		}
		return mid; 
	}
}
