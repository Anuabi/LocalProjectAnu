//	* In General, String is  sequence of characters or array of characters
//	* In java, String is a class.
//	* String class provides us many useful methods to validate a string/word
//	* Like Java, String is case sensitive (Shiva and shiva are different)
//	* String class is final in java. Hence we can not inherit it
//	* String can be defined in two ways
//		1) String literals
//			String str = "Sathya";
//			str - varibale name, it is stored in stack memory
//			Object - "Sathya" - is stored in "String constant pool (SCP)" section of Heap memory
//		2) By creating object 
//			String str = new String("Shiva");
//			Object - "Shiva" is stored in Heap memory as regular object vaules.
//	* In java, Strings are immutable
//		Why - 
	
	/*
	
	length()
	isEmpty()
	getCharAt()
	equals()
	equalsIgnoreCase()
	contentEquals()  
	compareTo()
	compareToIgnoreCase()
	startsWith()
	endsWith()
	hashCode()
	indexOf()
	lastIndexOf()
	substring()
	subSequence()
	concat()
	replace()
	matches()
	contains()
	split()
	join()
	toLowerCase()
	toUpperCase()
	trim()
	strip()
	stripLeading()
	stripTrailing()
	isBlank()
	toString()
	toCharArray()
	format()
	valueOf()
	repeat()
*/

package stringLearning;

public class DemoString {
	
	static String str = "Anusuya";
	
	public static void stringMethod()	{
//				To find the length of the string
		
			System.out.println(str.length());
			
//				To find if the string is empty
				//			Returns False
				//			String str1 = " ";
				//			System.out.println(str1.isEmpty());	
			
				String str1 = "";
				String str2="aNU:SUYA";
				String str3=" Anu Anu ";
				String trim=" A bc ";
				String str4="Anu Ram";
				String lead="  Ram";
				String prece="Ram ";
				String low="LOWER";
				String up="upper";
				String format="10";
				System.out.println(str1.isEmpty());
				
//				To find the char in the string
				System.out.println(str.charAt(6));
				
				
//				To find the string is equal to object of an another string or not 
				System.out.println(str.equals(str2));
				
//				To find two strings are equal or not by ignoring the case
				System.out.println(str.equalsIgnoreCase(str2));
				
				//how to check not equals
				System.out.println(!str.equalsIgnoreCase(str2));
				
				
//				To find the content of two strings
					//using char seq
				System.out.println(str.contentEquals(str2));
				
//				using String buffer
				System.out.println(str.contentEquals(str2));
				
//				To compare two strings
				
				System.out.println(str.compareTo(str2));
				System.out.println(str1.compareToIgnoreCase(str2));
				
				
//				To find string starts with prefix
				System.out.println(str.startsWith("A"));
				System.out.println(str3.startsWith(" "));
				System.out.println(str3.startsWith("  "));
				
				System.out.println(str.endsWith("a"));
				System.out.println(str3.endsWith(" "));
				System.out.println(str3.endsWith("  "));
				
				
//				To find hashcode
				System.out.println(str.hashCode());
				
//				To find index of the string for char,string with starting idex
				System.out.println(str.indexOf("n"));
				//doubt
				System.out.println(str.indexOf("Anu"));
				System.out.println(str.indexOf("u",1));
				System.out.println(str.indexOf(str3, 5));
				
//				To find last index of the string char and string with starting index
				System.out.println(str.lastIndexOf('u'));
				System.out.println(str.lastIndexOf("Anu"));
				System.out.println(str.lastIndexOf('u', 0));
				System.out.println(str.lastIndexOf("Anu",8));
				
//				To find sub-string with only begin index and returns string
				System.out.println(str4.substring(4));
				System.out.println(str4.substring(4, 7));
				
				
				System.out.println("*****To find sub-sequence of an string by giving index works same as substring****");
				System.out.println(str.subSequence(0, 4));
				
//				To concat two strings
				System.out.println(str.concat(str3));
				
//				To replace the string with new char
				System.out.println(str3.replace('u', 'e'));
				
				System.out.println(str3.replace('e', 'u'));
				
				
//				  * @return  {@code true} if, and only if, this string matches the
//						     *          given regular expression
//				To find the matches between two strings
				System.out.println(str.matches(str4));
				
//				To find the string contains sequence of word returns boolean
				System.out.println(str.contains("Anu"));
				
//				To split the string using sub-string
				System.out.println(str.split("Anu"));
				
//				To join the string with any delimiter
//				System.out.println(str3.join('-', "Anu"));
				
//				To covert the string to lowercase and Uppercase
				System.out.println(low.toUpperCase());
				System.out.println(up.toUpperCase());
				
//				To trim a string
				System.out.println(trim.trim());
				
//				To strip a string
				System.out.println(trim.strip());
				
//				String leading and trailing
				System.out.println(lead.stripLeading());
				System.out.println(prece.stripTrailing());
				
//				To find whether string is blank
				System.out.println(str1.isBlank());
				
//				To convert string to char array
				System.out.println(str3.toCharArray());

//				System.out.println(format.formatted("%");
				
				System.out.println(str.valueOf('a'));
				
//				To repeat the string 
				System.out.println(str.repeat(3).replaceAll("a", "a "));
	}
	

	
	public static void main(String[] args) {
		
//		String str1 = "\"Sathya\" - is stored in \"String constant pool (SCP)\" section of Heap memory";
//		String str2 = "Sathya\\\"Anu\Abi"; \"Anu"+\"\"Abi";
//		String str2 = "Sathya\"\\\";
//		String str="Anusuya";
		
		stringMethod();
			
	}
	

		

}
