package oopsConcept;

public class T1 extends DemoAbstractClass
{

	
	public void credentials() 
	{
		System.out.println("this is my crdential");
		
	}

	public static void main(String[] args) {
		T1 t = new T1();
		t.values();
		t.credentials();
	}
	
}
