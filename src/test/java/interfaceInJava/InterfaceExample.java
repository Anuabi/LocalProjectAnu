//	* In interface, methods should be abstract, means methods should not have body
//	* We can not create object for an interface because there is no use in creating it.
//	* By using interface we can achieve abstraction
	
//	* We link a class and a interface using "implements" keyword.
//	* Classes which follows an interface should implement those abstract methods present in interface
	
//	* In interface we can have methods with body but those methods should be either default or static or private. But private can be used only within interface
//	* Inorder to call static method of an interface in any implemented class, we need to call the method by using interface name.
//	* Inorder to call default method of an interface in any implemented class, we need to create object for that class and call the method.
	
//	* To link interface with another interface, we use "extends" keyword. While doing this, it wont force us to implement the methods of parent interface in child interface
//	* The variables declared in interfaces are default,final,static and public in nature BUT those variables should be initialized
//	* The variables decalered in interfaces are final in nature.
//	* In interface, only public, private, abstract, default, static and strictfp are permitted

//example 
//public interface SearchContext {
//	  List<WebElement> findElements(By by);  --> abstract method in interface
//		accessModifier - default
//		static/non-static - non-static
//		return type - List<WebElement>
//		method signature - findElements(By by) - Its a parameterized method. By is a class and by is object of By class.
//
//	  WebElement findElement(By by);

//	}

package interfaceInJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public  interface InterfaceExample {

 public void homeLoan();
 
 
//protected void personalLoan();
 
//private void eduLoan()
//{
//	
//}
 
 default void goldLoan()
 {
	 
 }
 
 public static void goldLoan1()
 {
	 System.out.println("gold loan");
 }
 

 
// public int f;
// 
 public int a=10;
// protected int b=11;
// private int c=12;
// int d=13;
 public static int e=14;
// private static int q;
// public static int q1;
 public final int q2=10;
 

	
	
}
