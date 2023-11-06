package FullStack;

public class EncapsulationBill {
	public static void main(String args[]) {
	Encapsulation myObj= new Encapsulation();
	myObj.setfood("Biriyani");
	System.out.println(myObj.getfood());
	myObj.setprice(120);
	System.out.println(myObj.getprice());
	}
}
