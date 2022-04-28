package loops;

//* Outer for loop responsible for ROW
//* Inner for loop responsible for ROW's each column

public class NestedForLoop {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
					System.out.print(j+" ");
//					System.out.print(" ");
			}
			
			System.out.println();
			System.out.println();
		}
		
	}
}
