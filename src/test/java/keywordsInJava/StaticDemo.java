//	* static is a keyword in java
//	* It can be used with both methods and variables
//	* static variables and methods are belongs to class
//	* static will be stored in heap memory
//	* This means, we don't need to create Object of an class to access static methods and variables inside a class
//	* In order to use the static variables and methods outside of a class, we need to access it using it's respective Class Name
//	* If we keep all the methods and variables of an class as static, that class is called tightly encapsulated class
//	* we can overload a static method but we can not override a static method
//	* we can not declare static variable inside a static or non static method 
//		* because scope of variable declared inside a method ends once method get executed. (method behavior)
//		* static means, it belongs to the class, mean it can be accessed by any methods of the class or other class (static behavior)
//		* Since method and static having exactly opposite behavior, we cant use static inside any method




package keywordsInJava;

public class StaticDemo extends ParentStaticDemo {

	public static int a = 10;
	public static int b = 10;
	public int c = 10;

	static public void method1() {
		final int a1 = 10;
		System.out.println("Value of a1 is " + a1);
//			b=20;
//			c=20;
//			d=20;
	}

	static public void method2(int x) {
		System.out.println("value of x is: " + x);
	}

	static public void method2(int x, int y) {
		System.out.println("Value of x and y is" + x + " " + y);
	}

	public void method2() {
		final int b1 = 10;
		System.out.println("Value of a1 is " + b1);
//			a=20;
		super.method2();
		System.out.println(super.xx);
	}

	public static void main(String[] args) {
		method2(20);
		method2(30, 40);
		FinalDemo f = new FinalDemo();
		f.method2();
		f.method2();
		

	}

}

class ParentStaticDemo {

	static public void method1() {

		System.out.println("Parent final method1");
	}
public final int xx=10;
	public  void method2() {
		int y=30;
//		yy=y;
		System.out.println("Parent class non-static method");
	}
	public final void method3() {
		System.out.println("Parent class non-static method");
	}
	static {
		 int z=20;
		System.out.println("I am static block");
	}
}
