// 	* Also called as runtime polymorphism and it happens between two classes
// 	* In order to achieve this, we need to use inheritance concept and objection creation 
//		where we create obj for child class with parent class as reference class 
// 	* It based on method signature.
// 	* Inorder to achieve this, 
//		* Method name should be same
//		* Type, order and number of parameter should same between parent and child

package oops.polymorphism.overriding;

public class MethodOverridingChild extends MethodOverridingParent {
	public static void mv(int a) {
		System.out.println("Method overriding with parameter");
	}

	public static void mv1() {
		System.out.println("Method overriding without parameter");
	}

	public static void main(String[] args) {
//		MethodOverridingChild mvc = new MethodOverridingChild();
//		mvc.mv(0);
		mv(0);
		mv1();
		MethodOverridingParent.mv(0);
		MethodOverridingParent.mv1();

	

	}

}

class MethodOverridingParent {
	public static void mv(int a) {
		System.out.println("Parent Method overriding with parameter");

	}

	public static void mv1() {
		System.out.println("Parent Method overriding with parameter");
	}
}