package oopsConcept;

public class QA4 extends QA2 implements QA3I
{

	
	
	public void div(int a, int b)
	{
		int c = a/b;
		System.out.println("mul of a&b: " + c);
	}
	
	public static void main(String[] args) {
		
		QA4 q4 = new QA4();
		q4.div(40, 20);
		
		//q3.mul(20, 30);
		
		q4.sub(40, 30);
		
		//QA1 q21 = new QA1();
		q4.sum(40, 50);
		q4.q1im();
		q4.q3im();
	}

		public void q3im() 
		{
		
		System.out.println("this is QA3I interface method");	
		
	}
	
}
