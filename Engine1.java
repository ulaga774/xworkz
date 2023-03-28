public class Engine1{
	
	static String name;
	static int model;
	static double diaOfNozzle;
	static float sparyAngle;
	static int intakeValueClosure;
	
	final byte noOfCylinders;
	final float displacementVolume;
	final double connectingRodLength;
	final float compressionRatio;
	final short noOfNozzle;
	
	int injectionPressure=545;
	int engineSpeed=5654;
	float fuelMass=65.85f;
 	byte startOfInjection=54;
	long weight =54634564L;
	
	static String display="   ILoveYou  ";
	static String value = "varun";
	static String result = "varun";
	static String give = "varun";
	static String show = "varun";
	static String display1 = "nokiran";
	static String display2 = "hate";
	static String display3 = "mldMonk";
	static String display4 = "iNotAcoholic";
	
	
	
	Colours colour;
	Strocke noOfStrocke;
	Types type;
	
	
	public Engine1(byte noOfCylinders,float displacementVolume,double connectingRodLength,float compressionRatio,short noOfNozzle,Colours colour,Strocke noOfStrocke,Types type){
	this.noOfCylinders=noOfCylinders;
	this.displacementVolume=displacementVolume;
	this.connectingRodLength=connectingRodLength;
	this.compressionRatio=compressionRatio;
	this.noOfNozzle=noOfNozzle;
	
	this.colour=colour;
	this.noOfStrocke=noOfStrocke;
	this.type=type;

		
	}
	static{
		//static
		Engine1.name="caterpillar 3400 baseline";
		Engine1.model=3400;
		Engine1.diaOfNozzle=24.65d;
		Engine1.sparyAngle=35.85f;
		Engine1.intakeValueClosure=35;
		
		System.out.println(Engine1.name);
		System.out.println(Engine1.model);
		System.out.println(Engine1.diaOfNozzle);
		System.out.println(Engine1.sparyAngle);
		System.out.println(Engine1.intakeValueClosure);
	}
	
	public static void main(String[] args){
		Engine1 love =new Engine1((byte)1, 43.63f, 54.746d, 43.6757f,(short)6, Colours.BLACK, Strocke.TWO , Types.HYDRAULIC);
		//non static
		System.out.println(love.injectionPressure);
		System.out.println(love.engineSpeed);
		System.out.println(love.fuelMass);
		System.out.println(love.startOfInjection);
		System.out.println(love.weight);
		//final
		System.out.println(love.noOfCylinders);
		System.out.println(love.displacementVolume);
		System.out.println(love.connectingRodLength);
		System.out.println(love.connectingRodLength);
		System.out.println(love.noOfNozzle);
		//enum
		System.out.println(love.colour.colour);
		System.out.println(love.noOfStrocke.noOfStrocke);
		System.out.println(love.type.type);
		
		
		//method calling
		String view = display.trim();
		System.out.println(view);
		
		boolean  view1 =value.startsWith("ulaga varun");
		System.out.println(view1);
		
		boolean  view2 =value.endsWith("varun");
		System.out.println(view2);
		
		int view3 =result.lastIndexOf("english");
		System.out.println(view3);
		
		int view4 = give.indexOf("bat",5);
		System.out.println(view4);
		
		String view5 = show.substring(1,4);
		System.out.println(view5);
		
		String view6 = display1.substring(2);
		System.out.println(view6);
		
		String view7 = display2.concat("you");
		System.out.println(view7);
		
		String view8 = display3.replace('m','o');
		System.out.println(view8);
		
		String view9 = display4.replace("Not","am");
		System.out.println(view9);
	}
	enum Colours{
		BLACK("black"),GRAY("gray");
		String colour;
		Colours(String colour){
			this.colour=colour;
		}
		
	}
	
	enum Strocke{
		TWO("two"),FOUR("four");
		String noOfStrocke;
		Strocke(String noOfStrocke){
			this.noOfStrocke=noOfStrocke;
		}
	}
	
	enum Types{
		PNEUMATIC("pneumatic"),HYDRAULIC("hydraulic");
		String type;
		Types(String type){
			this.type=type;
		}
	}	
	
	public String makesTrim(String display){
		return "name";	
	}
	public String giveStartingWord(String value){
		return "name";
	}
	public String giveendWord(String value){
		return "name";
	}
	public String lastOne(String result){
		return "name";
	}
	public String giveindexOf(String give){
		return "name";
	}
	public String showsubstring(String show){
		return "name";
	}
	public String display1substring(String display1){
		return "name";
	}
	public String adding(String display2){
		return "name";
	}
	public String changeletters(String display3){
		return "name";
	}
	public String advanceChange(String display4){
		return "name";
	}
}