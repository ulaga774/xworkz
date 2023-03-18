public class StaticProgMethod {
	
	public static void main(String[] args) {
		
		
		
		
		
		System.out.println(program.ratio);
		System.out.println(program.name);
		System.out.println(program.noOfStroke);
		System.out.println(program.power);
		
		program model = new program("ulaga");
		
		System.out.println(model.serialNumber);
		System.out.println(model.combustionRatio);
		System.out.println(model.symbol);
		 program.call();
		 
		
		
	}
	public static class program{
		
		public program(String name){
			System.out.println(name);
		}
		static float ratio;
		static String name;
		static byte noOfStroke;
		static short power;
		static int weight;
		
		long serialNumber = 3675758465l;
		double combustionRatio =54.7587d;
		char symbol = 'e';
		

		
		static {
			program.ratio=45.485f;
			program.name="engine";
			program.noOfStroke=(byte)4;
			program.power=(short)474;
			program.weight=546;
			
			
			System.out.println(program.weight);
			
			System.out.println("loveYourEnemies");
		}
		public static void call(){
			long callToUlaga = 9360389212L;
			System.out.println(callToUlaga);
			
			program.call2();
		}
		public static void call2(){
			long callTokiran = 93689212L;
		System.out.println(callTokiran);
		}
	}
}