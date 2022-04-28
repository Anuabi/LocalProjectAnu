package loops;

public class ForloopDemo {
	public static void forloopmethod() {
		System.out.println("for loop begins");
		for (int num = 1; num <= 10; num++) {
			int variable2 = 4;
			System.out.println("\tNumber" + num);
			if (num %2==0) {
				System.out.println("even num");
				int variable1 = 4;
				System.out.println(variable2);
			}
//			System.out.println(variable1);
		}
		System.out.println("Outside for Loop");
	}

	public static void main(String[] args) {
		forloopmethod();
	}

}
