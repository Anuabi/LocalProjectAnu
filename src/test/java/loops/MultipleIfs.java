package loops;

import java.util.Scanner;

// Ctrl + Shift + O - for import

public class MultipleIfs {

	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		for(int i=0; i<=2;i++) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		if(a>50)
		{
			System.out.println("This number is greater than 50 "+a);
		}
		if(a>60)
		{
			System.out.println("This number is greater than 60 "+a);
		}
		else {
			System.out.println("This number is less than 50 "+a);
		}
	
		}
	}
}
	


