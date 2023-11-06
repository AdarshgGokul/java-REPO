class Main{
	static
	{
		System.out.println("static");
	}
	/*static int userMeth()
	{
		System.out.println("Hi");
		return 2;
	}*/
	void userMeth(){
		System.out.println("HI ALL");
	}
	void userMeths(){
		System.out.println("HI everyone");
	}

	public static void main(String arg[])
	{
		// Object Creation
		Main d=new Main();
		d.userMeth();
		d.userMeths();
		/*System.out.println(userMeth()+"Hello");*/
		System.out.println("Hello");
	}
}

