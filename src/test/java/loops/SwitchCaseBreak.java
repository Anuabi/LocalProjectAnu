//*	In switch case we can have multiple cases with or wothout default
//* 1.With default:
//	1.1	If we have default in switch case, then it will be useful for invoking any method declared inside default for incorrect input
//	1.2	passed dynamically or during run time which is not covered in case.
//*	2.Without default:
//	If we don't use default and gives any input which is not covered in case..it simply comes out of switch case and control 
//	goes to next line of program.
//		2.1	if any kinda validation code is written for input we passed then it throws error.
//		2.2	if there is no validation code written . Then it just terminates the program. No error will be thrown

//What if there is no break statement in switch case?
//
//*	It is good practice to have break statement for each case. As case is specifically written for one particular condition 
//	to execute 
//*	If there is no break statement in case 1, then it won't throw error.Program keeps on executing all the other cases until it finds break statement.
//			e.g
//			switch(condition) {
//			case 1:
//				code
//			case 2:
//				code;
//				break;
//			default:
//				code
//			}
//	If it finds any break statement in any of the cases it comes out of switch case and execute outside loop code.
//			same example as above
//	If it don't find break statement, it keeps executing till default statement code and then proceeds further with outside loop code
//	switch(condition) {
//	case 1:
//		code
//	case 2:
//		code;
//	default:
//		code
//	}
//	code;

package loops;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SwitchCaseBreak {

	WebDriver Driver;
//	int browserName;
	String browserName;

	public void browserOpenUsingNumber() {
		System.out.print("Please select the browser of your choice, 1-firefox, 2-IE and chrome for any other choice: ");
//		switchCaseForBrowserOpening();
	}

	public void firefoxBrowserConfig() {
		System.setProperty(DriverforBrowser.firefox,DriverforBrowser.firefoxPath);
		Driver = new FirefoxDriver();
	}

	public void ieBrowserConfig() {
		System.setProperty(DriverforBrowser.ie,DriverforBrowser.iePath);
		Driver = new InternetExplorerDriver();

	}

	public void chromeBrowserConfig() {
		System.setProperty(DriverforBrowser.chrome,DriverforBrowser.chromePath);
		Driver = new ChromeDriver();
	}

	public void switchCaseForBrowserOpeningbyNumbeString() {
		System.out.println("I am in to this method");
		Scanner s = new Scanner(System.in);
//		browserName = s.nextInt();
		browserName = s.next();
		System.out.println(browserName);
		switch (browserName) {
		case "1":
			
			firefoxBrowserConfig();
//			break;
			System.out.println("Firefox opened");

		case "2":
			System.out.println("Starting IE");
			ieBrowserConfig();
			System.out.println("IE Opened");
//			break;

//		default:
//			chromeBrowserConfig();
		}

//		System.out.println(Driver.getTitle());
//		System.out.println("Browser opened is " + browserName);
	}
//	public void switchCaseForBrowserOpeningbyNumbeInteger() {
//		System.out.println("I am in to this method");
//		Scanner s = new Scanner(System.in);
//		browserName = s.nextInt();
//		System.out.println(browserName);
//		switch (browserName) {
//		case 1:
//			firefoxBrowserConfig();
//			break;
//
//		case 2:
//			ieBrowserConfig();
//			break;
//
//		default:
//			chromeBrowserConfig();
//			break;
//		}
//
//		System.out.println(Driver.getTitle());
//		System.out.println("Browser opened is " + browserName);
//	}
	
	
	public static void main(String[] args) {
		SwitchCaseBreak s = new SwitchCaseBreak();
		s.browserOpenUsingNumber();
		s.switchCaseForBrowserOpeningbyNumbeString();
//		System.out.println("Success");
	}
}
