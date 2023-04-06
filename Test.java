TEST 

1)constructor and its types:
		CONSTRUCTOR is a special METHOD.which is uesd to creating a OBJECT by using of NEW keyword and there is no constructor in the class.
		the java compiler povides default constructor by default .this is known as constructor.
		
		TYPES:
			default constructor
			parameterzised constructor.
			
2)features of Java:
		Simple
		Platform independence
		Object oriented 
		Roubset
		Secured
		MultiThread
		Dynamic
		High Performance
		Portable
		
		Explain:
			A)SIMPLE
				The java is very easy to learn and itz syntax is veay CLEAN,SIMPLE and EASY to understand.
				According to SUNMICRO sysstem the java program is simple to other programing language.Because itz syntax is c++ so easy for developers to learn it.
				
			B)PLATFORM INDENPENDENCE:
				The java code is run in any platform for example WINDOUS,OS etc...the java code is complied by the compiler and converted into bytecodes or .class files
				That .class is Platform independence.it shoud run in any platform.The CODE should WRITE ONCE and RUN ANY WHERE.
				
			C)OBJECT ORIENTED:
				The Object oriented programing language is based on concept of OBJECT COMUNICATED with SYSTEM.
				
			D)MULTI	THREAD:
				The java code is run in any platform and A THREAD is like a seprate PROGRAM.itz main advantage is Does not ocupy the memory for each THREAD.
				and it is used for multi media ,web server etc...
				
4)difference between JDK, JRE, and JVM:
		JDK: Java Developer Kit.
			The JDK is a java developer kit and it has JRE and complier
			and used convert .java files to .class files by using of compiler .the compiler present in JDK.
			
		JRE: Java Runtime Environment.
			The JRE is a java runtime environment and it has JVM and libearys.
			the libearys are stored some pre defined datatypes inside the libearys.
			
		JVM: Java Virutal machine.
			The JVM is used to Excuted the program after loading the .class in classloader.
			
5)types of memory areas are allocated by JVM:
			After loading the .class in classloader.the JVM looks for Main method . if the main method is there one STACK memory is created and STACK frame also created.
			In that STACK frame will Store the methods for primitive datatypes and new methods will found in the class create anthor STACK frame and so on.
			In non primitive datatypes the datatype and referance name asre store in STACK frame and the value for non primitive datatypes stored at HEAP memory in CONSTANT POOL.
			In HEAP memory has TWO types
					CONSTANT POOL AND INSTANTCE POOL:
			for example array All are store in INSTANTCE POOL because it creating new object and it has different ADDRESS.	
				
6)methods:
			DEFINE:
				A method is a function and collection of statement or block of code to perform some task or programs.itz achive the reuseablity of code.
				The method code write once and use it many times.and the METHODS will excuted only when we call.
				
			METHOD DECLERATION:
				In method decleration provides some imformation about METHOD ADRIBUTS.
					public static void main(String[] args)
					
				public: 
					The public is a access specifer . the access specifer is one of access types for that METHOD. in java provides four typrys for access specifer.
						public----it is accessable by all classes.
						private----it is accessable by only with in the class.
						producted----it is accessable by only with in the same package.
						default-----if there is no access specifer the java will provide default access specifer.
				
				static:
					static is non-access specifer.it can accessable by without creating a object in the class by using of static keyword.
					
				void:
					void is a return type. the return type is a datatype that returing the method. it may be all primitive datatype,String.
					By using of void can not returing any value. and using of primitive datatype,String are return the values.
					The return keyword is used to stop the excution flow.
					
				main: method name.
					The method name should be unqic name that is defined as a name of method.and the method is corresponding functionality to the method.
					
				(        ):parameters.
					The parameters are used to declear the datatypes and referance name.
					
7)method overloading with an example:
			DEFINE:
				The method overloading is having same method name but differnce in parameters.there are three ways to differciate
					1.number of parameters----call(int number);
					2.different datatypes-----call(int number,String name);
					3.order wise parameters----call(float ratio,int number,String name);
					
					public static void call(23)
					public static void call(23,"varun")
					public static void call(34.56f,23,"varun")
					
8) Constructors and method:
			Constructors:
				-The Constructors is a special method which is used to creating the object by using of new keyword.
				--if there is no constructor in the class the java compiler has default constructor by default.
				---constructor name must be same with class name.
				---there is no return types in Constructors.
			
			method:
				-A method is a function and collection of statement or block of code to perform some task or programs.
				---method name may or may not be same with class name.
				----it has return types.
				
9)static variables , static methods , static block:
			static variables:
				A variables declear as static that is called static variables. it is common think and creat only one copy.
			
			static methods:
				It can accessable by without creating a object in the class by using of static keyword.
			
			static block:
				It is used inizilation of static variables and the JVM excute the static block before the main method.
				the static block is  accessable by creating of object while excuting.
				
3)Java :
	java is a object oriented high level programing language and itz was developed by JAMES GOSLING in 1995 at SUNMICRO system. its was onwed by ORACAL.
	its is used for:moblie application web application etc...
	
10)constructor overloading:
	The constructor overloading is having same constructor name but differnce in parameters.there are three ways to differciate
					public class ConstructorTest{
					1.number of parameters----(int number);
					2.different datatypes-----(int number,String name);
					3.order wise parameters----(float ratio,int number,String name);
					
					public ConstructorTest(23)
					public ConstructorTest(23,"varun")
					public ConstructorTest(34.56f,23,"varun")
