package oopsConcept;

public class DemoStatic 
{

	static int a = 20;
	
	public static void meth1()
	{
		
		System.out.println(a);
	}
	
	public void meth2()
	{
		System.out.println(a);
		System.out.println("this is simple method");
	}
	
	
	public static void main(String[] args) {
		
		
		DemoStatic.meth1();
		
		
		DemoStatic ds = new DemoStatic();
		
		ds.meth2();
	}
}
