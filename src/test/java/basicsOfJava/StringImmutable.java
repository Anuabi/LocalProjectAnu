//String: is a sequence of character.
//String immutable means you cannot modify or change value

//Ways to create string:
//	1)String literals created by using double quotes.
//String str="1"
//String str2="2"
//String s3="2"
//String str2=str1+s3;

//O/P:
//	str=1
//	str2=4
//	str3=3

//2)String object created by using new keyword
//	String s= new string("anu")

//Why immutable?
//Although initially str2 and s3 values were pointing to value 2. In m/y allocation allocation only one 2 will be created and both str1 and s3 will be pointing to same variable
//When value changed for str2, new m/y will be allocated to str2 whereas still s3 will be pointing to value 2.
//Hence the value is not modified here if anyone of the variable value changes pointed by same object
