package oops.polymorphism.overriding;

public class MethodOverridingEx2 extends Parent {

	public  void call() {
		System.out.println("child method");
	}

	public static void main(String[] args) {
		
		
		MethodOverridingEx2 cr = new MethodOverridingEx2();
		System.out.println(
				"Obj created for chilclass with childclass as reference and expecting child class methods to print in console");
		cr.call();

		Parent pr = new Parent();
		System.out.println(
				"Obj created for parent with parent class as reference and expecting parent class methods to print in console");
		pr.call();

//		Here comes the overriding concept where parent class method is been overriden by child class method call()
		Parent pr1 = new MethodOverridingEx2();
		System.out.println(
				"Obj created for child with parent class as reference and expecting parent class methods to print in console");
		pr1.call();
	}
}

class Parent {
	public  void call() {
		System.out.println("parent method");
	}
}
