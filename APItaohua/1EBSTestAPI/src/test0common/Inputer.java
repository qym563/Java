package test0common;

import java.util.Arrays;


public class Inputer {
	
	public enum Expect{
		UnDefine,
		
		ExcNoInput, 
		
		Normal,
		NorTooLong,
		ExcTooLong, 
		NorSubString,
		NorClear,
		
		ExcTooShort,
		NorLengthSubOne, 
		NorLengthSubTwo,
		
		ExcTooBig, 
		ExcTooSmall,
		
		ExcWrong,
		NorRight,
	}
	
	// 1 字母大写
	public static final String upperCase256 = "AAAAAAAAAABBBBBBBBBBCCCCCCCCCCDDDDDDDDDDEEEEEEEEEE"
			+ "AAAAAAAAAABBBBBBBBBBCCCCCCCCCCDDDDDDDDDDEEEEEEEEEE"
			+ "AAAAAAAAAABBBBBBBBBBCCCCCCCCCCDDDDDDDDDDEEEEEEEEEE"
			+ "AAAAAAAAAABBBBBBBBBBCCCCCCCCCCDDDDDDDDDDEEEEEEEEEE"
			+ "AAAAAAAAAABBBBBBBBBBCCCCCCCCCCDDDDDDDDDDEEEEEEEEEE" + "AAZZZZ";
	
	public static final String upperCase256Double = "ＡＡＡＡＡＡＡＡＡＡＢＢＢＢＢＢＢＢＢＢＣＣＣＣＣＣＣＣＣＣＤＤＤＤＤＤＤＤＤＤＥＥＥＥＥＥＥＥＥＥ"
			+ "ＡＡＡＡＡＡＡＡＡＡＢＢＢＢＢＢＢＢＢＢＣＣＣＣＣＣＣＣＣＣＤＤＤＤＤＤＤＤＤＤＥＥＥＥＥＥＥＥＥＥ"
			+ "ＡＡＡＡＡＡＡＡＡＡＢＢＢＢＢＢＢＢＢＢＣＣＣＣＣＣＣＣＣＣＤＤＤＤＤＤＤＤＤＤＥＥＥＥＥＥＥＥＥＥ"
			+ "ＡＡＡＡＡＡＡＡＡＡＢＢＢＢＢＢＢＢＢＢＣＣＣＣＣＣＣＣＣＣＤＤＤＤＤＤＤＤＤＤＥＥＥＥＥＥＥＥＥＥ"
			+ "ＡＡＡＡＡＡＡＡＡＡＢＢＢＢＢＢＢＢＢＢＣＣＣＣＣＣＣＣＣＣＤＤＤＤＤＤＤＤＤＤＥＥＥＥＥＥＥＥＥＥ" + "ＡＡＺＺＺＺ";

	// 2 字母小写
	public static final String lowerCase256 = "aaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeee"
			+ "aaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeee"
			+ "aaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeee"
			+ "aaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeee"
			+ "aaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeee" + "aazzzz";
	
	public static final String lowerCase256Double = "ａａａａａａａａａａｂｂｂｂｂｂｂｂｂｂｃｃｃｃｃｃｃｃｃｃｄｄｄｄｄｄｄｄｄｄｅｅｅｅｅｅｅｅｅｅ"
			+ "ａａａａａａａａａａｂｂｂｂｂｂｂｂｂｂｃｃｃｃｃｃｃｃｃｃｄｄｄｄｄｄｄｄｄｄｅｅｅｅｅｅｅｅｅｅ"
			+ "ａａａａａａａａａａｂｂｂｂｂｂｂｂｂｂｃｃｃｃｃｃｃｃｃｃｄｄｄｄｄｄｄｄｄｄｅｅｅｅｅｅｅｅｅｅ"
			+ "ａａａａａａａａａａｂｂｂｂｂｂｂｂｂｂｃｃｃｃｃｃｃｃｃｃｄｄｄｄｄｄｄｄｄｄｅｅｅｅｅｅｅｅｅｅ"
			+ "ａａａａａａａａａａｂｂｂｂｂｂｂｂｂｂｃｃｃｃｃｃｃｃｃｃｄｄｄｄｄｄｄｄｄｄｅｅｅｅｅｅｅｅｅｅ" + "ａａｚｚｚｚ";

	// 3 汉字
	public static final String chinese256 = "一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十"
			+ "一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十"
			+ "一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十"
			+ "一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十"
			+ "一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十" + "一二结束了了";
	

	// 4 整数
	public static final String integer256 = "12345678901234567890123456789012345678901234567890"
			+ "12345678901234567890123456789012345678901234567890"
			+ "12345678901234567890123456789012345678901234567890"
			+ "12345678901234567890123456789012345678901234567890"
			+ "12345678901234567890123456789012345678901234567890" + "123456";
	
	public static final String integer256Double = "１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０"
			+ "１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０"
			+ "１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０"
			+ "１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０"
			+ "１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０" + "１２３４５６";
	
	
	

	// 5 小数
	public static final String decimal256 = "99.999" + "12345678901234567890123456789012345678901234567890"
			+ "12345678901234567890123456789012345678901234567890"
			+ "12345678901234567890123456789012345678901234567890"
			+ "12345678901234567890123456789012345678901234567890"
			+ "12345678901234567890123456789012345678901234567890";
	
	public static final String decimal256Double = "９９.９９９" + "１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０"
			+ "１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０"
			+ "１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０"
			+ "１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０"
			+ "１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０";
	
	
	
	// 6 负整数
	public static final String integerNegative256 = "-12345678901234567890123456789012345678901234567890"
			+ "12345678901234567890123456789012345678901234567890"
			+ "12345678901234567890123456789012345678901234567890"
			+ "12345678901234567890123456789012345678901234567890"
			+ "12345678901234567890123456789012345678901234567890" + "12345";
	
	
	public static final String integerNegative256Double = "－１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０"
			+ "１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０"
			+ "１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０"
			+ "１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０"
			+ "１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０" + "１２３４５";
	
	
	// 7 负小数
	public static final String decimalNegative256 = "-99.99" + "12345678901234567890123456789012345678901234567890"
			+ "12345678901234567890123456789012345678901234567890"
			+ "12345678901234567890123456789012345678901234567890"
			+ "12345678901234567890123456789012345678901234567890"
			+ "12345678901234567890123456789012345678901234567890";
	
	public static final String decimalNegative256Double = "-９９.９９" + "１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０"
			+ "１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０"
			+ "１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０"
			+ "１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０"
			+ "１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０";
		

	// 8 符号
	public static final String symbol256 = "!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()"
			+ "!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()"
			+ "!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()"
			+ "!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()"
			+ "!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()" + ")))))?";
	
	public static final String symbol256Double = "！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（"
			+ "！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（"
			+ "！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（"
			+ "！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（"
			+ "！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（" + "）））））？";

	// 空格
	public static final String blank256 = "                                                  "
			+ "                                                  "
			+ "                                                  "
			+ "                                                  "
			+ "                                                  " + "      ";

	// 正常EditText输入
	public static String normalEditText = "航天信息Abc-123!#*";

	// 正常税号15-22位
	public String normalShuiHao15_22 = "123456789012345";
	
	private static String noInput = "";
	private static String threeBlank = "   ";
	private static String NULLStr = "NULL";
	private static String nullStr = "null";
	private static String NullStr = "Null";
	private static String threeBlankDouble = "　　　";//22
	private static String NULLStrDouble = "ＮＵＬＬ";//23
	private static String nullStrDouble = "ｎｕｌｌ";//24
	private static String NullStrDouble = "Ｎｕｌｌ";//25

