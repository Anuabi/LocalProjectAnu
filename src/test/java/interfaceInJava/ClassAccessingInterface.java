package interfaceInJava;

public class ClassAccessingInterface implements InterfaceExample {
	
//	homeLoan--Public
//	goldLoan-Default
	
	
	
	ClassAccessingInterface obj = new ClassAccessingInterface();
	
	public void method1() {
//		obj.goldLoan();
		goldLoan();
		InterfaceExample.goldLoan1();
//		obj.q2 = 10;
	System.out.println(InterfaceExample.q2);
	System.out.println(InterfaceExample.e);
		
//		InterfaceExample.e=25;
		
//		obj.a = 25;	
		
	
	}

	@Override
	public void homeLoan() {
		// TODO Auto-generated method stub
		
	}
	
	
	
		
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
