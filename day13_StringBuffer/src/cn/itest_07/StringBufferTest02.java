package cn.itest_07;

public class StringBufferTest02 {
	public static void main(String[] args) {
		String b = new String();
		b = "olleh";
		System.out.println(getBufferString(b));
		String reule = myString(b);
		System.out.println(reule);
	}
	
	public static String getBufferString(String b) {
		//System.out.println(b);
		//StringBuffer sb = new StringBuffer();
		//sb.append(b);
		//sb.reverse();
		//System.out.println(sb);
		//String a = sb.toString();
		//System.out.println(sb);
		//return a;
		return new StringBuffer(b).reverse().toString();
	}
	
	public static String myString(String c) {
		char [] ch = c.toCharArray();
		String s="";
		s+="[";
		/*
		 * 	for(int x=s.length()-1;x>=0;x--) {
			result+=line[x];
			}
		 */
		for(int x=ch.length-1;x>=0;x--) {
			if(x<0) {
				s+=ch[x];
			}else {
				s+=ch[x];
			}
		}
		s+="]";
		return s;
	}

}
