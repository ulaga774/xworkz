public class StaticProgram {
	
	public static void main(String[] args) {
		
		System.out.println(program.ratio);
		System.out.println(program.value);
		System.out.println(program.marks);
		System.out.println(program.grade);
		System.out.println(program.bikenumber);
		
		program part = new program();
		System.out.println(part.number);
		System.out.println(part.percentage);
		System.out.println(part.isyours);
		System.out.println(part.name);
		System.out.println(part.phoneNumber);
		
	}
	public static class program{
		public program(){
			System.out.println("varun");
		}
		static float ratio = 2.4f;
		static int value = 5;
		static byte marks =75;
		static char grade = 'd';
		static short bikenumber = 4545;
		
		int number = 4573467;
		long phoneNumber = 904184;
		double percentage = 87.34d;
		boolean isyours = false;
		String name = "Tamil";
		
	}
}