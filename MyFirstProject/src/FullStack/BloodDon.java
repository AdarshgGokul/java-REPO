package FullStack;

import java.util.Scanner;

public class BloodDon {
	public static void main(String arg[]) 
	{
		Scanner blood= new Scanner(System.in);
		System.out.println("Enter your age:");
		int age= blood.nextInt();
		System.out.println("Enter your weight:");
		int weight=blood.nextInt();
		
		if(age>=18)
		{
			if(weight>= 45)
			{
				System.out.println("you are eligible");
			}
			else
			{
				System.out.println("you are not eligible");
			}
		}
		else
		{
			System.out.println("your are in under age catag so your not eligible");
		}
	}

}
