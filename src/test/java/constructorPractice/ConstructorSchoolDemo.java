package constructorPractice;

import org.openqa.selenium.interactions.Actions;

public class ConstructorSchoolDemo {
	
	public String name, age, std, school;
	
	public ConstructorSchoolDemo() {
		school = "ABC";
	}
	
	public ConstructorSchoolDemo(String schoolName) {
		school = schoolName;
	}
	
	public ConstructorSchoolDemo(String StuName, String stuAge, String StuSTD, String schoolName) {
		name = StuName;
		age = stuAge;
		std = StuSTD;
		school = schoolName;
	}

	public static void main(String[] args) {
		ConstructorSchoolDemo stu1 = new ConstructorSchoolDemo();
//		System.out.println("Stu1 name is Anu");
		stu1.name = "Anu";
		stu1.age = "2";
		stu1.std = "1";
//		stu1.school = "ABC";
		
		System.out.println(" Stu1 details " +stu1.name+" "+stu1.age+" "+stu1.std+" "+stu1.school);
		
		
		ConstructorSchoolDemo stu2 = new ConstructorSchoolDemo();
		stu2.name = "Sathya";
		stu2.age = "20";
		stu2.std = "1";
//		stu1.school = "ABC";
		
		System.out.println(" Stu2 details " +stu2.name+" "+stu2.age+" "+stu2.std+" "+stu2.school);
		
		ConstructorSchoolDemo stu3 = new ConstructorSchoolDemo("CD");
		stu3.name = "Sathya";
		stu3.age = "20";
		stu3.std = "1";
//		stu1.school = "ABC";
		
		System.out.println(" stu3 details " +stu3.name+" "+stu3.age+" "+stu3.std+" "+stu3.school);
		
		
		ConstructorSchoolDemo stu4 = new ConstructorSchoolDemo("AAA", "11", "2", "XX");
		System.out.println(" stu4 details " +stu4.name+" "+stu4.age+" "+stu4.std+" "+stu4.school);
		
		Actions act = new Actions();
	}

}
