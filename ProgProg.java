public class ProgProg {
	
	
	String name;
	byte noOfStroke;
	short power;
	int weight;
	long serialNumber;
	float fuelRatio;
	double combustionRatio;
	char symbol;
	String brand;
	boolean isCarIsFourStroke;
	
	
	public ProgProg(String name){
	System.out.println(name);

	}
	public ProgProg(String name,byte noOfStroke){
	System.out.println(name);
	System.out.println(noOfStroke);

	}
	public ProgProg(String name,byte noOfStroke,short power){
	System.out.println(name);
	System.out.println(noOfStroke);
	System.out.println(power);
	}
	public ProgProg(String name,byte noOfStroke,short power,int weight){
	System.out.println(name);
	System.out.println(noOfStroke);
	System.out.println(power);
	System.out.println(weight);

	}
	public ProgProg(String name,byte noOfStroke,short power,int weight,long serialNumber){
	System.out.println(name);
	System.out.println(noOfStroke);
	System.out.println(power);
	System.out.println(weight);
	System.out.println(serialNumber);
	}
	public ProgProg(String name,byte noOfStroke,short power,int weight,long serialNumber,float fuelRatio){
	System.out.println(name);
	System.out.println(noOfStroke);
	System.out.println(power);
	System.out.println(weight);
	System.out.println(serialNumber);
	System.out.println(fuelRatio);
	}
	public ProgProg(String name,byte noOfStroke,short power,int weight,long serialNumber,float fuelRatio,double combustionRatio){
	System.out.println(name);
	System.out.println(noOfStroke);
	System.out.println(power);
	System.out.println(weight);
	System.out.println(serialNumber);
	System.out.println(fuelRatio);
	System.out.println(combustionRatio);
	}
	public ProgProg(String name,byte noOfStroke,short power,int weight,long serialNumber,float fuelRatio,double combustionRatio,char symbol){
	System.out.println(name);
	System.out.println(noOfStroke);
	System.out.println(power);
	System.out.println(weight);
	System.out.println(serialNumber);
	System.out.println(fuelRatio);
	System.out.println(combustionRatio);
	System.out.println(symbol);
	}
	public ProgProg(String name,byte noOfStroke,short power,int weight,long serialNumber,float fuelRatio,double combustionRatio,char symbol,String brand){
	System.out.println(name);
	System.out.println(noOfStroke);
	System.out.println(power);
	System.out.println(weight);
	System.out.println(serialNumber);
	System.out.println(fuelRatio);
	System.out.println(combustionRatio);
	System.out.println(symbol);
	System.out.println(brand);
	}
	public ProgProg(String name,byte noOfStroke,short power,int weight,long serialNumber,float fuelRatio,double combustionRatio,char symbol,String brand,boolean isCarIsFourStroke){
	System.out.println(name);
	System.out.println(noOfStroke);
	System.out.println(power);
	System.out.println(weight);
	System.out.println(serialNumber);
	System.out.println(fuelRatio);
	System.out.println(combustionRatio);
	System.out.println(symbol);
	System.out.println(brand);
	System.out.println(isCarIsFourStroke);
	}
	
	public static void main(String[] args){
		ProgProg name = new ProgProg("engine");
		ProgProg noOfStroke = new ProgProg("engine",(byte)4);
		ProgProg power = new ProgProg("engine",(byte)4,(short)360);
		ProgProg weight = new ProgProg("engine",(byte)4,(short)360,4500);
		ProgProg serialNumber = new ProgProg("engine",(byte)4,(short)360,4500,654658743268L);
		ProgProg fuelRatio = new ProgProg("engine",(byte)4,(short)360,4500,654658743268L,56.82f);
		ProgProg combustionRatio = new ProgProg("engine",(byte)4,(short)360,4500,654658743268L,56.82f,36.03293d);
		ProgProg symbol = new ProgProg("engine",(byte)4,(short)360,4500,654658743268L,56.82f,36.03293d,'L');
		ProgProg brand = new ProgProg("engine",(byte)4,(short)360,4500,654658743268L,56.82f,36.03293d,'L',"RollsRoyals");
		ProgProg isCarIsFourStroke = new ProgProg("engine",(byte)4,(short)360,4500,654658743268L,56.82f,36.03293d,'L',"RollsRoyals",true);
		
	}
}