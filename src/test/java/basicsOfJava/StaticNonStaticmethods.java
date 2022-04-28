//What is static and how to call static methods?
//Static is a keyword in java
//can be used with variables and methods
//when a variable or method is static belongs to the class. we can call anywhere within class directly.
//if you want to call from other class, then use of classname is necessary
//classname.methodname

//can you access static methods or variable using obj reference?
		
//		Yes , but it throws warning message to access static method in static way.
//		The static method thisIsStaticMethod() from the type StaticOne should be accessed in a static way

//What is NS and how to call Non-Static method?
//NS is a default method in java program without static keyword in preceding of method name return type
//NS can be called only using object creation and will be stored in heap m/y
//Whenver an obj is created it will be stored in stack m/y will take a copy from Heap m/y during runtime and access the Non-static variables
//Obj's in stakc m/y will be pointing to NS methods or varaibles.