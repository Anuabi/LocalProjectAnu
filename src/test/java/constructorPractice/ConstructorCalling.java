package constructorPractice;

public class ConstructorCalling extends parentConstructorClass {

	public ConstructorCalling() {
		super();
		
		System.out.println("I am child class constructor");
	}
	
	public ConstructorCalling(int a ) {
//		super();
//		super(a);
		System.out.println("I am child class parameterized constructor");
	}
	
	public ConstructorCalling(int a, int b ) {
		super(a); 
//		super(b);
//		parentConstructorClass(b);
		System.out.println("I am child class parameterized constructor");
	}
	

	public static void main(String[] args) {
//		ConstructorCalling test = new ConstructorCalling();
		
	ConstructorCalling test = new ConstructorCalling(20);

		ConstructorCalling test1 = new ConstructorCalling(10,30);
		
	}

}

class parentConstructorClass {

	public parentConstructorClass() {

		System.out.println("I am parent class constructor");
	}
//	
	public parentConstructorClass(int a) {

		System.out.println("I am parent class parameterized constructor");
	}
	public parentConstructorClass(int a,int b) {

		System.out.println("I am parent class two parameterized constructor");
	}
}
