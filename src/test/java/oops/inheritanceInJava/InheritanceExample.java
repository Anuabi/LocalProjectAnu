// * parent class/ super class
// * child class/ sub class

//	* Inheritance is the process of using parent class methods/variables in child class.
//	* We achieve this by using keywords "extends" and "implements"
//	
//	* Class to Class inheritance OR interface to interface - we use extends keyword
//		* Example - Exception class extends Throwable class
//				  - ChromeDriver class extends RemoteWebDriver class
//				  - WebDriver interface extends SearchContext interface
//	* Class to interface - we use implements keyword
//		* Example - Throwable class implements Serializable interface
//				  - RemoteWebDriver class implements WebDriver interface

//	Multiple inheritance in Java 
//		1) is not possible by using Classes alone. So below line wont work
//			a) ClassA extends ClassB, ClassC, etc... 
//		2) is possible by using interfaces alone.
//			a) ClassA implements interface1, interface2, etc..
//		3) is possible by using classes and interface together. In this case, class name should be mentioned at first
//			a) ClassA extends ClassB implements interface1, interface2, interface3
//			b) ClassA implements interface1, interface2 extends ClassB - THIS IS NOT RIGHT ORDER TO WRITE
//	Multilevel inheritance in Java
//		1) is possible 
//			a)classA extends ClassB, ClassB extends ClassC


package oops.inheritanceInJava;

import org.openqa.selenium.chrome.ChromeDriver;

public class InheritanceExample {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
//		driver.manage().
	}

}


