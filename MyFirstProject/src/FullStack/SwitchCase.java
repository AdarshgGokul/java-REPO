package FullStack;

import java.util.Scanner;

public class SwitchCase {
	public static void main (String args[])
	{
		Scanner obj= new Scanner (System.in);
		System.out.println("enter the Month in number :");
		int Month=obj.nextInt();
		switch(Month)
		{
		case 1:
			System.out.println("the month is Janauary");
			break;
		case 2:
			System.out.println("the month isFeb");
			break;
		case 3:
			System.out.println("the month is March");
			break;
		case 4:
			System.out.println("the month is April");
			break;
		case 5:
			System.out.println("the month is May");
			break;
		case 6:
			System.out.println("the month is June");
			break;
		case 7:
			System.out.println("the month is July");
			break;
		case 8:
			System.out.println("the month is Augest");
			break;
		case 9:
			System.out.println("the month is September");
			break;
		case 10:
			System.out.println("the month is October");
			break;
		case 11:
			System.out.println("the month is November");
			break;
		case 12:
			System.out.println("the month is December");
			break;
			default:
			
				System.out.println("Not valid");
			
			
			
		}
	}
}
