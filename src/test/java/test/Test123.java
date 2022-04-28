package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test123 {

	public static void main(String[] args) {
//		ArrayList<Integer> al = new  ArrayList<Integer>();
//		HashSet<Integer> hs = new  HashSet<Integer>();
//		List<Integer> al = new  ArrayList<Integer>();
		Set<Integer> al = new  HashSet<Integer>();
//		al.add(10);
//		al.add(-2);
//		al.add(31);
//		al.add(14);
//		al.add(5);
		
		al.add(10);
		al.add(-2);
		al.add(31);
		al.add(14);
		al.add(5);
//		System.out.println(al);
//		System.out.println(hs);
		
		for(Integer each: al) {
			System.out.println(each);
		}
		
		
		
	}

}
