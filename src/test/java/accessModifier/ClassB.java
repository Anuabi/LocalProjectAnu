package accessModifier;

public class ClassB {
	
	public void printC() {
		ClassA test = new ClassA();
		System.out.println(test.a);
		System.out.println(test.b);
		System.out.println(test.c);
		System.out.println(test.d);
		System.out.println(ClassA.sss);
	}
	void print1() {
		ClassA test = new ClassA();
		System.out.println(test.a);
		System.out.println(test.b);
		System.out.println(test.c);
		System.out.println(test.d);
		System.out.println(ClassA.sss);
	}
	
	 private void print2() {
			ClassA test = new ClassA();
			System.out.println(test.a);
			System.out.println(test.b);
			System.out.println(test.c);
			System.out.println(test.d);
			System.out.println(ClassA.sss);
		}
	
	 protected void print3() {
			ClassA test = new ClassA();
			System.out.println(test.a);
			System.out.println(test.b);
			System.out.println(test.c);
			System.out.println(test.d);
			System.out.println(ClassA.sss);
		}
	 	}