	// 半角
	public String getUpperCase(int longestLength) {
		return upperCase256.substring(0, longestLength);
	}

	public String getLowerCase(int longestLength) {
		return lowerCase256.substring(0, longestLength);
	}

	public String getChinese(int longestLength) {
		return chinese256.substring(0, longestLength);
	}

	public String getInteger(int longestLength) {
		return integer256.substring(0, longestLength);
	}
	
	public String getIntegerNegative(int longestLength) {
		return integerNegative256.substring(0, longestLength);
	}

	public String getDecimal(int longestLength) {
		return decimal256.substring(0, longestLength);
	}
	
	public String getDecimalNegative(int longestLength) {
		return decimalNegative256.substring(0, longestLength);
	}

	public String getSymbol(int longestLength) {
		return symbol256.substring(0, longestLength);
	}
	
	//  全角
	public String getUpperCaseDouble(int longestLength) {
		return upperCase256Double.substring(0, longestLength);

	}

	public String getLowerCaseDouble(int longestLength) {
		return lowerCase256Double.substring(0, longestLength);
	}


	public String getIntegerDouble(int longestLength) {
		return integer256Double.substring(0, longestLength);
	}
	
	public String getIntegerNegativeDouble(int longestLength) {
		return integerNegative256Double.substring(0, longestLength);
	}

	public String getDecimalDouble(int longestLength) {
		return decimal256Double.substring(0, longestLength);
	}
	
	public String getDecimalNegativeDouble(int longestLength) {
		return decimalNegative256Double.substring(0, longestLength);
	}

	public String getSymbolDouble(int longestLength) {
		return symbol256Double.substring(0, longestLength);
	}

	/*private static String[] returnBlankNull() {
		String[] result = new String[5];
		result[0] = noInput;
		result[1] = threeBlank;
		result[2] = NULLStr;
		result[3] = nullStr;
		result[4] = NullStr;
		return result;
	}
	
	private static String[] returnBlankNullDouble() {
		String[] result = new String[4];
		result[0] = threeBlankDouble;
		result[1] = NULLStrDouble;
		result[2] = nullStrDouble;
		result[3] = NullStrDouble;
		return result;
	}*/

	
	//@TargetApi(Build.VERSION_CODES.GINGERBREAD)
	private static <T> T[] arrayAdd(T[] first, T[]... rest){
		int totalLength = first.length;
		for (T[] array: rest) {
			totalLength = totalLength + array.length;
		}
		T[] result = Arrays.copyOf(first, totalLength);
		int offset = first.length;
		for(T[] array: rest) {
			System.arraycopy(array, 0, result, offset, array.length);
			offset = offset + array.length;
		}
		return result;
	}

	/*
	0:(0)
	1:(3)   
	2:(4)NULL
	3:(4)null
	4:(4)Null
	5:(256)AAAAAAAAAABBBBBBBBBBCCCCCCCCCCDDDDDDDDDDEEEEEEEEEEAAAAAAAAAABBBBBBBBBBCCCCCCCCCCDDDDDDDDDDEEEEEEEEEEAAAAAAAAAABBBBBBBBBBCCCCCCCCCCDDDDDDDDDDEEEEEEEEEEAAAAAAAAAABBBBBBBBBBCCCCCCCCCCDDDDDDDDDDEEEEEEEEEEAAAAAAAAAABBBBBBBBBBCCCCCCCCCCDDDDDDDDDDEEEEEEEEEEAAZZZZ
	6:(256)aaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeaaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeaaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeaaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeaaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeaazzzz
	7:(256)一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二结束了了
	8:(256)1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456
	9:(256)99.99123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012.999
	10:(256)-123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345
	11:(256)-99.93456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012.99
	12:(256)!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*())))))?
	13:(255)AAAAAAAAAABBBBBBBBBBCCCCCCCCCCDDDDDDDDDDEEEEEEEEEEAAAAAAAAAABBBBBBBBBBCCCCCCCCCCDDDDDDDDDDEEEEEEEEEEAAAAAAAAAABBBBBBBBBBCCCCCCCCCCDDDDDDDDDDEEEEEEEEEEAAAAAAAAAABBBBBBBBBBCCCCCCCCCCDDDDDDDDDDEEEEEEEEEEAAAAAAAAAABBBBBBBBBBCCCCCCCCCCDDDDDDDDDDEEEEEEEEEEAAZZZ
	14:(255)aaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeaaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeaaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeaaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeaaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeaazzz
	15:(255)一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二结束了
	16:(255)123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345
	17:(255)123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012.99
	18:(255)-12345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234
	19:(255)-123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012.9
	20:(255)!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*())))))
	21:(3)　　　
	22:(4)ＮＵＬＬ
	23:(4)ｎｕｌｌ
	24:(4)Ｎｕｌｌ
	25:(256)ＡＡＡＡＡＡＡＡＡＡＢＢＢＢＢＢＢＢＢＢＣＣＣＣＣＣＣＣＣＣＤＤＤＤＤＤＤＤＤＤＥＥＥＥＥＥＥＥＥＥＡＡＡＡＡＡＡＡＡＡＢＢＢＢＢＢＢＢＢＢＣＣＣＣＣＣＣＣＣＣＤＤＤＤＤＤＤＤＤＤＥＥＥＥＥＥＥＥＥＥＡＡＡＡＡＡＡＡＡＡＢＢＢＢＢＢＢＢＢＢＣＣＣＣＣＣＣＣＣＣＤＤＤＤＤＤＤＤＤＤＥＥＥＥＥＥＥＥＥＥＡＡＡＡＡＡＡＡＡＡＢＢＢＢＢＢＢＢＢＢＣＣＣＣＣＣＣＣＣＣＤＤＤＤＤＤＤＤＤＤＥＥＥＥＥＥＥＥＥＥＡＡＡＡＡＡＡＡＡＡＢＢＢＢＢＢＢＢＢＢＣＣＣＣＣＣＣＣＣＣＤＤＤＤＤＤＤＤＤＤＥＥＥＥＥＥＥＥＥＥＡＡＺＺＺＺ
	26:(256)ａａａａａａａａａａｂｂｂｂｂｂｂｂｂｂｃｃｃｃｃｃｃｃｃｃｄｄｄｄｄｄｄｄｄｄｅｅｅｅｅｅｅｅｅｅａａａａａａａａａａｂｂｂｂｂｂｂｂｂｂｃｃｃｃｃｃｃｃｃｃｄｄｄｄｄｄｄｄｄｄｅｅｅｅｅｅｅｅｅｅａａａａａａａａａａｂｂｂｂｂｂｂｂｂｂｃｃｃｃｃｃｃｃｃｃｄｄｄｄｄｄｄｄｄｄｅｅｅｅｅｅｅｅｅｅａａａａａａａａａａｂｂｂｂｂｂｂｂｂｂｃｃｃｃｃｃｃｃｃｃｄｄｄｄｄｄｄｄｄｄｅｅｅｅｅｅｅｅｅｅａａａａａａａａａａｂｂｂｂｂｂｂｂｂｂｃｃｃｃｃｃｃｃｃｃｄｄｄｄｄｄｄｄｄｄｅｅｅｅｅｅｅｅｅｅａａｚｚｚｚ
	27:(256)１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６
	28:(256)１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２.９９９
	29:(256)－１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５
	30:(256)－１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２.９９
	31:(256)！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（）））））？
	32:(255)ＡＡＡＡＡＡＡＡＡＡＢＢＢＢＢＢＢＢＢＢＣＣＣＣＣＣＣＣＣＣＤＤＤＤＤＤＤＤＤＤＥＥＥＥＥＥＥＥＥＥＡＡＡＡＡＡＡＡＡＡＢＢＢＢＢＢＢＢＢＢＣＣＣＣＣＣＣＣＣＣＤＤＤＤＤＤＤＤＤＤＥＥＥＥＥＥＥＥＥＥＡＡＡＡＡＡＡＡＡＡＢＢＢＢＢＢＢＢＢＢＣＣＣＣＣＣＣＣＣＣＤＤＤＤＤＤＤＤＤＤＥＥＥＥＥＥＥＥＥＥＡＡＡＡＡＡＡＡＡＡＢＢＢＢＢＢＢＢＢＢＣＣＣＣＣＣＣＣＣＣＤＤＤＤＤＤＤＤＤＤＥＥＥＥＥＥＥＥＥＥＡＡＡＡＡＡＡＡＡＡＢＢＢＢＢＢＢＢＢＢＣＣＣＣＣＣＣＣＣＣＤＤＤＤＤＤＤＤＤＤＥＥＥＥＥＥＥＥＥＥＡＡＺＺＺ
	33:(255)ａａａａａａａａａａｂｂｂｂｂｂｂｂｂｂｃｃｃｃｃｃｃｃｃｃｄｄｄｄｄｄｄｄｄｄｅｅｅｅｅｅｅｅｅｅａａａａａａａａａａｂｂｂｂｂｂｂｂｂｂｃｃｃｃｃｃｃｃｃｃｄｄｄｄｄｄｄｄｄｄｅｅｅｅｅｅｅｅｅｅａａａａａａａａａａｂｂｂｂｂｂｂｂｂｂｃｃｃｃｃｃｃｃｃｃｄｄｄｄｄｄｄｄｄｄｅｅｅｅｅｅｅｅｅｅａａａａａａａａａａｂｂｂｂｂｂｂｂｂｂｃｃｃｃｃｃｃｃｃｃｄｄｄｄｄｄｄｄｄｄｅｅｅｅｅｅｅｅｅｅａａａａａａａａａａｂｂｂｂｂｂｂｂｂｂｃｃｃｃｃｃｃｃｃｃｄｄｄｄｄｄｄｄｄｄｅｅｅｅｅｅｅｅｅｅａａｚｚｚ
	34:(255)１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５
	35:(255)１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２.９９
	36:(255)－１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４
	37:(255)－１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２.９
	38:(255)！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（）））））
	*/
	
