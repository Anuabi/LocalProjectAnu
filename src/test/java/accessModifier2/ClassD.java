package accessModifier2;

import accessModifier.ClassA;

public class ClassD extends ClassA {

	public void printC() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
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
}





