package FullStack;

import java.util.Scanner;

public class ParlourSinario {
	public static void main (String arg[])
	{
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = myObj.nextInt();
		
		if(age>=18)
		{
			System.out.println("Enter your Membership card detail (yes/no)");
			String card = myObj.next();
			if (card.equals("yes"))
			{
				System.out.println("you are eligible for 10% of discount ");
			}
			else if(card.equals("no"))
			{
				System.out.println("you are eligible for 5% of discount");
			}
			else
			{
				System.out.println("Invalid membership input ");
			}
		}
		else
		{
			System.out.println("you are not eligible for any discount");
		}
		
		
	}
	}


