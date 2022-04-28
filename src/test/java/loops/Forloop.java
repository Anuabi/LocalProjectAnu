package loops;

public class Forloop {

	public static void forloopmethod() {
		int serialno = 1;
		System.out.println("For loop starts");
		for (int num = 1; num <= 10; num++) {
			System.out.println("Serial no " + serialno);
			System.out.println("\tNumber" + num);
			serialno++;
			if (num == 10) {
				System.out.println("For loop ends here");
			}
		}
		System.out.println("Outside For Loop");
	}

	public static void foreachmethod() {
		System.out.println("************");
		System.out.println("For each loop starts");
		String studname[] = { "anu", "abi" };
		for (String name : studname) {
			System.out.println("Sudent in class A " + name);
			if (name == "anu") {
				System.out.println("Student gender is female");
			}
			else {
				System.out.println("Student is male gender"+name);
			}
		}
		System.out.println("For each ends here");
	}

	public static void conditionforloop() {
		int a = 10;
		int b = 20;
		int c = 30;
		System.out.println("*************");
		System.out.println("Condition loop starts ");
		if (a > b && a > c) {
			System.out.println("The largest number is " + a);
		} else if (b > c && b > a) {
			System.out.println("The largest number is " + b);
		} else {
			System.out.println("The largest number is " + c);
		}
		System.out.println("Condition loop ends here");
	}

	public static void main(String[] args) {
		forloopmethod();
		foreachmethod();
		conditionforloop();

	}
}
