package firstPkg;

public class Calculations 
{


	public Calculations(int a, int b)
	{
		int c = a+b;
		
		System.out.println("addition of a&b using const: " + c);
		
	}
	
	
	public int sum()
	{
		float a = 20;
		int b = 30;
		float c = a + b ;
		
		System.out.println("sum of a&b: " + c);
		return b;
		
	}
	
	public int addition(int a, int b)
	{
		int c = a+b;
		
		System.out.println("addition of a&b: " + c);
		return c;
	}
	
	//40,50,60
	//x=40+50
	//x+60
	
	
	public Calculations()
	{
		int a = 100;
		int b = 200;
		int c = a+b;
		System.out.println("sum of a&b using constructor: " + c);
	}
	
	public static void main(String[] args) 
	{
		Calculations cal;
		cal = new Calculations();
		
		
		
		Calculations cal1 = new Calculations(500,600);
		
		cal1.sum();  //50
		int x = cal.addition(40, 50);
		cal.addition(x, 60);
		
		int y = cal.sum();
		System.out.println(y);
		cal.addition(100, y);
	}
	
	
}