	public  Object[][] type01MaxLength(
			boolean isMustHave, 
			boolean isEnforceSubString, 
			int longestLength, 
			boolean isAllowUpperCase,
			boolean isAllowLowerCase,
			boolean isAllowChinese,
			boolean isAllowInteger,
			boolean isAllowDecimal,
			boolean isAllowIntegerNegative,
			boolean isAllowDecimalNegative,
			boolean isAllowSymbol) {
		Object[][] inOut = new Object[2][39];
		inOut[0][0] = noInput;                                            inOut[1][0]  = isMustHave?  Expect.ExcNoInput: Expect.Normal;
		inOut[0][1] = threeBlank;                                         inOut[1][1]  = isMustHave?  Expect.ExcNoInput: Expect.Normal;
		inOut[0][2] = NULLStr;                                            inOut[1][2]  = Expect.UnDefine;
		inOut[0][3] = nullStr;                                            inOut[1][3]  = Expect.UnDefine;
		inOut[0][4] = NullStr;                                            inOut[1][4]  = Expect.UnDefine;
		//
		inOut[0][5] = getUpperCase(longestLength + 1);                    inOut[1][5]  = isAllowUpperCase?(isEnforceSubString? Expect.NorSubString: Expect.ExcTooLong): Expect.NorClear ;
		inOut[0][6] = getLowerCase(longestLength + 1);                    inOut[1][6]  = isAllowLowerCase?(isEnforceSubString? Expect.NorSubString: Expect.ExcTooLong): Expect.NorClear ;
		inOut[0][7] = getChinese(longestLength + 1);                      inOut[1][7]  = changeChinese(isEnforceSubString? Expect.NorSubString: Expect.ExcTooLong, isAllowUpperCase, isAllowLowerCase,  isAllowChinese);
		inOut[0][8] = getInteger(longestLength + 1);                      inOut[1][8]  = changeInteger(isEnforceSubString? Expect.NorSubString: Expect.ExcTooLong, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol);
		inOut[0][9] = getDecimal(longestLength + 1);                      inOut[1][9]  = changeDecimal(isEnforceSubString? Expect.NorSubString: Expect.ExcTooLong, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol);
		inOut[0][10] = getIntegerNegative(longestLength + 1);             inOut[1][10] = changeIntegerNegative(isEnforceSubString? Expect.NorSubString: Expect.ExcTooLong, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol);
		inOut[0][11] = getDecimalNegative(longestLength + 1);             inOut[1][11] = changeDecimalNegative(isEnforceSubString? Expect.NorSubString: Expect.ExcTooLong, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol);
		inOut[0][12] = getSymbol(longestLength + 1);                      inOut[1][12] = isAllowSymbol?(isEnforceSubString? Expect.NorSubString: Expect.ExcTooLong): Expect.NorClear;
		//
		inOut[0][13] = getUpperCase(longestLength);                       inOut[1][13] = isAllowUpperCase? Expect.Normal: Expect.NorClear; 
		inOut[0][14] = getLowerCase(longestLength);                       inOut[1][14] = isAllowLowerCase? Expect.Normal: Expect.NorClear; 
		inOut[0][15] = getChinese(longestLength);                         inOut[1][15] = changeChinese(Expect.Normal, isAllowUpperCase, isAllowLowerCase,  isAllowChinese); 
		inOut[0][16] = getInteger(longestLength);                         inOut[1][16] = changeInteger(Expect.Normal,isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol);
		inOut[0][17] = getDecimal(longestLength);                         inOut[1][17] = changeDecimal(Expect.Normal, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol);
		inOut[0][18] = getIntegerNegative(longestLength);                 inOut[1][18] = changeIntegerNegative(Expect.Normal, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol); 
		inOut[0][19] = getDecimalNegative(longestLength);                 inOut[1][19] = changeDecimalNegative(Expect.Normal, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol); 
		inOut[0][20] = getSymbol(longestLength);                          inOut[1][20] = isAllowSymbol? Expect.Normal: Expect.NorClear; 
		//
		inOut[0][21] = threeBlankDouble;                                  inOut[1][21] = Expect.UnDefine;
		inOut[0][22] = NULLStrDouble;                                     inOut[1][22] = Expect.UnDefine;
		inOut[0][23] = nullStrDouble;                         			  inOut[1][23] = Expect.UnDefine;
		inOut[0][24] = NullStrDouble;                         			  inOut[1][24] = Expect.UnDefine;
		//
		inOut[0][25] = getUpperCaseDouble(longestLength + 1);             inOut[1][25] = isAllowUpperCase?(isEnforceSubString? Expect.NorSubString: Expect.ExcTooLong): Expect.NorClear;
		inOut[0][26] = getLowerCaseDouble(longestLength + 1);             inOut[1][26] = isAllowUpperCase?(isEnforceSubString? Expect.NorSubString: Expect.ExcTooLong): Expect.NorClear;
		inOut[0][27] = getIntegerDouble(longestLength + 1);               inOut[1][27] = changeInteger(isEnforceSubString? Expect.NorSubString: Expect.ExcTooLong, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol);
		inOut[0][28] = getDecimalDouble(longestLength + 1);               inOut[1][28] = changeDecimal(isEnforceSubString? Expect.NorSubString: Expect.ExcTooLong, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol);
		inOut[0][29] = getIntegerNegativeDouble(longestLength + 1);       inOut[1][29] = changeIntegerNegative(isEnforceSubString? Expect.NorSubString: Expect.ExcTooLong, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol);
		inOut[0][30] = getDecimalNegativeDouble(longestLength + 1);       inOut[1][30] = changeDecimalNegative(isEnforceSubString? Expect.NorSubString: Expect.ExcTooLong, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol);
		inOut[0][31] = getSymbolDouble(longestLength + 1);                inOut[1][31] = isAllowSymbol?(isEnforceSubString? Expect.NorSubString: Expect.ExcTooLong): Expect.NorClear;
		//
		inOut[0][32] = getUpperCaseDouble(longestLength);                 inOut[1][32] = isAllowUpperCase? Expect.Normal: Expect.NorClear;  
		inOut[0][33] = getLowerCaseDouble(longestLength);                 inOut[1][33] = isAllowLowerCase? Expect.Normal: Expect.NorClear;  
		inOut[0][34] = getIntegerDouble(longestLength);                   inOut[1][34] = changeInteger(Expect.Normal, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol); 
		inOut[0][35] = getDecimalDouble(longestLength);                   inOut[1][35] = changeDecimal(Expect.Normal, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol);
		inOut[0][36] = getIntegerNegativeDouble(longestLength);           inOut[1][36] = changeIntegerNegative(Expect.Normal, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol); 
		inOut[0][37] = getDecimalNegativeDouble(longestLength);           inOut[1][37] = changeDecimalNegative(Expect.Normal, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol); 
		inOut[0][38] = getSymbolDouble(longestLength);                    inOut[1][38] = isAllowSymbol? Expect.Normal: Expect.NorClear; 
		return inOut;
	}
	
