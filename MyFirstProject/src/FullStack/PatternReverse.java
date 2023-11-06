package FullStack;

import java.util.Scanner;

public class PatternReverse {
	public static void main(String args[])
	{
		Scanner myObj= new Scanner(System.in);
		System.out.println("Enter the value : ");
		int row = myObj.nextInt();
		int i,j;
		for(i=0;i<=row;i++)
		{
			for(j=0;j<=row-i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}


 