package oopsConcept;

public class CallDemoInterface implements DemoInterface
{

	
	public void m1() 
	{
		
		System.out.println("this is interface method1");
	}

	
	public void m2() 
	{
		System.out.println("this is interface method2");
		
	}
	
	public static void main(String[] args) {
		CallDemoInterface ci = new CallDemoInterface();
		ci.m1();
		ci.m2();
	}

}
