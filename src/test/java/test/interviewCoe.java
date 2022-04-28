//Write a function that takes a string which has integers inside it separated by spaces, and 
//your task is to convert each integer in the string into an integer and return their sum.

package test;

import arrays.ArrayPractice;

public class interviewCoe {
//	
//	static String s1= "1 2 3";
//	static String[] s2=s1.split(" ");
//	Integer
//	
//		
//		public static  String[] dothisonString()	{
//			
//			for(int a=0; a<s2.length; a++) {
//				System.out.println(s2[a]);
//			}
//			return s2;
//		}
//		
//		
//		
//	
//	public static void main(String[] args) {
//		dothisonString();
//	}
	
	public static void main(String[] args) {
		  String input = "43 68 9 23 318";
		  String numbers[] = input.split("\\s+");   // Split the input string.
		  int sum = 0;
		  for (String number : numbers) {  // loop through all the number in the string array
		    int n = Integer.parseInt(number);  // parse each number
		    sum += n;     // sum the numbers
		  }
		  System.out.println(sum);  // print the result.
		}
}


