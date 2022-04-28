package stringLearning;

import arrays.ArrayPractice;

public class Test2 {

	public static void main(String[] args) {
		String str = "To split the string using sub-string";
		
//		System.out.println(str.split("the"));
		
		String[] test = str.split("the");
		
		ArrayPractice ap = new ArrayPractice();
//		ap.printStringArray(test);
		
		String[] test1 = str.split("");
//		ap.printStringArray(test1);
		
		
		String[] test2 = str.split(" ");
//		ap.printStringArray(test2);
		
		String[] test3 = str.split("@");
//		ap.printStringArray(test3);
		
		
		String str1 = "    Sathya   ";
//		System.out.println(str1.trim());
		
		String str2 = "    To split the     string using sub-string   ";
//		System.out.println(str2.trim());
		
		char[] arr = str.toCharArray();
		System.out.println(arr.toString());
		ap.printCharArray(arr);
		
	}

}
