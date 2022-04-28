//* this keyword is used to call instance/class variables and methods
//	* We can use this., to differentiate run time variables and instance variables;
//	* Also by using this., we can assign runtime values to instance variables
//	* We can use this(), to call other constructors from any constructors

//* When we call a non static method from a non static method in a same class, "this.." is used implicitly while calling
//	* calling a  method(), is same as this.method()



//* "this" is used to call instance variable or differenciate instance variable from local variable
//* "this()" is used in method calling (calling non static from non static in same class) and to call one constructor from another constructor
//* this() MUST be first statement in constructor calling
//		- Constructor call must be the first statement in a constructor
//* We dont need to use "this", to call a static method from a static method within a class. Because static always belongs to class.
//		* Also applies to main method since its static in nature
//		* So simply we can say that, we can not use "this" inside a static method
//* "this()" should be written as first line of code in constructor calling.


package keywordsInJava;

public class ThisDemo {
	
	public int num = 20;
	public int test = 44;
	
	public ThisDemo(int num) {
		this("Anu");
		this.num = num;
		num = this.num;
		int a = 10;
		System.out.println(num);
		System.out.println(test);
		System.out.println(this.num);
	}
	
	
	public ThisDemo(String str) {
		System.out.println(num);
		
	}
	
	public ThisDemo() {
		this(30);
	}


	public void method1() {
		System.out.println(num);
		System.out.println(test);
		System.out.println(this.test);
		System.out.println(this.num);
		System.out.println("This is method1");
	}
	
	public void method2() {
		ThisDemo test = new ThisDemo(50);
		ThisDemo test1 = new ThisDemo();
		test.method1();
		System.out.println("This is method2");
		this.method1();
		method1();
		method4();
		this.method4();
	}

	public static void main(String[] args) {
//		this.test=30;
		method4();
		ThisDemo test = new ThisDemo(50);
		test.method1();
		

	}
	
	public static int method3(int num) {
		System.out.println(num);
//		System.out.println(test);
//		System.out.println(this.num);
		System.out.println("This is static method3");
		return num;
	}
	
	public static void method4() {
		System.out.println("This is static method4");
		method3(5);
	}

}
