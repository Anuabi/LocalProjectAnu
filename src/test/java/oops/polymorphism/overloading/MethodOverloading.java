//OverLoading: 
//	* Also called as compile time polymorphism and It happens within a same class
//	* It is based on method signature. (method name(arguments/parameter))
//	* Method name should same
//	* Parameters should be different
//		Based on parameters method signature would vary
//			1) number of parameters
//			2) type of parameters
//			3) order of parameters
//	*can we overload static method in java?
//		Yes we can have two or more static method with same name but difference in input parameter.

package oops.polymorphism.overloading;

public class MethodOverloading {

//	public void goOut() {
//		System.out.println("Method without parameter");
//	}
	public static void goOut() {
		System.out.println("Method without parameter");
	}

//	public void goOut(int a) {
//		System.out.println("Method with int parameter");
//	}
	public static void goOut(int a) {
		System.out.println("Method with int parameter");
	}

//	public void goOut(String name) {
//		System.out.println("Method with String parameter");
//	}
	public static void goOut(String name) {
		System.out.println("Method with String parameter");
	}

//	public void goOut(int a, String name) {
//		System.out.println("Method with integer and string parameter");
//	}
	public static void goOut(int a, String name) {
		System.out.println("Method with integer and string parameter");
	}

//	public void goOut(String name, int a) {
//		System.out.println("Method with string name and integer as parameter");
//	}
	public static void goOut(String name, int a) {
		System.out.println("Method with string name and integer as parameter");
	}

	public static void methodOverloading() {
//		MethodOverloading mo= new MethodOverloading();
//		mo.goOut();
//		mo.goOut(10);
//		mo.goOut(11,"anu");
//		mo.goOut("anu", 11);

		goOut();
		goOut(10);
		goOut("anu");
		goOut(11, "anu");
		goOut("anu", 10);

	}

	public static void main(String[] args) {
		methodOverloading();
	}

}
