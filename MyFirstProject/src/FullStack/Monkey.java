package FullStack;

import java.util.Scanner;

public class Monkey {
	public static void main(String args[])
	{
		System.out.println("A Monkey want to cross the River safely while the Crocodile is sleeping");
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter the time:");
		int time= obj.nextInt();
		
		if(time>=20 && time<=24)
		{
			System.out.println(" Night time the Crocodile is awake so Monkey cannot escape");
		}
		else if(time>=17 && time<=20)
		{
			System.out.println(" Evening time the Crocodile is Sleeping so Monkey can escape");
		}
		else if(time>=12 && time<=17)
		{
			System.out.print(" Afternoon time the Crocodile is awake so Monkey cannot escape wait till Evening");
		}
		else if(time>=5 && time<=12)
		{
			System.out.println(" Morning time the Crocodile is Sleeping so Monkey can escape");
		}
		else
		{
			System.out.println("Crocodile is awake so Monkey cannot escape");
		}
		
		
	}
	

}
