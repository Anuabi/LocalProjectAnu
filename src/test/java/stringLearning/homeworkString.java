package stringLearning;

import java.util.Arrays;

import arrays.ArrayPractice;

public class homeworkString {
	static int x;
	static int y,count,words=0;
	static String s="You must give appropriate credit, provide a link to the license, and indicate if changes were made. You may do so in any reasonable manner, but not in any way that suggests the licensor endorses you or your use.";
	static String[] s1=s.toUpperCase().split(" ");
	
	public static  String[] dothisonString()	{
		ArrayPractice ap = new ArrayPractice();
		ap.printStringArray(s1);
		return s1;
	}
	
public static void checkDuplicate(String[] elements)	{
		boolean[] visited = new boolean[elements.length];
		for(x=0;x<elements.length;x++)	{
			count=1;
			if(visited[x]) {
//				System.out.println("****"+visited[x]);
				continue;
			}
			
			for(y=x+1;y<elements.length;y++) {
				
				if(elements[x].equals(elements[y])) {
					System.out.println("Duplicate element in this array is "+elements[y]);
					count++;
					visited[y] = true;
					
				}
			}
			if(count==1) {
				continue;
			}
			System.out.println("Count of the word  " +elements[x]+ "  is  " +(count));
			
		}
		
		}

	public static void main(String[] args) {
		checkDuplicate(dothisonString());
	}
}
