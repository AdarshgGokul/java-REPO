package FullStack;

class Number{
	void display() {
		try {
			String str="two";
			int num=Integer.parseInt(str);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		System.out.println("error cleared");
	}
}




public class NumberFormatExecptionss {
	public static void main(String args[]) {
	Number num =new Number();
	num.display();
}
}
