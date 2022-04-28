package stringLearning;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import arrays.ArrayPractice;

public class HomeStringHashMap {

	static int count=0;
	static String s="You must give appropriate credit, provide a link to the license, "
			+ "and indicate if changes were made. You may do so in any reasonable manner, "
			+ "but not in any way that suggests the licensor endorses you or your use.";
	static String[] s1=s.toUpperCase().replaceAll(",","").split(" ");
 //	public static  String[] dothisonString()	{
//		ArrayPractice ap = new ArrayPractice();
//		ap.printStringArray(s1);
//		return s1;
//	}
	
	static char[] c;
	
	public static void Dupcharacter() {
		 String name = "Anusuya Ramanathan";
		 c = name.toUpperCase().replaceAll(" ", "").toCharArray();
		
	}
	
	
	
public static void checkDuplicateWordsinSentence()	{
	System.out.println(s);
	ArrayPractice ap = new ArrayPractice();
	ap.printStringArray(s1);
	Map<String,Integer> m= new HashMap<String,Integer>();
	for(String words: s1) {
		if(m.containsKey(words)) {
			m.put(words, m.get(words)+1);
//			System.out.println("Count increased for "+words);
		}
		else
		{
			m.put(words, 1);
//			System.out.println("value added in map "+words);
		}
	}
	Iterator<Map.Entry<String, Integer>> entrySetIterator1 = m.entrySet().iterator();
	while(entrySetIterator1.hasNext()) {
//		Do not use this as next refers to next index of the value(e.g Key index 0, next reads index 1 of the valaue)
//	System.out.println(entrySetIterator1.next().getKey()+" : "+entrySetIterator1.next().getValue());
		Map.Entry<String, Integer> entry = entrySetIterator1.next();
		System.out.println(entry.getKey() +" is repeated "+entry.getValue()+" times");
	}
		
	
}

public static void checkDuplicateCharacterinWord()	{
	Dupcharacter();
	ArrayPractice ap = new ArrayPractice();
	ap.printCharArray(c);
	Map<Character,Integer> m= new HashMap<Character,Integer>();
	for(Character character: c) {
		if(m.containsKey(character)) {
			m.put(character, m.get(character)+1);
		}
		else
		{
			m.put(character, 1);
		}
	}
	Iterator<Map.Entry<Character, Integer>> entrySetIterator1 = m.entrySet().iterator();
	while(entrySetIterator1.hasNext()) {
		Map.Entry<Character, Integer> entry = entrySetIterator1.next();
		System.out.println(entry.getKey() +" is repeated "+entry.getValue()+" times");
	}
		
}
	
	
		

	public static void main(String[] args) {
		
//		checkDuplicateWordsinSentence();
		checkDuplicateCharacterinWord();
	}

}
