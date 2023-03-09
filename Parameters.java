public class Parameters {
	
	public static void main(String[] args) {
		run("workout");
		call(775 ,"kiran");
		call(775 ,"kiran",true);
		call(775 ,"kiran",true,76,'c');
	}

	public static String run(String name){
		System.out.println(name);
		
	return "jagan";}
	
	
	
	public static int call(int number ,String name){
		
		System.out.println(name);
		System.out.println(number);
		
	return 100;}
	
	
	public static int call(int number ,String name ,boolean isYoursMobile){
		
		System.out.println(name);
		System.out.println(number);
		System.out.println(isYoursMobile);
		
	return 100;}
	
	
	public static int call(int number ,String name ,boolean isYoursMobile, long value, char options){
		
		System.out.println(name);
		System.out.println(number);
		System.out.println(isYoursMobile);
		System.out.println(value);
		System.out.println(options);
		
		
	return 100;
		
	}
}