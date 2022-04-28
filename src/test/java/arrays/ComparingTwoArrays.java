package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ComparingTwoArrays {
	
	static Scanner s = new Scanner(System.in);
	static int a,b,c,x,y;
	
	public static int[] getSizeofArray()	{
		System.out.println("Get the size of an array");
		a=s.nextInt();
		int size[] = new int[a];
		return size;
	}
	
	public static int[] getFirstArray(int[] arrone)	{
		
		System.out.println("Enter the values of first Array");
		for(b=0;b<arrone.length;b++)	{
			s.nextInt();
		}
		return arrone;
	}
	
public static int[] getSecondArray(int[] arrtwo)	{
		
		System.out.println("Enter the values of second Array");
		for(b=0;b<arrtwo.length;b++)	{
			s.nextInt();
		}
		return arrtwo;
	}

public static void compareTwoArrays(int[] first, int[] two) {
	
	try {
Arrays.equals(first, two);
	}
	catch(Exception e) {
		e.getMessage();
	}
	
//	for(x=0;x<first.length;x++)	{
//		for(y=x+1;y<two.length;y++) {
//			if(first[x]))	{
//				System.out.println("Elements matching in second array " +two[y]+ " with array one "+first[x]);
//		}
//		}
//	}
}
	
	

	public static void main(String[] args) {
		compareTwoArrays(getFirstArray(getSizeofArray()),getSecondArray(getSizeofArray()));
	}

}
