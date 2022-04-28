package staticMethod;

public class StaticOne {

//	* method name should be in detail and naming should be camel case format
//	* We should not be creating class, variable, package and method names by using java key words
//		such as public, final, int, class etc
//	* Class name should start with Caps and followed by camel case
//	* package name should start with small letter and followed by camel case
//	* variable name also should follow package naming rules

	public static int a = 2;
	public int b = 3;

	public static void thisIsStaticMethod() {
		System.out.println("This is staic method");
	}

	public void thisIsNonStaticMethod() {
		System.out.println("This is Non-static method");
	}

	public static void callingStaticAndNonStaticMethod1() {
		thisIsStaticMethod();
//		We can refer static method from static method directly, because static method belongs to class. So we can simply call it within the class from anywhere . 
//		So we don't go for object creation within a class

//		thisIsNonStaticMethod();--> we cannot refer non static method to static method, hence go for object creation.

		StaticOne callNS = new StaticOne();
		callNS.thisIsNonStaticMethod();
	}

	public void callingStaticAndNonStaticMethod2() {
		thisIsNonStaticMethod();
		thisIsStaticMethod();

//		Doubt: so non-static method can be accessed by another non-static method in both ways.
//		which one is beneficial?
// try with object creation4
		StaticOne callNS1 = new StaticOne();
		callNS1.thisIsNonStaticMethod();

//	callNS1.thisIsStaticMethod();
//	The static method thisIsStaticMethod() from the type StaticOne should be accessed in a static way

	}
}
