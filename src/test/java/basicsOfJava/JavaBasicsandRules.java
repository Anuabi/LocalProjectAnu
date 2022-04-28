//* variable declared or initiated within a method cannot be used anywhere outside the method. Bcoz it scope ends within the method
//* Inorder to use it globally, we can assign it to class level variable and can be used anywhere 

//Can we declare static variable inside a static method or non-static method?, Explain
//		No. Because static belongs to a class and if we declare any variable as static inside any method, then it scopes end within it.
//		Purpose of making a variable as static is not satisfied. So it has to be always declared in class level so that it can be used
//		inside the class 

//Webdriver
//Excel read
//
//apache poi - jar
//Excel local - File class, we provide location of excel
//Excel name - extension based name. XSSFWorkBook, HSSFWorkBook
//sheet - find Sheet. getSheet method in above classes
//row and column
//
//
//fillo api
//
//
//WebDriver driver = new ChromeDriver();
//
//ChromeDriver driver = new ChromeDriver();
//
//
//
//WebDriver interface - parent 
//RemoteWebDriver Class - secon parent 
//ChromeDriver, FirefoxDriver Class - child
//\
//
//driver.manage().windows().maximize();

package basicsOfJava;

public class JavaBasicsandRules {
	static int a = 10;

	public void m1() {
//		static int a=10;
		int d = 20;
	}

	public static void m2() {
		int b = 10;
//		static int c=20;
	}

	public static void main(String[] args) {
//		static int e=20;
		int v = 10;

	}

}
