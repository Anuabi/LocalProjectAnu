package arrays;

import java.util.Scanner;

public class SortArray {
	
	static int n, temp;  
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		sorting();
	}
	
	public static void sorting()	{
	System.out.print("Enter Array Size: ");  
	n = s.nextInt();  
	int a[] = new int[n];  
	System.out.println("Enter the elements of the array: ");  
	for (int i = 0; i < n; i++)   
	{  
	a[i] = s.nextInt();  
	}  
	System.out.println("Elements in the array Before sort");
	for (int i = 0; i < a.length; i++)   
	{  
	System.out.println(a[i]);  
	} 
	for (int i = 0; i < n; i++)   
	{  
		for (int j = i + 1; j < n; j++)   
			{  
				if (a[i] > a[j])   
				{  
					
				temp = a[i];  
				a[i] = a[j];  
				a[j] = temp;  
				} 
			}
	}
	System.out.println("Elements in the array after sort");
	for (int i = 0; i < a.length; i++)   
	{  
	System.out.println(a[i]);  
	}

	}
}
