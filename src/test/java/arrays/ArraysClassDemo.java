package arrays;

import java.util.Scanner;

public class ArraysClassDemo {

	static String str;
	static int b;
	static Scanner s= new Scanner(System.in);
	
	public static String[] Firstmethod()	{
		String[] a= new String[3];
		System.out.println("Enter the String values");
		for( b=0;b<a.length; b++) {
			System.out.println(s.next());
		}
		return a;
	}
	public static String[] SecondMethod()	{
		String[] c= new String[3];
		System.out.println("Enter the String values");
		for( b=0;b<c.length; b++) {
			System.out.println(s.next());
		}
		return c;
	}
	
	public static void main(String[] args) {
		Firstmethod();
		SecondMethod();
	}

}
