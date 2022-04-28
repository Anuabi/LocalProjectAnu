package staticMethod;

public class StaticTwo {

	public static void callingSandNSFromStaticOne() {

		StaticOne NS = new StaticOne();
		NS.thisIsNonStaticMethod();
	
		
		StaticOne.thisIsStaticMethod();
	}

	public void callingSandNSFromStaticOne1() {
		StaticOne NS = new StaticOne();
		NS.thisIsNonStaticMethod();
		
		StaticOne.thisIsStaticMethod();

	}

}
