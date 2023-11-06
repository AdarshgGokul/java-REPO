package FullStack;

public class Constructor {
	String Name;
	int age;
	
	// Default Constructor
	public Constructor() {
		Name="Adarsh";
		age= 22;
	}
	// parameterized constructor
	public Constructor(String str, int n) {
		Name=str;
		age=n;
	}
	
	// Copy constructor
	public Constructor(Constructor other) {
		Name= other.Name;
		age= other.age;
		
	}
	
	
	
	public static void main(String args[]) {
		
		// Using default Constructor
		Constructor cc= new Constructor();
		 
		System.out.println(cc.Name);
		System.out.println(cc.age);
		
		//  Using parameterized constructor
		Constructor cc1= new Constructor("clown",70);
		System.out.println(cc1.Name);
		System.out.println(cc1.age);
		
		// Using copy constructor
		
		Constructor cc2= new Constructor(cc1);
		System.out.println(cc2.Name);
		System.out.println(cc2.age);
	}

}
