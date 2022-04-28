package arrays;

import java.util.Scanner;

public class ArrayPractice {

	/*
	 * Get array from user (length should be dynamic) print the array, then get the
	 * second value and check whether its greater than 10 or not.
	 * 
	 */

	int a1, a, b, vips;
	int[] check;
	int[] value;
	int pplname;
	int count=0;
	int word=0;
	Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayPractice a = new ArrayPractice();
//		a.printArray();
//		a.checkSecondValue();
//		a.asOneMethod();
//		System.out.println("End of array loop");

//		int[] test = a.createIntArray();
//		a.printIntArray(test);
//		a.validateIntArray(test, 1, 10);

//		int[] test1 = a.createIntArray(3);
//		a.printIntArray(test1);
//		a.validateIntArray(test1, 3, 10);

//		int[] test2 = a.createIntArray(3);
//		a.printIntArray(test2);
//		a.validateIntArrayWithTryCatch(test2, 3, 10);

//		a.cloneAnArray(a.createIntArray(3));
		
		
		int[] clonedArray = a.cloneAnArrayWithReturnType(a.createIntArray(3));
		a.validateIntArray(clonedArray, 2, 10);

//		a.printIntArray(a.createIntArray());
//		a.validateIntArray(a.createIntArray(), 1, 10);

	}

	public int[] createIntArray() {
		value = getLengthDynamically();
		System.out.println("Enter the name for the class");
		int a1[] = new int[value.length];
		for (b = 0; b < a1.length; b++) {
			Scanner s = new Scanner(System.in);
			a1[b] = s.nextInt();
		}
		return a1;
	}

	public int[] createIntArray(int length) {
		System.out.println("Enter the values for an array with length " + length);
		int a1[] = new int[length];
		for (b = 0; b < a1.length; b++) {
			Scanner s = new Scanner(System.in);
			a1[b] = s.nextInt();
		}
		return a1;
	}

	public int[] getLengthDynamically() {
		System.out.println("Enter the length of an array");
		a = s.nextInt();
		int b[] = new int[a];
		return b;
	}

	public void ArrayFullValidation() {
		value = getLengthDynamically();
		System.out.println("Enter the name for the class");
		int a1[] = new int[value.length];
		for (b = 0; b < a1.length; b++) {
			Scanner s = new Scanner(System.in);
			a1[b] = s.nextInt();
		}
		printIntArray(a1);
		validateIntArray(a1);
		validateIntArray(a1, 2, 10);
//		return a1;
	}

	public void validateIntArray() {
//		check = createIntArray();

		if (check[1] >= 20) {
			System.out.println("The Number " + check[1] + " is greater than 20");
		} else {
			System.out.println("The Number " + check[1] + " is less" + " than 20");
		}
	}

	public void validateIntArray(int[] xx) {

		if (xx[1] >= 20) {
			System.out.println("The Number " + check[1] + " is greater than 20");
		} else {
			System.out.println("The Number " + check[1] + " is less" + " than 20");
		}
	}

	public void validateIntArray(int[] xx, int index, int value) {
		if (xx[index] >= value) {
			System.out.println("The Number " + xx[index] + " is greater than " + value);
		} else {
			System.out.println("The Number " + xx[index] + " is less" + " than " + value);
		}
	}

	public void validateIntArrayWithTryCatch(int[] xx, int index, int value) {
		try {
			if (xx[index] >= value) {
				System.out.println("The Number " + xx[index] + " is greater than " + value);
			} else {
				System.out.println("The Number " + xx[index] + " is less" + " than " + value);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Please enter the index value less than " + index);
		}
	}

	public void printIntArray(int[] xyz) {

		for (int b = 0; b < xyz.length; b++) {
			System.out.println(xyz[b]);
		}
	}
	
	public void printBooleanArray(boolean[] xyz) {

		for (int b = 0; b < xyz.length; b++) {
			System.out.println(xyz[b]);
		}
	}
	
	public void printStringArray(String[] xyz) {

		for (int b = 0; b < xyz.length; b++) {
//			count++;
			System.out.println(xyz[b]);
//			if(xyz[b].equalsIgnoreCase("YOU"))	{
//				word++;
//			}
		}
//		System.out.println("No of words in the string: "+count);
//		System.out.println("The word you repeated: "+word);
	}
	
	public void printCharArray(char[] xyz) {

		for (int b = 0; b < xyz.length; b++) {
			System.out.println(xyz[b]);
		}
	}

	public void asOneMethod() {
		System.out.println("Enter the count of VIP's");
		vips = s.nextInt();
//		int[] count = new int[vips];
		String[] count = new String[vips];
		System.out.println("Enter the VIP's names");

		for (pplname = 0; pplname < count.length; pplname++) {
			count[pplname] = s.next();
		}

		for (String eachValue : count) {
			System.out.println(eachValue);
		}

		if (count[0].contains("Shinchan")) {
			System.out.println("This name is present in 0th index");
		} else {
			System.out.println("This name is not present in 0th Index");
		}

		System.out.println("Validated the invalid input of an array");

	}

	public void cloneAnArray(int arr[]) {
		arr.clone();
		System.out.println("Cloned array values are: ");
		printIntArray(arr);
	}
	
	public int[] cloneAnArrayWithReturnType(int arr[]) {
		arr.clone();
		System.out.println("Cloned array values are: ");
		printIntArray(arr);
		return arr;
	}

}

//			if(a1[2]>10)	{
////			
//				System.out.println("Number is greater than 10");
//			}
//			else {
//				System.out.println("Number is less than 10");
//			}
//		}
//	}
//}
//	

//	public void checkSecondValue()	{
//		 System.out.println("The second value is "+value[2]);
//		if(value[2]>10)	{
//			System.out.println("The second value is greater than 10");
//		}
//		else	{
//			System.out.println(+value[2] + "Less than 10");
//		}
//	}
//}

//	public void getNumbers()	{
//		System.out.println("ENTER THE COUNT OF NUMBERS");
//		Scanner s = new Scanner(System.in);
//		int a=s.nextInt();
//		for(int b=0; b<a; b++) {
//			System.out.println("The numbers are"+b);
//		}
//	}

//	public void getValuesBasedonLength()	{
//		for(int c=0;c<b.length;c++)	{
//			
//		}
//	}
//	
