package FullStack;

public class ArithmeticExcepti {
	public static void main (String args[]) {
		int a=99;
		int b = 0;
		
		
		try {
		
			//02
		String str= null;
		System.out.println(str.length());
		
			//03
		int d[]=new int [5];
		d[6]=11;
		System.out.println(d);
		
		// 01
		int c=a/b;
		System.out.println(c);
		}
		
				//03
				catch(ArrayIndexOutOfBoundsException st) {
					System.out.println(st);
					
				System.out.println("hai everyone");	
				}
				
		
			//02
		catch(NullPointerException em) {
			System.out.println(em);
			System.out.println("all is Well");
			
		}
			//01
		catch(ArithmeticException ex) {
			System.out.println(ex);
			System.out.println("hello");
		}
		finally {
			System.out.println("IT will print anyway if the error occur also ");
		}
			
	}
}
