package cn.test_02;

public class Char {
	public void  getArry(char []chs) {
		int bigCount = 0;
		int smallCount = 0;
		int numberCount = 0;
		for(int x=0;x<chs.length;x++) {
			char ch = chs[x];
			if(Character.isUpperCase(ch)){
				bigCount++;
			}else if(Character.isLowerCase(ch)) {
				smallCount++;
			}else if(Character.isDigit(ch))
				numberCount++;
		}
		System.out.println(bigCount+":"+smallCount+":"+numberCount);
	}
}
