
//Three types of m/y management in java
//	Stack, Heap, SCP(String constant pool)

//Stack:
//Main purpose of object creation is to access non-static variables and methods
//When obj is created, object variable is stored in stack memory and it points to to Heap m/y variables/methods
//All non-primitive datatypes will be stored in stack m/y(int,float,double)except string.
	
//Heap:
//All  non-static variables and methods will be stored in Heap m/y.
//Objects in stack m/y will take a copy from Heap m/y during runtime and acess the Non-static variables

//SCP:String constant pool
//	String str="ANU"--Strig literals
//	or
//	String s= new string("Anu")--String object
	
//	Here str will be stored in stack memory and ANU will be stored in SCP m/y
