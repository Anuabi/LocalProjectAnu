package arrays;

import java.util.Scanner;

public class DuplicateArray {
	
	static Scanner s = new Scanner(System.in);
	static int a,b,c,x,y,count;
	
	
	public static int[] sizeofAnArray()	{
		System.out.println("Enter the size of an array");
		a = s.nextInt();
		int size[] = new int[a];
		System.out.println("Enter the array values with duplicates");
		for(b=0;b<size.length;b++) {
			size[b]=s.nextInt();
		}
		return size;
	}
	
	public static int[] printArray(int[] len)	{
		System.out.println("Printing an array");
		for(c=0;c<len.length;c++)	{
			System.out.println(len[c]);
		}
		return len;
	}
	
	
	
	public static void checkDuplicate(int[] elements)	{
		
		boolean[] visited = new boolean[elements.length];
		for(x=0;x<elements.length;x++)	{
			count=0;
			if(visited[x]) {
				continue;
			}
			for(y=x+1;y<elements.length;y++) {
				
				if(elements[x]==elements[y]) {
					System.out.println("Duplicate element in this array is "+elements[y]);
					count++;
					visited[y] = true;
					
				}
			}
			if(count==0) {
				continue;
			}
			System.out.println("Count of the word  " +elements[x]+ "  is  " +(count+1));
		}
		
		}
	

	public static void main(String[] args) {
		
		checkDuplicate(printArray(sizeofAnArray()));
		
		ArrayPractice ap = new ArrayPractice();
//		checkDuplicate(ap.printStringArray(sizeofAnArray()));
	}

}
