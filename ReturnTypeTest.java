public class ReturnTypeTest {
	
	public static void main(String[] args){
		
	int round = run(5);
	System.out.println(round);
	
	String name	= boy("varun");
	System.out.println(name);
	
	long price = car(12435734);
	System.out.println(price);
	
	char options = find('d');
	System.out.println(options);
	
	float percentage = maths(93.65f);
	System.out.println(percentage);
	}
	
	
	
	
	public static int run(int round){
		return 100;
	}
	public static String boy(String name){
	return "kiran";
	
	}
	public static long car(long price){
	return 1235732;
	}
	public static char find(char options){
	return 'a';
	}
	public static float maths(float percentage){
	return 83.2f;
	}
}