	public  Object[][] type03DefaultAllowLength(
			boolean isMustHave, 
			int longestLength, 
			boolean isAllowUpperCase,
			boolean isAllowLowerCase,
			boolean isAllowChinese,
			boolean isAllowInteger,
			boolean isAllowDecimal,
			boolean isAllowIntegerNegative,
			boolean isAllowDecimalNegative,
			boolean isAllowSymbol) {
		Object[][] inOut = new Object[2][39];
		inOut[0][0] = noInput;                                            inOut[1][0]  = isMustHave?  Expect.ExcNoInput: Expect.Normal;
		inOut[0][1] = threeBlank;                                         inOut[1][1]  = isMustHave?  Expect.ExcNoInput: Expect.Normal;
		inOut[0][2] = NULLStr;                                            inOut[1][2]  = Expect.UnDefine;
		inOut[0][3] = nullStr;                                            inOut[1][3]  = Expect.UnDefine;
		inOut[0][4] = NullStr;                                            inOut[1][4]  = Expect.UnDefine;
		//
		inOut[0][5] = getUpperCase(longestLength + 1);                    inOut[1][5]  = isAllowUpperCase?(Expect.NorTooLong): Expect.NorClear ;
		inOut[0][6] = getLowerCase(longestLength + 1);                    inOut[1][6]  = isAllowLowerCase?(Expect.NorTooLong): Expect.NorClear ;
		inOut[0][7] = getChinese(longestLength + 1);                      inOut[1][7]  = changeChinese(Expect.NorTooLong, isAllowUpperCase, isAllowLowerCase,  isAllowChinese);
		inOut[0][8] = getInteger(longestLength + 1);                      inOut[1][8]  = changeInteger(Expect.NorTooLong, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol);
		inOut[0][9] = getDecimal(longestLength + 1);                      inOut[1][9]  = changeDecimal(Expect.NorTooLong, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol);
		inOut[0][10] = getIntegerNegative(longestLength + 1);             inOut[1][10] = changeIntegerNegative(Expect.NorTooLong, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol);
		inOut[0][11] = getDecimalNegative(longestLength + 1);             inOut[1][11] = changeDecimalNegative(Expect.NorTooLong, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol);
		inOut[0][12] = getSymbol(longestLength + 1);                      inOut[1][12] = isAllowSymbol?(Expect.NorTooLong): Expect.NorClear;
		//
		inOut[0][13] = getUpperCase(longestLength);                       inOut[1][13] = isAllowUpperCase? Expect.Normal: Expect.NorClear; 
		inOut[0][14] = getLowerCase(longestLength);                       inOut[1][14] = isAllowLowerCase? Expect.Normal: Expect.NorClear; 
		inOut[0][15] = getChinese(longestLength);                         inOut[1][15] = changeChinese(Expect.Normal, isAllowUpperCase, isAllowLowerCase,  isAllowChinese); 
		inOut[0][16] = getInteger(longestLength);                         inOut[1][16] = changeInteger(Expect.Normal,isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol);
		inOut[0][17] = getDecimal(longestLength);                         inOut[1][17] = changeDecimal(Expect.Normal, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol);
		inOut[0][18] = getIntegerNegative(longestLength);                 inOut[1][18] = changeIntegerNegative(Expect.Normal, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol); 
		inOut[0][19] = getDecimalNegative(longestLength);                 inOut[1][19] = changeDecimalNegative(Expect.Normal, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol); 
		inOut[0][20] = getSymbol(longestLength);                          inOut[1][20] = isAllowSymbol? Expect.Normal: Expect.NorClear; 
		//
		inOut[0][21] = threeBlankDouble;                                  inOut[1][21] = Expect.UnDefine;
		inOut[0][22] = NULLStrDouble;                                     inOut[1][22] = Expect.UnDefine;
		inOut[0][23] = nullStrDouble;                         			  inOut[1][23] = Expect.UnDefine;
		inOut[0][24] = NullStrDouble;                         			  inOut[1][24] = Expect.UnDefine;
		//
		inOut[0][25] = getUpperCaseDouble(longestLength + 1);             inOut[1][25] = isAllowUpperCase?(Expect.NorTooLong): Expect.NorClear;
		inOut[0][26] = getLowerCaseDouble(longestLength + 1);             inOut[1][26] = isAllowUpperCase?(Expect.NorTooLong): Expect.NorClear;
		inOut[0][27] = getIntegerDouble(longestLength + 1);               inOut[1][27] = changeInteger(Expect.NorTooLong, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol);
		inOut[0][28] = getDecimalDouble(longestLength + 1);               inOut[1][28] = changeDecimal(Expect.NorTooLong, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol);
		inOut[0][29] = getIntegerNegativeDouble(longestLength + 1);       inOut[1][29] = changeIntegerNegative(Expect.NorTooLong, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol);
		inOut[0][30] = getDecimalNegativeDouble(longestLength + 1);       inOut[1][30] = changeDecimalNegative(Expect.NorTooLong, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol);
		inOut[0][31] = getSymbolDouble(longestLength + 1);                inOut[1][31] = isAllowSymbol?(Expect.NorTooLong): Expect.NorClear;
		//
		inOut[0][32] = getUpperCaseDouble(longestLength);                 inOut[1][32] = isAllowUpperCase? Expect.Normal: Expect.NorClear;  
		inOut[0][33] = getLowerCaseDouble(longestLength);                 inOut[1][33] = isAllowLowerCase? Expect.Normal: Expect.NorClear;  
		inOut[0][34] = getIntegerDouble(longestLength);                   inOut[1][34] = changeInteger(Expect.Normal, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol); 
		inOut[0][35] = getDecimalDouble(longestLength);                   inOut[1][35] = changeDecimal(Expect.Normal, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol);
		inOut[0][36] = getIntegerNegativeDouble(longestLength);           inOut[1][36] = changeIntegerNegative(Expect.Normal, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol); 
		inOut[0][37] = getDecimalNegativeDouble(longestLength);           inOut[1][37] = changeDecimalNegative(Expect.Normal, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol); 
		inOut[0][38] = getSymbolDouble(longestLength);                    inOut[1][38] = isAllowSymbol? Expect.Normal: Expect.NorClear; 
		return inOut;
	}

