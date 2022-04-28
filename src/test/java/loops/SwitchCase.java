package loops;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SwitchCase {

	WebDriver Driver;
	String browserName;

	public void browserOpenUsingNumber() {
//		WebDriver Driver;
		System.out
				.println("Please select the browser of your choice, 1-firefox, 2-IE and chrome for any other choice: ");
		switchCaseForBrowserOpening();
	}

	public void browserOpenUsingName() {

		System.out.println("Please Enter the browser name your wish to open: ");
		switchCaseForBrowserOpening();
	}


	public void firefoxBrowserConfig() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Abi\\Downloads\\geckodriver-v0.30.0-win32\\geckodriver.exe");
		Driver = new FirefoxDriver();
	}

	public void ieBrowserConfig() {
		System.setProperty("webdriver.ie.driver",
				"C:\\Users\\Abi\\Downloads\\IEDriverServer_Win32_4.0.0\\IEDriverServer.exe");
		Driver = new InternetExplorerDriver();

	}

	public void chromeBrowserConfig() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Abi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		Driver = new ChromeDriver();
		

//public class Constants {
//public static String chrome = "webdriver.chrome.driver";
//public static String chromePath = "C:\\Users\\Abi\\Downloads\\chromedriver_win32\\chromedriver.exe";
//System.setProperty("Constants.chrome", "Constants.chromePath");
//}
//	System.setProperty(Constants.chrome, Constants.chromePath)	;
		
	}

	public void switchCaseForBrowserOpening() {
		Scanner s = new Scanner(System.in);
		browserName = s.next();

		switch (browserName) {
		case "Firefox":
			firefoxBrowserConfig();
			break;

		case "IE":
			ieBrowserConfig();
			break;

		default:
			chromeBrowserConfig();
			break;
		}

		System.out.println(Driver.getTitle());
		System.out.println("Browser opened is " + browserName);
	}
	
	public static void main(String[] args) {

		SwitchCase s = new SwitchCase();
//		s.browserOpenUsingNumber();
		s.browserOpenUsingName();
	}
}
