package oopsConcept;

public class QA2 implements QA1I
{
	
	public void q1im() 
	{
		System.out.println("this is QA1I Method");
		
	}
	
	int x = 100;
	
	public void prinval()
	{
		final int x = 200;
		//x=300;
		System.out.println(x);  //200
		System.out.println(this.x);//100
		///System.out.println(super.x); //500
		
		//super.sum(40, 50);
	}
	
	
	

	public void sum(int a, int b)
	{
		int c = a*a+b*b;
		System.out.println("sum of a&b: " + c);
	}
	
	public void sub(int a, int b)
	{
		int c = a-b;
		System.out.println("sub of a&b: " + c);
	}
	
	public static void main(String[] args) {
		
		QA2 q2 = new QA2();
		q2.sub(40, 30);
		
		//QA1 q21 = new QA1();
		q2.sum(40, 50); //
		q2.prinval();
		
	}

	
	
	
}
