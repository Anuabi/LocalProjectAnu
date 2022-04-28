package arrays;

import java.util.Scanner;

public class reverseAnArray {
	
	static Scanner s = new Scanner(System.in);
	static int c,a,d;

	public static void main(String[] args) {
		int[] array = beforeReverseAnArray();
//		printArray(array);
		afterReverseAnArray(printArray(array));
		compareTwoArrays(printArray(array),afterReverseAnArray(array));
	}
	
	public static int[] beforeReverseAnArray()	{
		System.out.println("Please enter the length of an array");
		a=s.nextInt();
		int[] b	= new int[a];
		System.out.println("Enter the array elements");
		for(c=0; c< a;c++)	{
			b[c]=s.nextInt();
		}
		return b;
	} 
		
		public static int[] printArray(int[] arr)	{
			System.out.println("Before reversing an array");
			for(c=0; c<arr.length ;c++)	{
				System.out.print(arr[c]);
				System.out.println();
			}
			return arr;
		}
		
		public static int[] afterReverseAnArray(int[] arr1)	{
			System.out.println("Reversing an array");
			for(d=arr1.length-1;d>=0;d--)	{
				System.out.println(arr1[d]);
			}
			System.out.println("Array reversed");
			return arr1;
			
		}
		
		public static void compareTwoArrays(int[] first, int[] second)	{
			System.out.println("Comparing an array");
//			int arr1 = 0;
//			int arr2;
//			can i use Arrays class to comapare?
			}
			
		}
		
		
	


