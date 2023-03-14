public class ConstructorTest {
	
	public ConstructorTest(){
	System.out.println("itzDeflautConstructor");

	}
	public ConstructorTest(String name){
	System.out.println(name);

	}
	public ConstructorTest(char grade){
	System.out.println(grade);

	}
	public ConstructorTest(boolean isyouAreADrinker){
	System.out.println(isyouAreADrinker);

	}
	public ConstructorTest(int value){
	System.out.println(value);

	}
	public static void main(String[] args){
		ConstructorTest display = new ConstructorTest();
		ConstructorTest name = new ConstructorTest("varun");
		ConstructorTest grade = new ConstructorTest('d');
		ConstructorTest view = new ConstructorTest(true);
		ConstructorTest percentage = new ConstructorTest(87);
	}
}