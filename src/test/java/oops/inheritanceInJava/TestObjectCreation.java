package oops.inheritanceInJava;

public class TestObjectCreation {
	
	

	public static void main(String[] args) {
		
		child2Method1();

	}

	int a = 10;
	public static int b = 11;
	public int d = 14;

	void child2Method() {
		System.out.println("This is parent class default method 3");
	}

	public static void child2Method1() {
		TestObjectCreation tc = new TestObjectCreation();
		System.out.println(" Value of a is: " + tc.a);
		System.out.println(" Value of a is: " + tc.d);
		System.out.println(" Value of a is: " + b);
		tc.child2Method();
		System.out.println("This is parent class public method 5");
	}

}
