package accessModifier2;

import accessModifier.ClassA;

public class ClassE  {
	public void printC() {
		ClassA test = new ClassA();
		System.out.println(test.a);
		System.out.println(test.b);
		System.out.println(test.c);
		System.out.println(test.d);
	}
	private void print2() {
		ClassA test = new ClassA();
		System.out.println(test.a);
		System.out.println(test.b);
		System.out.println(test.c);
		System.out.println(test.d);
	}
	
 protected void print3() {
	 ClassA test = new ClassA();
	 System.out.println(test.a);
		System.out.println(test.b);
		System.out.println(test.c);
		System.out.println(test.d);
	}
	}

}
