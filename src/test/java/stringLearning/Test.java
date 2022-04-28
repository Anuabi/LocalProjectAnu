package stringLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		String s1 = "sathya knows anu by sathya";
		String s2 = "Sathya";
		 String regex=" * @return  {@code true} if, and only if, this string matches the * given regular expression\";";
				    
//		
//		StringBuffer build = new StringBuffer("Sathya");
////		System.out.println(build);
//		
//		System.out.println(s1==s2);
//		
//		
//		System.out.println(s1.equals(s2));
//	
//		System.out.println(s1.equals(build));
//		System.out.println(s1.contentEquals(build));
//		System.out.println(s1.compareTo(s2));
////		System.out.println(s1.contentEquals(s2));
//		
//		String str1 = "To find index of the string\" for char,string wit\"h; starting ide";
//		System.out.println(str1.startsWith("to"));
//		
//		System.out.println(str1.indexOf("string"));
//		System.out.println(s1.indexOf('t'));
//		System.out.println(s1.indexOf('a'));
//		System.out.println(s1.indexOf("t", 5));
		 
		String regex1=regex.replaceAll("@", "");
		System.out.println(regex1);
		String regex2=regex1.replace("*", "");
		System.out.println(regex2);
		String regex3=regex2.replace(" *","");
		System.out.println(regex3);
		String regex4=regex3.replace("{code","");
		System.out.println(regex4);
		String regex5=regex4.replace("}","");
		System.out.println(regex5);
		String regex6=regex5.replace("\"","");
		System.out.println(regex6);
//		String regex7=regex6.replaceAll("  "," ");
//		System.out.println(regex7);
//		String regex8=regex7.replaceAll("  "," ");
//		System.out.println(regex8);
		String regex7=regex6.replaceAll("  return   true","return true");
		System.out.println(regex7);
		
		String regEx1 = regex.replaceAll("@", "").replace("*", "").replace("{code","").replace(" *","").replace("}","")
				.replace("\"","").replaceAll("  return   true","return true");
		System.out.println(regEx1);
		
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.id("123")).click();
		
		WebElement ele = driver.findElement(By.id("11"));
		ele.click();
	}
	
	public void clickOnElement(WebElement ele) {
		ele.click();
	}

}
