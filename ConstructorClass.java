public class ConstructorClass{
	
	public ConstructorClass(){   
		System.out.println("ConstructorClass");
	}
	public ConstructorClass(long value){   
		System.out.println(value);
	}
	public ConstructorClass(String name){   
		System.out.println(name);
	}
	public ConstructorClass(byte marks){   
		System.out.println(marks);
	}
	public ConstructorClass(char grade){   
		System.out.println(grade);
	}
	
	
	
	public static void main(String[] args){
		ConstructorClass view = new ConstructorClass();
		ConstructorClass value = new ConstructorClass(14353634);
		ConstructorClass name = new ConstructorClass("kiran");
		ConstructorClass marks = new ConstructorClass(75);
		ConstructorClass grade = new ConstructorClass('d');
		
		
		
	}
	
	
	
	
}

