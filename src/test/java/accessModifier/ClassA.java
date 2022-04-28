package accessModifier;

public class ClassA {
	int a = 10;
	private int c = 10;
	protected int d = 10;
	public int b = 10;
	public static int sss = 20;
	String str = "Sathya";

	public void print() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(sss);
	}
	
	 void print1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(sss);
	}
	 private void print2() {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			System.out.println(sss);
		}
	 protected void print3() {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			System.out.println(sss);
		}
	public static void main(String[] args) {
		ClassA obj1 = new ClassA();
		System.out.println(obj1.a);
		System.out.println(obj1.sss);
		System.out.println(sss);
		
	}
	
	public static void method() {
		
	}
	
}
