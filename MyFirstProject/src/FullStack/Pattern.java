package FullStack;

import java.util.Scanner;

public class Pattern {
	public static void main(String args[])
	{
		Scanner myObj= new Scanner(System.in);
		System.out.println("Enter the value : ");
		int row = myObj.nextInt();
		int i,j;
		
		//right angle triangle
		for(i=0;i<=row;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
