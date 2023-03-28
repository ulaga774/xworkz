public class IndiaFlag1{
	
	Colours colour ;
	static int noOfSpokes ;
	byte noOfColours;
	
	
	
	public IndiaFlag1(Colours colour,byte noOfColours){
		this.noOfColours=noOfColours;
		this.colour=colour;
	}
	
	public static void main(String[] args) {
		IndiaFlag1 Flag =new IndiaFlag1(Colours.GREEN,(byte)4);
		
		System.out.println(Flag.noOfColours);
		System.out.println(Flag.colour.colour);
		
	}

	static{
		IndiaFlag1.noOfSpokes=24;
		System.out.println(IndiaFlag1.noOfSpokes);
	}
	
	public enum Colours{
		SAFFRON("saffron"),WHITE("white"),GREEN("green"),NAVYBLUE("navyblue");
		String colour;
		
		Colours(String colour){
		this.colour=colour;	
		}	
	}
}