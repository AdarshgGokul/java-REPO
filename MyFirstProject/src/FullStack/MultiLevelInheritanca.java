package FullStack;


class Goa{
	int rs= 15000;
	
	void enjoyment()
	{
	System.out.println("site Seeing ");
	
	}
}
	
	class Tanjore extends Goa{
		
	int ex=1000;
	void worship() {
		System.out.println("Going to the Temple");
	}
	}
	
	class Losvegas extends Tanjore{
	
	int dollar=100000;
	void visiting() {
		System.out.println("Exploring the city");
	}
	}








public class MultiLevelInheritanca {
	public static void main(String args[]) {
		
		Losvegas myObj = new Losvegas();
		System.out.println(myObj.dollar);
		System.out.println(myObj.rs);
		System.out.println(myObj.ex);
		myObj.worship();
		myObj.enjoyment();
		myObj.visiting();
		
		Tanjore myObj1 = new Tanjore();
			System.out.println(myObj.rs);
			System.out.println(myObj.ex);
			myObj.worship();
			myObj.enjoyment();
			
			
			Goa myObj2 = new Goa();
			System.out.println(myObj.rs);
			myObj.enjoyment();
			
	}
}