	/*
	0:(0)
	1:(3)   
	2:(4)NULL
	3:(4)null
	4:(4)Null
	5:(256)AAAAAAAAAABBBBBBBBBBCCCCCCCCCCDDDDDDDDDDEEEEEEEEEEAAAAAAAAAABBBBBBBBBBCCCCCCCCCCDDDDDDDDDDEEEEEEEEEEAAAAAAAAAABBBBBBBBBBCCCCCCCCCCDDDDDDDDDDEEEEEEEEEEAAAAAAAAAABBBBBBBBBBCCCCCCCCCCDDDDDDDDDDEEEEEEEEEEAAAAAAAAAABBBBBBBBBBCCCCCCCCCCDDDDDDDDDDEEEEEEEEEEAAZZZZ
	6:(256)aaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeaaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeaaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeaaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeaaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeaazzzz
	7:(256)一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二结束了了
	8:(256)1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456
	9:(256)123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012.999
	10:(256)-123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345
	11:(256)-123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012.99
	12:(256)!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*())))))?
	13:(9)AAAAAAAAA
	14:(9)aaaaaaaaa
	15:(9)一二三四五六七八九
	16:(9)123456789
	17:(9)123456789
	18:(9)-12345678
	19:(9)-12345678
	20:(9)!@#$%^&*(
	21:(255)AAAAAAAAAABBBBBBBBBBCCCCCCCCCCDDDDDDDDDDEEEEEEEEEEAAAAAAAAAABBBBBBBBBBCCCCCCCCCCDDDDDDDDDDEEEEEEEEEEAAAAAAAAAABBBBBBBBBBCCCCCCCCCCDDDDDDDDDDEEEEEEEEEEAAAAAAAAAABBBBBBBBBBCCCCCCCCCCDDDDDDDDDDEEEEEEEEEEAAAAAAAAAABBBBBBBBBBCCCCCCCCCCDDDDDDDDDDEEEEEEEEEEAAZZZ
	22:(255)aaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeaaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeaaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeaaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeaaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeaazzz
	23:(255)一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二三四五六七八九十一二结束了
	24:(255)123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345
	25:(255)123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012.99
	26:(255)-12345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234
	27:(255)-123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012.9
	28:(255)!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*()!@#$%^&*())))))
	29:(10)AAAAAAAAAA
	30:(10)aaaaaaaaaa
	31:(10)一二三四五六七八九十
	32:(10)1234567890
	33:(10)1234567890
	34:(10)-123456789
	35:(10)-123456789
	36:(10)!@#$%^&*()
	37:(3)　　　
	38:(4)ＮＵＬＬ
	39:(4)ｎｕｌｌ
	40:(4)Ｎｕｌｌ
	41:(256)ＡＡＡＡＡＡＡＡＡＡＢＢＢＢＢＢＢＢＢＢＣＣＣＣＣＣＣＣＣＣＤＤＤＤＤＤＤＤＤＤＥＥＥＥＥＥＥＥＥＥＡＡＡＡＡＡＡＡＡＡＢＢＢＢＢＢＢＢＢＢＣＣＣＣＣＣＣＣＣＣＤＤＤＤＤＤＤＤＤＤＥＥＥＥＥＥＥＥＥＥＡＡＡＡＡＡＡＡＡＡＢＢＢＢＢＢＢＢＢＢＣＣＣＣＣＣＣＣＣＣＤＤＤＤＤＤＤＤＤＤＥＥＥＥＥＥＥＥＥＥＡＡＡＡＡＡＡＡＡＡＢＢＢＢＢＢＢＢＢＢＣＣＣＣＣＣＣＣＣＣＤＤＤＤＤＤＤＤＤＤＥＥＥＥＥＥＥＥＥＥＡＡＡＡＡＡＡＡＡＡＢＢＢＢＢＢＢＢＢＢＣＣＣＣＣＣＣＣＣＣＤＤＤＤＤＤＤＤＤＤＥＥＥＥＥＥＥＥＥＥＡＡＺＺＺＺ
	42:(256)ａａａａａａａａａａｂｂｂｂｂｂｂｂｂｂｃｃｃｃｃｃｃｃｃｃｄｄｄｄｄｄｄｄｄｄｅｅｅｅｅｅｅｅｅｅａａａａａａａａａａｂｂｂｂｂｂｂｂｂｂｃｃｃｃｃｃｃｃｃｃｄｄｄｄｄｄｄｄｄｄｅｅｅｅｅｅｅｅｅｅａａａａａａａａａａｂｂｂｂｂｂｂｂｂｂｃｃｃｃｃｃｃｃｃｃｄｄｄｄｄｄｄｄｄｄｅｅｅｅｅｅｅｅｅｅａａａａａａａａａａｂｂｂｂｂｂｂｂｂｂｃｃｃｃｃｃｃｃｃｃｄｄｄｄｄｄｄｄｄｄｅｅｅｅｅｅｅｅｅｅａａａａａａａａａａｂｂｂｂｂｂｂｂｂｂｃｃｃｃｃｃｃｃｃｃｄｄｄｄｄｄｄｄｄｄｅｅｅｅｅｅｅｅｅｅａａｚｚｚｚ
	43:(256)１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６
	44:(256)１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２.９９９
	45:(256)－１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５
	46:(256)－１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２.９９
	47:(256)！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（）））））？
	48:(9)ＡＡＡＡＡＡＡＡＡ
	49:(9)ａａａａａａａａａ
	50:(9)１２３４５６７８９
	51:(9)１２３４５６７８９
	52:(9)－１２３４５６７８
	53:(9)－１２３４５６７８
	54:(9)！＠＃￥％……＆×
	55:(255)ＡＡＡＡＡＡＡＡＡＡＢＢＢＢＢＢＢＢＢＢＣＣＣＣＣＣＣＣＣＣＤＤＤＤＤＤＤＤＤＤＥＥＥＥＥＥＥＥＥＥＡＡＡＡＡＡＡＡＡＡＢＢＢＢＢＢＢＢＢＢＣＣＣＣＣＣＣＣＣＣＤＤＤＤＤＤＤＤＤＤＥＥＥＥＥＥＥＥＥＥＡＡＡＡＡＡＡＡＡＡＢＢＢＢＢＢＢＢＢＢＣＣＣＣＣＣＣＣＣＣＤＤＤＤＤＤＤＤＤＤＥＥＥＥＥＥＥＥＥＥＡＡＡＡＡＡＡＡＡＡＢＢＢＢＢＢＢＢＢＢＣＣＣＣＣＣＣＣＣＣＤＤＤＤＤＤＤＤＤＤＥＥＥＥＥＥＥＥＥＥＡＡＡＡＡＡＡＡＡＡＢＢＢＢＢＢＢＢＢＢＣＣＣＣＣＣＣＣＣＣＤＤＤＤＤＤＤＤＤＤＥＥＥＥＥＥＥＥＥＥＡＡＺＺＺ
	56:(255)ａａａａａａａａａａｂｂｂｂｂｂｂｂｂｂｃｃｃｃｃｃｃｃｃｃｄｄｄｄｄｄｄｄｄｄｅｅｅｅｅｅｅｅｅｅａａａａａａａａａａｂｂｂｂｂｂｂｂｂｂｃｃｃｃｃｃｃｃｃｃｄｄｄｄｄｄｄｄｄｄｅｅｅｅｅｅｅｅｅｅａａａａａａａａａａｂｂｂｂｂｂｂｂｂｂｃｃｃｃｃｃｃｃｃｃｄｄｄｄｄｄｄｄｄｄｅｅｅｅｅｅｅｅｅｅａａａａａａａａａａｂｂｂｂｂｂｂｂｂｂｃｃｃｃｃｃｃｃｃｃｄｄｄｄｄｄｄｄｄｄｅｅｅｅｅｅｅｅｅｅａａａａａａａａａａｂｂｂｂｂｂｂｂｂｂｃｃｃｃｃｃｃｃｃｃｄｄｄｄｄｄｄｄｄｄｅｅｅｅｅｅｅｅｅｅａａｚｚｚ
	57:(255)１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５
	58:(255)１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２.９９
	59:(255)－１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４
	60:(255)－１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２３４５６７８９０１２.９
	61:(255)！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（！＠＃￥％……＆×（）））））
	62:(10)ＡＡＡＡＡＡＡＡＡＡ
	63:(10)ａａａａａａａａａａ
	64:(10)１２３４５６７８９０
	65:(10)１２３４５６７８９０
	66:(10)－１２３４５６７８９
	67:(10)－１２３４５６７８９
	68:(10)！＠＃￥％……＆×（
	*/
	
