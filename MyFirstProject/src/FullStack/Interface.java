package FullStack;

interface BaseA{
	void display(); 
	
}

interface BaseB{
	void display2(); 
	
}








public class Interface implements BaseA,BaseB {
	
	

	@Override
	public void display2() 
	{
			System.out.println("Hello everyone");	
		
		
	}

	@Override
	public void display() 
	{
			System.out.println("Hello everyone");		
	}
	public static void main(String args[]) {
		
		Interface ic =new Interface();
		
		ic.display();
		ic.display2();
	}
}
