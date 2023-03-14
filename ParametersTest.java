public class ParametersTest {
	
	public static void main(String[] args) {
		
		call("varun");
		call (12,"kiran");
		call ('a',true);
		call (12.4f);
		call (43.3257325d);
		call (108);
		
		
	}
	public static void call(String name){
		System.out.println(name);
	
	}
	public static void call(int value ,String name){
		System.out.println(value);
		System.out.println(name);
		
	}
	public static void call(char grade ,boolean isYourLaptop){
		System.out.println(grade);
		System.out.println(isYourLaptop);
	
	}
	public static void call(float ratio){
		System.out.println(ratio);
	
	}
	public static void call(double percentage){
	System.out.println(percentage);
	
	}
	public static void call(byte number){
	System.out.println(number);
	}
	
}