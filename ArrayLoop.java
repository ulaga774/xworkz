public class ArrayLoop {
	
	public static void main(String[] args) {
		
	byte[] age = {22,34,56,76};
	int[] moneyInBank = {22987432,3268743,435464,48473};
	char unit = 'A';
	boolean asIAmDrinker = true;
	long day = 1947;
	String name = "varun";
	float ratio = 356.55f;
		
		
		for (int i=0;i<age.length;i++) {
		System.out.println(age[i]);
		
	}
		
		for (int i=0;i<moneyInBank.length;i++) {
		System.out.println(moneyInBank[i]);
	}
	
	
	
		if (asIAmDrinker!=false){
		System.out.println("itz correct");
	}
		else {
		System.out.println("itz not correct");
		}
		if (unit=='A'){
		System.out.println("unitForAmpere");
	}
		else {
		System.out.println("unitForAngle");
		}
		if (day==1947){
		System.out.println("itz Independence Day");
	}
		else {
		System.out.println("Itz Valentines Day");
		}
		if (name=="kiran"){
		System.out.println("kiran");
	}
		else {
		System.out.println("varun");
		}
		if (1+2.5!=3.5f){
		System.out.println("itz correct");
	}
		else {
		System.out.println("itz not correct");
		}
	}
}