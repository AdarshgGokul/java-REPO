package FullStack;

import java.util.Scanner;

public class Swaping {
	public static void main(String[] arg) 
	{
		Scanner obj= new Scanner (System.in);
		System.out.println("Enter the number :");
		int num_1= obj.nextInt();
		int num_2 = obj.nextInt();
		num_1= num_1 + num_2;
		num_2= num_1 - num_2;
		num_1= num_1 - num_2;
		
		System.out.println(num_1+""+num_2);
	}
	 

}