    public  Object[][] type02LengthAtoB(
    		boolean isMustHave, 
    		boolean isEnforceSubString, 
    		int shortestLength, 
    		int longestLength,
		    boolean isAllowUpperCase,
			boolean isAllowLowerCase,
			boolean isAllowChinese,
			boolean isAllowInteger,
			boolean isAllowDecimal,
			boolean isAllowIntegerNegative,
			boolean isAllowDecimalNegative,
			boolean isAllowSymbol) {
    	Object[][] inOut = new Object[2][69];
		inOut[0][0] = noInput;                                            inOut[1][0]  = isMustHave?  Expect.ExcNoInput: Expect.Normal;
		inOut[0][1] = threeBlank;                                         inOut[1][1]  = isMustHave?  Expect.ExcNoInput: Expect.Normal;
		inOut[0][2] = NULLStr;                                            inOut[1][2]  = Expect.UnDefine;
		inOut[0][3] = nullStr;                                            inOut[1][3]  = Expect.UnDefine;
		inOut[0][4] = NullStr;                                            inOut[1][4]  = Expect.UnDefine;
		//
		inOut[0][5] = getUpperCase(longestLength + 1);                    inOut[1][5]  = isAllowUpperCase?(isEnforceSubString? Expect.NorSubString: Expect.ExcTooLong): Expect.NorClear ;
		inOut[0][6] = getLowerCase(longestLength + 1);                    inOut[1][6]  = isAllowLowerCase?(isEnforceSubString? Expect.NorSubString: Expect.ExcTooLong): Expect.NorClear ;
		inOut[0][7] = getChinese(longestLength + 1);                      inOut[1][7]  = changeChinese(isEnforceSubString? Expect.NorSubString: Expect.ExcTooLong, isAllowUpperCase, isAllowLowerCase,  isAllowChinese);
		inOut[0][8] = getInteger(longestLength + 1);                      inOut[1][8]  = changeInteger(isEnforceSubString? Expect.NorSubString: Expect.ExcTooLong, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol);
		inOut[0][9] = getDecimal(longestLength + 1);                      inOut[1][9]  = changeDecimal(isEnforceSubString? Expect.NorSubString: Expect.ExcTooLong, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol);
		inOut[0][10] = getIntegerNegative(longestLength + 1);             inOut[1][10] = changeIntegerNegative(isEnforceSubString? Expect.NorSubString: Expect.ExcTooLong, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol);
		inOut[0][11] = getDecimalNegative(longestLength + 1);             inOut[1][11] = changeDecimalNegative(isEnforceSubString? Expect.NorSubString: Expect.ExcTooLong, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol);
		inOut[0][12] = getSymbol(longestLength + 1);                      inOut[1][12] = isAllowSymbol?(isEnforceSubString? Expect.NorSubString: Expect.ExcTooLong): Expect.NorClear;
		//
		inOut[0][13] = getUpperCase(shortestLength - 1);                   inOut[1][13]  = isAllowUpperCase? Expect.ExcTooShort: Expect.NorClear;
		inOut[0][14] = getLowerCase(shortestLength - 1);                   inOut[1][14]  = isAllowLowerCase? Expect.ExcTooShort: Expect.NorClear ;
		inOut[0][15] = getChinese(shortestLength - 1);                     inOut[1][15]  = changeChinese(Expect.ExcTooShort, isAllowUpperCase, isAllowLowerCase,  isAllowChinese);
		inOut[0][16] = getInteger(shortestLength - 1);                     inOut[1][16]  = changeInteger(Expect.ExcTooShort, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol);
		inOut[0][17] = getDecimal(shortestLength - 1);                     inOut[1][17]  = changeDecimal(Expect.ExcTooShort, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol);
		inOut[0][18] = getIntegerNegative(shortestLength - 1);             inOut[1][18] = changeIntegerNegative(Expect.ExcTooShort, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol);
		inOut[0][19] = getDecimalNegative(shortestLength - 1);             inOut[1][19] = changeDecimalNegative(Expect.ExcTooShort, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol);
		inOut[0][20] = getSymbol(shortestLength - 1);                      inOut[1][20] = isAllowSymbol?Expect.ExcTooShort: Expect.NorClear;
		//
		inOut[0][21] = getUpperCase(longestLength);                       inOut[1][21] = isAllowUpperCase? Expect.Normal: Expect.NorClear; 
		inOut[0][22] = getLowerCase(longestLength);                       inOut[1][22] = isAllowLowerCase? Expect.Normal: Expect.NorClear; 
		inOut[0][23] = getChinese(longestLength);                         inOut[1][23] = changeChinese(Expect.Normal, isAllowUpperCase, isAllowLowerCase,  isAllowChinese); 
		inOut[0][24] = getInteger(longestLength);                         inOut[1][24] = changeInteger(Expect.Normal,isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol);
		inOut[0][25] = getDecimal(longestLength);                         inOut[1][25] = changeDecimal(Expect.Normal, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol);
		inOut[0][26] = getIntegerNegative(longestLength);                 inOut[1][26] = changeIntegerNegative(Expect.Normal, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol); 
		inOut[0][27] = getDecimalNegative(longestLength);                 inOut[1][27] = changeDecimalNegative(Expect.Normal, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol); 
		inOut[0][28] = getSymbol(longestLength);                          inOut[1][28] = isAllowSymbol? Expect.Normal: Expect.NorClear; 
		//
		inOut[0][29] = getUpperCase(shortestLength);                      inOut[1][29] = isAllowUpperCase? Expect.Normal: Expect.NorClear; 
		inOut[0][30] = getLowerCase(shortestLength);                      inOut[1][30] = isAllowLowerCase? Expect.Normal: Expect.NorClear; 
		inOut[0][31] = getChinese(shortestLength);                        inOut[1][31] = changeChinese(Expect.Normal, isAllowUpperCase, isAllowLowerCase,  isAllowChinese); 
		inOut[0][32] = getInteger(shortestLength);                        inOut[1][32] = changeInteger(Expect.Normal,isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol);
		inOut[0][33] = getDecimal(shortestLength);                        inOut[1][33] = changeDecimal(Expect.Normal, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol);
		inOut[0][34] = getIntegerNegative(shortestLength);                inOut[1][34] = changeIntegerNegative(Expect.Normal, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol); 
		inOut[0][35] = getDecimalNegative(shortestLength);                inOut[1][35] = changeDecimalNegative(Expect.Normal, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol); 
		inOut[0][36] = getSymbol(shortestLength);                         inOut[1][36] = isAllowSymbol? Expect.Normal: Expect.NorClear; 
		//
		inOut[0][37] = threeBlankDouble;                                  inOut[1][37] = Expect.UnDefine;
		inOut[0][38] = NULLStrDouble;                                     inOut[1][38] = Expect.UnDefine;
		inOut[0][39] = nullStrDouble;                         			  inOut[1][39] = Expect.UnDefine;
		inOut[0][40] = NullStrDouble;                         			  inOut[1][40] = Expect.UnDefine;
		//
		inOut[0][41] = getUpperCaseDouble(longestLength + 1);             inOut[1][41] = isAllowUpperCase?(isEnforceSubString? Expect.NorSubString: Expect.ExcTooLong): Expect.NorClear;
		inOut[0][42] = getLowerCaseDouble(longestLength + 1);             inOut[1][42] = isAllowUpperCase?(isEnforceSubString? Expect.NorSubString: Expect.ExcTooLong): Expect.NorClear;
		inOut[0][43] = getIntegerDouble(longestLength + 1);               inOut[1][43] = changeInteger(isEnforceSubString? Expect.NorSubString: Expect.ExcTooLong, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol);
		inOut[0][44] = getDecimalDouble(longestLength + 1);               inOut[1][44] = changeDecimal(isEnforceSubString? Expect.NorSubString: Expect.ExcTooLong, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol);
		inOut[0][45] = getIntegerNegativeDouble(longestLength + 1);       inOut[1][45] = changeIntegerNegative(isEnforceSubString? Expect.NorSubString: Expect.ExcTooLong, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol);
		inOut[0][46] = getDecimalNegativeDouble(longestLength + 1);       inOut[1][46] = changeDecimalNegative(isEnforceSubString? Expect.NorSubString: Expect.ExcTooLong, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol);
		inOut[0][47] = getSymbolDouble(longestLength + 1);                inOut[1][47] = isAllowSymbol?(isEnforceSubString? Expect.NorSubString: Expect.ExcTooLong): Expect.NorClear;
		//
		inOut[0][48] = getUpperCaseDouble(shortestLength - 1);             inOut[1][48]  = isAllowUpperCase? Expect.ExcTooShort: Expect.NorClear;
		inOut[0][49] = getLowerCaseDouble(shortestLength - 1);             inOut[1][49]  = isAllowLowerCase? Expect.ExcTooShort: Expect.NorClear ;
		inOut[0][50] = getIntegerDouble(shortestLength - 1);               inOut[1][50]  = changeInteger(Expect.ExcTooShort, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol);
		inOut[0][51] = getDecimalDouble(shortestLength - 1);               inOut[1][51]  = changeDecimal(Expect.ExcTooShort, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol);
		inOut[0][52] = getIntegerNegativeDouble(shortestLength - 1);       inOut[1][52] = changeIntegerNegative(Expect.ExcTooShort, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol);
		inOut[0][53] = getDecimalNegativeDouble(shortestLength - 1);       inOut[1][53] = changeDecimalNegative(Expect.ExcTooShort, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol);
		inOut[0][54] = getSymbolDouble(shortestLength - 1);                inOut[1][54] = isAllowSymbol?Expect.ExcTooShort: Expect.NorClear;
		//
		inOut[0][55] = getUpperCaseDouble(longestLength);                 inOut[1][55] = isAllowUpperCase? Expect.Normal: Expect.NorClear;  
		inOut[0][56] = getLowerCaseDouble(longestLength);                 inOut[1][56] = isAllowLowerCase? Expect.Normal: Expect.NorClear;  
		inOut[0][57] = getIntegerDouble(longestLength);                   inOut[1][57] = changeInteger(Expect.Normal, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol); 
		inOut[0][58] = getDecimalDouble(longestLength);                   inOut[1][58] = changeDecimal(Expect.Normal, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol);
		inOut[0][59] = getIntegerNegativeDouble(longestLength);           inOut[1][59] = changeIntegerNegative(Expect.Normal, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol); 
		inOut[0][60] = getDecimalNegativeDouble(longestLength);           inOut[1][60] = changeDecimalNegative(Expect.Normal, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol); 
		inOut[0][61] = getSymbolDouble(longestLength);                    inOut[1][61] = isAllowSymbol? Expect.Normal: Expect.NorClear; 
		//
		inOut[0][62] = getUpperCaseDouble(shortestLength);                inOut[1][62] = isAllowUpperCase? Expect.Normal: Expect.NorClear; 
		inOut[0][63] = getLowerCaseDouble(shortestLength);                inOut[1][63] = isAllowLowerCase? Expect.Normal: Expect.NorClear; 
		inOut[0][64] = getIntegerDouble(shortestLength);                  inOut[1][64] = changeInteger(Expect.Normal,isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol);
		inOut[0][65] = getDecimalDouble(shortestLength);                  inOut[1][65] = changeDecimal(Expect.Normal, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol);
		inOut[0][66] = getIntegerNegativeDouble(shortestLength);          inOut[1][66] = changeIntegerNegative(Expect.Normal, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol); 
		inOut[0][67] = getDecimalNegativeDouble(shortestLength);          inOut[1][67] = changeDecimalNegative(Expect.Normal, isAllowInteger, isAllowDecimal,  isAllowIntegerNegative, isAllowDecimalNegative, isAllowSymbol); 
		inOut[0][68] = getSymbolDouble(shortestLength);                   inOut[1][68] = isAllowSymbol? Expect.Normal: Expect.NorClear; 
		return inOut;
	}
	
    
    public  Object[][] type04ValueMax(
    		boolean isMustHave, 
			boolean isEnforceSubString, 
			int max, 
			boolean isAllowInteger,
			boolean isAllowDecimal,
			boolean isAllowSymbol) {
    	Object[][] inOut = new Object[2][41];
    	Object[][] inOut01 = this.type01MaxLength(
    			isMustHave, 
    			isEnforceSubString, 
    			255, 
    			false,
    			false,
    			false,
    			isAllowInteger,
    			isAllowDecimal,
    			false,
    			false,
    			isAllowSymbol);
    	inOut = copyArray(inOut01, inOut);
    	
    	inOut[0][39] = max + 1;               inOut[1][39] = Expect.ExcTooBig; 
		inOut[0][40] = max;                   inOut[1][40] = Expect.Normal; 
    	
  		return inOut;
  	}
    
