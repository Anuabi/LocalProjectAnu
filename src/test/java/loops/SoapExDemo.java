package loops;

import java.util.Scanner;

public class SoapExDemo {

	static int balance,balance1,balance2,finalbalance;
	static int finalamt,shampoovalue;

	public static int buyDoveSoap() {
		int baseamount = 100;
		 balance = 0;
		System.out.println("Enter the soap cost");
		Scanner s = new Scanner(System.in);
		int soapvalue = s.nextInt();
		if (soapvalue <= baseamount) {
			balance = baseamount - soapvalue;
			System.out.println("Bought  Dove soap and the remaining balance is :" + balance);
			return balance;
		} else {
			System.out.println("Cannot proceed further as amount exceed the base amount 100 " + soapvalue);
//			exit();
		}
		return balance;

	}

	public static int buyHamam() {
		balance1 = buyDoveSoap();
//		if(balance1<100) {
		if (balance1 > 100) {
			exit2();

		} else if ((balance1 > 1) && (balance1 < 100)) {
			System.out.println("Proceed buying Hamam");
			System.out.println("Enter the Hamam cost");
			Scanner s = new Scanner(System.in);
			shampoovalue = s.nextInt();
			if (shampoovalue > balance1) {
				System.out.println("Amount exceeded the balance :" + balance1);
				System.out.println("Ends of purchase");
				
			}
			else {
				 finalamt = balance1 - shampoovalue;
				if (finalamt >= 0) {
					System.out.println("Bought Hamam soap and the remaining balance is: " + finalamt);
				} else {
					System.out.println("Amount exceeded the balance :" + balance1);
					System.out.println("Ends of purchase");
				}
				
				return finalamt;
			}
		} 
		return finalamt;
		
	}

	public static void buyChocolate() {
		 balance2 = buyHamam();
//			if ((balance2 > 100)||
//					(shampoovalue>finalamt))
//			{
//				exit2();
//			} 
			if (balance2 > 100)
					
			{
				exit2();
			} 

		 else if ((balance2 > 1) && (balance2 < 100)) {
			System.out.println("Enter the chocolate cost");
			Scanner s = new Scanner(System.in);
			int chocoltevalue = s.nextInt();

			if (chocoltevalue <= balance2) {
				int remain = balance2 - chocoltevalue;
				if (remain == 0) {
					System.out.println("Bought chocolate");
					System.out.println("Your balance is zero, you cannot buy any items further");
				} else if (remain > 0) {
					System.out.println("Bought all items with remaining balance as " + remain);
				}
			}
			if ((chocoltevalue > balance2)) {
				System.out.println("Exceeded the balance amount");
				System.out.println("Cannot purchase");
			} else {

				exit2();
			}
		}
	}

	public static void exit() {
		System.out.println("Please have enough amount to buy the products");
	}

	public static void exit1() {
		System.out.println("Shopping stopped");
	}

	public static void exit2() {
		System.out.println("Please visit again");
	}

	public static void main(String[] args) {
		buyChocolate();
	}
}
