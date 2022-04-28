//* Constructor is not a method
//* Constructor name should be as same as Class Name
//* Constructor does not have any return type
//* Constructor can be parameterized or non parameterized
//* Constructor belongs to the class
//* Constructor used to assign values to instance variables, especially when they are private or final
//* Each class have its own constructor(default constructor) and it is hidden always (means implicitly available)
//* When we create a parameterized constructor, default constructor dies. Means, we can not create object without parameters. 
//		* In the same situation, if you want to create object without parameters, you need to explicitly define default constructor
//* Whenever we create object for a class, after copying non static variables and methods, default constructor will always run;
//		* Since default constructor is implicit and does not have anything in it, we dont see it running
//		* If we explicitly put something in default constructor, while object creation, we can see it running

//* How to call constructor?
//	It can be called by creating an object.
//	By default when an object is	created default constructor will be called implicitly. 
//		ConstructorDemo test = new ConstructorDemo();
//	Also you can call parameterized constructor by passing parameter explicitly .
//		ConstructorDemo test1 = new ConstructorDemo(10);
//	
//* How to assign a value to a final variable?
//		1.1	Final variable assigned value:
//			eg: final int c=10;
//		Once we assign the value to final variable globally , we cannot re-assign or change the 
//		value of final variable either in constructor or normal method.
		
//		1.2 Final variable not initialized:
//			If final variable is declared but not initialized. Then the following are possible
//				*We must initialize the final variable value in each constructor inside a class
//				*If we initialize value inside normal method , then it throws error final variable cannot be assigned.
		

//* How to call one constructor from another?
//		* We can call one contructor from another constructor when inheritance concept is applicable.
//		* As we know when we create class, default constructor is always created and it is implicit in nature.
//		* So, when we create object for child class, firstly, child class default contrcutor will be called, but within child class constryctor, super() is implicitly present,
//			and it will call parent class's default constructor. 
//		* Event if we create parameterized object for child class, parameterized child class constryuctor will always run parent class's default constructor and executes the 
//			child class's parameterized constructors content.
//		* We can not overload a constructor, without explicitly defining default constructor

//* Can constructor can be private?
//		* Yes we can make it as private. But it cannot be used/call outside the class.
//		* Which means, if a constructor is private, we can not creat object for that class in some other class.

//*	Can constructor be static?
//		No, we can have only public,private and protected modifier for the constructor.
//			public static ConstructorDemo()-->Not permitted
//			public  ConstructorDemo()-->Permitted

//* Explicitly writing default constructor is called overriding.
//* Once we explicitly write default constructor, then only we can overload the constructor

package constructorPractice;

public class ConstructorDemo extends Test {

	public int a;
	private int num;
//	final int c=10;
	final int c;

//	public ConstructorDemo() {
//	}

	public ConstructorDemo() {
		c = 10;
		System.out.println("This is basic constructor");
	}

	public ConstructorDemo(int num) {
		this.c = 30;
		this.num = num;
		System.out.println("This is parameterized constructor");
	}

	public void method1() {
//		int d = 5;
//		c = 20;
		System.out.println("This is a method");
	}

//	public static void main(String[] args) {
//		ConstructorDemo test = new ConstructorDemo();
//		test.method1();
//		System.out.println(test.a);
//		test.a = 10;
//		System.out.println(test.a);
//		System.out.println(test.num);
//		test.method2();
//	}

	public static void main(String[] args) {
		ConstructorDemo test = new ConstructorDemo();
//		test.c = 100;
		System.out.println(test.c);
		test.method1();
		test.method2();
//		System.out.println(test.c);
	}

}

class Test {
	public void method2() {
		ConstructorDemo test1 = new ConstructorDemo(10);
		System.out.println(test1.c);
	}
}

