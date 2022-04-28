//	* abstract is a class not interface
//	* abstract is a keyword in java. 
//	* This keyword can be used with methods and classes
//	* abstract class can have both abstract and non-abstract(concrete) methods
//	* If we create an abstract method in a normal class, that normal class should be converted to abstract class
//	* In an abstract class, there is no mandatory that it should have an abstract method
//	* We can not create object for an abstract method
//	* If any class wants to follow an abstract class, we need to use "extends" keyword.
//	* If a class extends abstract class, then it should implement all the unimplemented abstract methods of the abstract class
//  * If a abstract class implements an interface, it will not force to implement the unimplemented methods in interface.
//	* abstract method can be either public or protected or default(without default keyword). 

package abstractInJava;

public abstract class AbstractExample implements InterfaceAbstract {

	public void method1() {

	}

	public abstract void rule1Method();
//	abstract void rule1Method1();
//	protected abstract void rule1Method2();
//	private abstract void rule1Method3();
//	public abstract static void rule1Method4();
	
	

	public void method2() {

	}

	void method3() {

	}

	private void method4() {

	}

	protected void method5() {

	}
	
	public static void method6()
	{
		
	}

//	AbstractExample obj = new AbstractExample();

}

//RBI interface - abstract methods
//HDFC class - implementation of abstract methods + concrete methods + methods using abstract keyword
//kodak class - implementation of abstract methods in HDFC class