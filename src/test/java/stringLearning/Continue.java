package stringLearning;

import arrays.ArrayPractice;

public class Continue {

	public static void main(String[] args) {
		for(int i= 1; i<5;i++) {
//			continue;
			if(i==3) {
				continue;
//				System.out.println(i);
			}
			for(int j=1;j<=4;j++) {
				System.out.println("******"+j);
			}
			System.out.println(i);
		}

	
	boolean[] arr = new boolean[3];
	ArrayPractice ap = new ArrayPractice();
	ap.printBooleanArray(arr);
	
	String str = new String();
	System.out.println(str);

	}
}
