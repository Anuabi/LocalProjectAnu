package loops;

public class Nestedloop2 {

	public static void main(String[] args) {
//		m1();
//		m2();
//		m3();
		m4();
	}

	public static void m2() {
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
//					break;
			}
			System.out.println();
		}
	}

	public static void m1() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
//					break;
			}
			System.out.println();
		}
	}

	public static void m3() {
		for (int i = 5; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void m4() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++)
			{
				System.out.print(i);

			}
			System.out.println();
		}
	}
}
