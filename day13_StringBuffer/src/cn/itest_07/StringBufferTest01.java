package cn.itest_07;
/*
 * 把数组拼成一个字符串
 * 
 */
public class StringBufferTest01 {
	public static void main(String[] args) {
		int [] arr = {11,22,33,44,55};
		String result = getStringBuffer(arr);
		System.out.println(result);
	}
	public static String getStringBuffer(int arr[]) {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for(int x=0;x<arr.length;x++) {
			if(x==arr.length-1) {
				sb.append(arr[x]);
	
			}else {
				sb.append(arr[x]);
				sb.append(",");
			}			
		
		}
		 sb.append("]");
		return sb.toString();
	}
}
