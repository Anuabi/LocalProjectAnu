//	* static keyword is used to define block too.
//	* static block runs even before main method
//	* static block used to set value to a static variable even before main method
//	* value set to the static variable by static block, wont change through out the execution of class, unless we change it explicitly
//	* we can not use static keyword inside a static block;

//* Static block cannot be public,protected,default,private,final. It should always have static keyword followed by body.
//* We can have multiple static block within a class and also we can have in child/parent classes
//*	Variables declared inside static block should be static in nature  . We cannot have any access modifier for the variable except final 
//* Method calling can be done in static block. We can call both static and non-static methods.
//		Static method can be called  direct .
//		Non-static method can be called only by creating object
//		We can also call another class's static methods by using classname

package keywordsInJava;

public class StaticBlockDemo {
	static int xx = 33;
	static int a = 10;
	static {
//		static int b=10;
		int c = 20;
		c = xx;
//		public int x=2;
		final int cc = 2;
//		cc=xx;
		System.out.println("child static block");
		System.out.println(c);
		childmethod2();
		StaticBlockDemo s = new StaticBlockDemo();
		s.childmethod3();
//		childmethod3();
		ParentStaticBlockDemo.method2();
		ParentStaticBlockDemo.method3();

	}

	public static void childmethod2() {
		System.out.println("i m static method");
	}

	public void childmethod3() {
		System.out.println("i m static method");
	}

	public static void main(String[] args) {
//		System.out.println(ParentStaticBlockDemo.b);
//		ParentStaticBlockDemo p= new ParentStaticBlockDemo();
//		p.method1();
//		ParentStaticBlockDemo.method2();
		ParentStaticBlockDemo.method3();
	}

}

class ParentStaticBlockDemo {

	static final int b = 20;
	static {
		System.out.println("i m static block");
	}
//	  private static {
//			System.out.println("i m static block");
//		
//	  public static {
//			System.out.println("i m static block");
//		}
	static {
		System.out.println("i m static block2");
	}

//	public void method1()	{
//		System.out.println("i m normal method");
//	}
	public static void method2() {
		System.out.println("i m static method");
	}

	public final static void method3() {
		System.out.println("i m static method");
	}
}
