package multiDimArray;

import java.util.Arrays;

public class JaggedArray {
	
//	* Jagged array is nothing but, arrays of arrays but each arrays can have different column values
//	* In Jagged array, length is nothing but total rows
//	* We can print jagged array by using for loops only. 
//	* We can not simply use sysout or Arrays class methods to print jagged array

	public static void main(String[] args) {
		String batchMates[][] = {
				{"Sathya", "Gopal", "Sekar", "Bala"},
				{"Shiva", "Tamil"},
				{"Syed", "Sasi", "Ragul"}
		};
		System.out.println(batchMates.length);
		
//		System.out.println(batchMates);
//		System.out.println(Arrays.toString(batchMates));
		
		for(String eachBatchMates[]:batchMates) {
			System.out.println(Arrays.toString(eachBatchMates));
		}
		
		for(int i=0; i<batchMates.length;i++) {
			for(int j=0;j<batchMates[i].length;j++) {
//				System.out.println(batchMates[i][j]);
			}
		}
	}

}
