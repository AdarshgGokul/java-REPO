package FullStack;

class ParentClass{
	int xs =10;
	void myMethod() {
		System.out.println("Im the base Class : ");
	}
}

class Child1 extends ParentClass{
	int a=11;
	void myMethod1() {
		System.out.println("Im the child class");
	}
}




public class SinlgeInhertanceE {
	
	public static void main(String args[]) {
		Child1 myObj =new Child1();
		System.out.println(myObj.a);
		System.out.println(myObj.xs);
		myObj.myMethod();
		myObj.myMethod1();
	}
}
