package interfaceInJava;

public interface InterfaceExample2 extends InterfaceExample{

//	homeLoan--Public
//	goldLoan-Default
	@Override
	default void homeLoan() {
		// TODO Auto-generated method stub
		
	}
	@Override
		default void goldLoan() {
			// TODO Auto-generated method stub
			InterfaceExample.super.goldLoan();
		}
}
