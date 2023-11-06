package FullStack;

public class Stringjava {

	public static void main (String args[])
	{
		
		
		
	String alphabets = "abcdefghijklnmopqrstuvwxyz";
	System.out.println("the length is :" + alphabets.length());
	
	String a=" ";
	String name ="DARK";
	String name2 = "Computer"; 
	String name3 = "Clown";
	String name4 = "Rahul died";
	String text="I needs \"peace\"";
	
	
	System.out.println(text);
	System.out.println(name.toLowerCase()); // for converting toUppercase and toLowercase
	System.out.println(a.isBlank());
	System.out.println(a.isEmpty());
	System.out.println(name2.endsWith("r"));
	System.out.println(name.concat(" "+name3));
	System.out.println(name.charAt(3));		//returns the character at the specified index
//	System.out.println(name.compareTo(name3));
	System.out.println(name.equals(name3));
	System.out.println(name4.substring(0,8));
	System.out.println(name.replace("Je", "jE"));
	System.out.println(name2.replace("Computer", "Laptop"));
	System.out.println(text.trim());
	
	
	
	
	//BUFFER
	
	StringBuffer str = new StringBuffer("WELCOME");
	
	
	System.out.println(str.append(" java"));
	System.out.println(str.insert(1,"Hello all"));
	System.out.println(str.reverse());
	System.out.println(str.indexOf("l"));
	System.out.println(str.replace(0,1,"I"));
	
	//Builder
	
	StringBuilder tr =new StringBuilder("Hello World");
	
	
	System.out.println(tr.append(" java"));
	System.out.println(tr.insert(4, "into"));
	System.out.println(tr.reverse());
	System.out.println(tr.indexOf("l"));
	System.out.println(tr.replace(0,4,"ooo"));
	System.out.println(tr.capacity());


	
	
	
	

	
	}
}