    public  Object[][] type05ValueAtoB(
    		boolean isMustHave, 
    		boolean isEnforceSubString,
    		int min,
    		int max,
    		boolean isAllowInteger,
    		boolean isAllowDecimal,
    		boolean isAllowSymbol) {
    	Object[][] inOut = new Object[2][43];
    	Object[][] inOut01 = this.type01MaxLength(
    			isMustHave,
    			isEnforceSubString,
    			255,
    			false,
    			false,
    			false,
    			isAllowInteger,
    			isAllowDecimal,
    			false,
    			false,
    			isAllowSymbol);
    	inOut = copyArray(inOut01, inOut);
    	
    	inOut[0][39] = max + 1;               inOut[1][39] = Expect.ExcTooBig; 
		inOut[0][40] = min - 1;               inOut[1][40] = Expect.ExcTooSmall; 
		inOut[0][41] = max;                   inOut[1][41] = Expect.Normal; 
		inOut[0][42] = min;                   inOut[1][42] = Expect.Normal; 
  		return inOut;
  	}

    public  Object[][] type13MultiText(
    		boolean isMustHave, 
    		boolean isEnforceSubString,
    		int longestLength,
			boolean isAllowUpperCase,
			boolean isAllowLowerCase,
			boolean isAllowChinese,
			boolean isAllowInteger,
			boolean isAllowDecimal,
			boolean isAllowIntegerNegative,
			boolean isAllowDecimalNegative,
			boolean isAllowSymbol) {
    	Object[][] inOut = new Object[2][40];
    	Object[][] inOut01 = this.type01MaxLength(
    			isMustHave,
    			isEnforceSubString,
    			longestLength,
    			isAllowUpperCase,
    			isAllowLowerCase,
    			isAllowChinese,
    			isAllowInteger,
    			isAllowDecimal,
    			isAllowIntegerNegative,
    			isAllowDecimalNegative,
    			isAllowSymbol);
    	inOut = copyArray(inOut01, inOut);
    	
    	inOut[0][39] = "/n";               inOut[1][39] = Expect.Normal; 
    	
		return inOut;
	}
    
