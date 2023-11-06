package FullStack;

class Friend1{
	int ch1= 1;
	void chandler() {
		System.out.println("Funny character");
	}
	
}

class Friend2 extends Friend1{
	int ch2= 2;
	void ross() {
		System.out.println("carry character");
	}
	
}

class Friend3 extends Friend2{
	int ch3= 3;
	void rachel() {
		System.out.println("Model Character");
	}
	
}



public class FriendsSeries {
	public static void main(String args[]){
		
		Friend3 myObj = new Friend3();
		System.out.println(myObj.ch1);
		System.out.println(myObj.ch2);
		System.out.println(myObj.ch3);
		myObj.chandler();
		myObj.ross();
		myObj.rachel();
		
		Friend2 myObj1 = new Friend2();
		System.out.println(myObj.ch1);
		System.out.println(myObj.ch2);
		myObj.chandler();
		myObj.ross();
		
		Friend3 myObj2 = new Friend3();
		System.out.println(myObj.ch1);
		myObj.chandler();
		
		
		
		
	}

}
