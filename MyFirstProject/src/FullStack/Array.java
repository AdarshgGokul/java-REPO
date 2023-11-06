package FullStack;

public class Array {
	public static void main(String arg[])
	{
		String[] flower={"rose","Jasmin","Lilly","Sunflower","whiterose"}; 
		System.out.println(flower[2]);
		
		 
		
		int[][] num= {{1,2,3,4},{5,6,7,8,9}};
		System.out.println(num[1][2]);
		
		for(int i=1; i<=1 ;i++) {
			
		}
		
		String[] cars= {"BMW","audi","Volvo","Honda","Suzuki"};
		cars[0]= "Jaguar";
		System.out.println(cars.length);
		
		
		
		for(String j:cars) {
			System.out.print(j+" ");
		}
		
		
		for(int i=0; i<cars.length; i++) 
		{
			System.out.println(cars[i]);
		}
	}
}