    private static Object[][] copyArray(Object[][] from, Object[][] to) {
    	for(int i=0; i<2; i++) {
    		for(int j=0; j<from[1].length; j++) {
    			to[i][j] = from[i][j];
    		}
    	}
    	return to;
    }
    
	public  String[] type14FileNameInput(boolean isMustHave, int shortestLength, int longestLength) {
		return null;
	}
	
	//             用户名空                                      用户名错误                             用户名正确 
	//密码空                1用户名或密码不能为空！          4用户名或密码不能为空！        7用户名或密码不能为空！
	//密码错误            2用户名或密码不能为空！          5用户名或者密码错误！            8用户名或者密码错误！
	//密码正确            3用户名或密码不能为空！          6用户名或者密码错误！            9成功登录
	public Object[][] type15Login(String userName, String passWord) {
		return null;	
	}

	public  String[] type20DateNotBeginEndInput(boolean isMustHave) {
		return null;
	}
	
	public  String[] type21DateBeginInput(boolean isMustHave) {
		return null;
	}
	
	public  String[] type22DateEndInput(boolean isMustHave) {
		return null;
	}
	
	public  String[] type24PostCodeInput(boolean isMustHave) {
		return null;
	}
	
	public  String[] type25TelephoneInput(boolean isMustHave) {
		return null;
	}
	
	public  String[] type26FaxInput(boolean isMustHave) {
		return null;
	}
	
	public  String[] type27EmailInput(boolean isMustHave) {
		return null;
	}
	

	//private====================================================
	
	private static Expect changeChinese(Expect output, 
			boolean isAllowUpperCase, 
			boolean isAllowLowerCase,
			boolean isAllowChinese) {
		Expect result = null;
		if (isAllowChinese) {
			if ((!isAllowUpperCase) || (!isAllowLowerCase)) {
				System.out.println("Not Reasonable???");
			} else {
				result = output;
			}
		} else {
			result = Expect.NorClear;
		}
		return result;
	}
	
	private static Expect changeInteger(Expect output, 
			boolean isAllowInteger, 
			boolean isAllowDecimal, 
			boolean isAllowIntegerNegative, 
			boolean isAllowDecimalNegative, 
			boolean isAllowSymbol) {
		Expect result = null;
		if (isAllowInteger) {
			result = output;
		} else {
			if (isAllowIntegerNegative) {
				System.out.println("Not Reasonable???");
			} else if (isAllowDecimal) {
				System.out.println("Not Reasonable???");
			} else if (isAllowDecimalNegative) {
				System.out.println("Not Reasonable???");
			} else {
				result = Expect.NorClear;
			}
		}
		return result;
	}
	
	private static Expect changeDecimal(Expect output, 
	    		boolean isAllowInteger, 
	    		boolean isAllowDecimal, 
	    		boolean isAllowIntegerNegative,
	    		boolean isAllowDecimalNegative,
	    		boolean isAllowSymbol) {
	    	Expect result = null;
	    	if(isAllowDecimal) {
				result = output; 
			}else {
				if(isAllowInteger) {
					result = Expect.NorLengthSubOne;
				} else if(isAllowIntegerNegative) {
					result = Expect.NorLengthSubOne;
				} else if(isAllowDecimalNegative) {
					System.out.println("Not Reasonable???");
				} else {
					result = Expect.NorClear;
				}
			}
	    	return result;
		}
	    
	    private static Expect changeIntegerNegative(Expect output, 
	    		boolean isAllowInteger, 
	    		boolean isAllowDecimal, 
	    		boolean isAllowIntegerNegative,
	    		boolean isAllowDecimalNegative,
	    		boolean isAllowSymbol) {
	    	Expect result = null;
	    	if(isAllowIntegerNegative) {
				result = output; 
			}else {
				if(isAllowInteger) {
					result = Expect.NorLengthSubOne;
				} else if(isAllowDecimal) {
					result = Expect.NorLengthSubOne;
				} else if(isAllowDecimalNegative) {
					System.out.println("Not Reasonable???");
				} else {
					result = Expect.NorClear;
				}
			}
	    	return result;
		}
	    
	    private static Expect changeDecimalNegative(Expect output, 
	    		boolean isAllowInteger, 
	    		boolean isAllowDecimal, 
	    		boolean isAllowIntegerNegative,
	    		boolean isAllowDecimalNegative,
	    		boolean isAllowSymbol) {
	    	Expect result = null;
	    	if(isAllowDecimalNegative) {
				result = output; 
			}else {
				if(isAllowInteger && isAllowDecimal) {
					result = Expect.NorLengthSubOne;
				} else if(isAllowInteger && !(isAllowDecimal)) {
					result = Expect.NorLengthSubTwo;
				} else if(isAllowIntegerNegative) {
					result = Expect.NorLengthSubOne;
				} else {
					result = Expect.NorClear;
				}
			}
	    	return result;
		}
	
}
