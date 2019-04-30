package cn.itest_07;
/*
 * StringºÍStringBufferµÄ×ª»»
 * 
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		String s = "hello";
		StringBuffer sb = new StringBuffer(s);
		StringBuffer sb2 = new StringBuffer();
		sb2.append(s);
		StringBuffer sb3 = new StringBuffer("java");
		String s4 = new String(sb3); 
		String s5 = String.valueOf(sb3);
		System.out.println(s4+":"+s5);  

	}
}
