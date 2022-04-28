
//	*	For a .java file created class should have only public as a modifier.
//	*	Only .java class, "ChildClassInheritance" should have main method inside it.
//			public class ChildClassInheritance extends ParentClass {
//			
//				public static void childMethod1() {
//				}
//				public static void main(String[] args) {
//				}
//	*	Multiple class can be created within the class, but it should be of default.
//				class ParentClass {
				
//				}


//		There are 4 ways in creating object 

//		1. creating object for Parent class by using parent as reference class.
//		   The below code returns methods and variables present in parent class.
//			ParentClass para = new ParentClass();
//			ParentClass --> reference parent class
//			para --> object variable
//			new ParentClass() --> constructor of the class
		
//		2. creating object for child class by using child as reference class
//		   The below code returns methods and variables present in child class.
//			ChildClassInheritance ch = new ChildClassInheritance();
//			ChildClassInheritance --> reference child class
//			ch --> object variable
//			new ChildClassInheritance() --> constructor of the class
		
//		3. creating object for child class by using parent class as reference
//		   The below code returns methods and variables present in parent class.
//			ParentClass pc = new ChildClassInheritance();
//			ParentClass --> reference parent class
//			pc --> object variable
//			new ChildClassInheritance() --> constructor of the class
//			
//		4. creating object for parent class by using child as reference is not logical. So we cant create it.
//			Because parent cannot inherit child properties
//			ChildClassInheritance ch1 = new ParentClass();
//			
//		   ChildClass2 ccnextend = new ChildClass2();
//		   This ChildClass2 doesn't inherit parent class so obejct variable created would call only child methods and variables.
			
//ArithmeticException
package oops.inheritanceInJava;

public class ChildClassInheritance extends ParentClass {

	public static void childMethod1() {
		System.out.println("This is child class static method1");
	}

	public void childMethod2() {
		System.out.println("This is child class public method2");
	}

	public void commonMethod() {
		System.out.println("This is child class common method 3");
	}

	public static void main(String[] args) {
		childMethod1();
		ChildClassInheritance call = new ChildClassInheritance();
//		call.childMethod2();
		call.commonMethod();
//		call.parentMethod3();
//		call.parentMethod5();
		call.commonMethod();
		parentMethod6();
		System.out.println("a value is " +call.a);
		System.out.println("d value is " +call.d);
		System.out.println("d value is " +b);
		
		ParentClass para = new ParentClass();
		ChildClassInheritance ch = new ChildClassInheritance();
		ParentClass pc = new ChildClassInheritance();
//		ChildClassInheritance cp = new ParentClass();
		ChildClass2 ccnextend = new ChildClass2();
		ccnextend.child2Method();
		ccnextend.child2Method1();
		
		
	}

}

class ChildClass2 {
	int a = 10;
	public static int b = 11;
	public int d = 14;

	void child2Method() {
		System.out.println("This is parent class default method 3");
	}

	public void child2Method1() {
		System.out.println("This is parent class public method 5");
	}

}


class ParentClass {
	int a = 10;
	public static int b = 11;
	public int d = 14;

	void parentMethod3() {
		System.out.println("This is parent class default method 3");
	}

	public void parentMethod5() {
		System.out.println("This is parent class public method 5");
	}

	public static void parentMethod6() {
		System.out.println("This is parent class static method 6");
	}

	public void commonMethod() {
		System.out.println("This is parent class common method ");
	}
}
