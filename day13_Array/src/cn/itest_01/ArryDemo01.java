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
public class ArryDemo01 {
	public static void main(String[] args) {
		int [] arr = {11,22,33,44,55,66,77};
		int reult = getArrys(arr,55);
		System.out.println(reult);
		
	}
	public static int getArrys(int []arr,int value) {
		int max = arr.length-1;
		int min = 0;
		int mid = (min+max)/2;
		while(value!=arr[mid]) {
			if(value>arr[mid]) {
				max = mid -1;
			}else if(value<arr[mid]){
				min = min+1;
			}
			mid = (min+max)/2;
		}
		return mid;
	}
		
	}
