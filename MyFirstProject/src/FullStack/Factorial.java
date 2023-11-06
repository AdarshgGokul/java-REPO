package FullStack;

import java.util.Scanner;

public class Factorial {
	public static void main(String arg[])
	{
		Scanner num= new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n =num.nextInt();
		int factorial = 1;
		
		for(int i=1; i<=n; i++) 
		{
			factorial= factorial*i;
			System.out.println(factorial);
		}
	}

}
