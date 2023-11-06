package FullStack;

import java.util.Scanner;

public class SunTiming{
	public static void main(String arg[])
	{
		System.out.println("Sun raises and sets");
		Scanner obj = new Scanner (System.in);
		System.out.println("Enter the Time:");
		int time= obj.nextInt();
		
		if(time>=5 && time<=8)
		{
			System.out.println("Sun raises with the plesent climate");
		}
		else if(time>=8 && time<=11)
		{
			System.out.println("in this time sun temperature is 28 degree");
		}
		else if(time>=11 && time<=15)
		{
			System.out.println("in this time sun temperature is 36 degree");
		}
		else if(time>=15 && time<=19)
		{
			System.out.println("in this time sun temperature is very low compare others");
		}
		else
		{
			System.out.println("Sun sets after evening");
		}
	}

}
