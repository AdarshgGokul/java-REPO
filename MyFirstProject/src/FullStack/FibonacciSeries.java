package FullStack;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String [] arg)
	{
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter the number of terms: ");
		int n= obj.nextInt();
		int a =0,b=1,c;
		
		
		for(int i=1; i<=n ; i++)
		{	 
			c=a+b;
			b=a;
			a=c;
			
			
			System.out.print(b+" ");
		}
	}
}
