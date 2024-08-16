package firstPkg;

public class LearnVariable
{
	int a = 200;//global variable
	
	
	public void printval()
	{
		final int a = 100;  //local variable  //100
		//a = 300;
		System.out.println(a);
	}
	
	public void otherval()
	{
		System.out.println(a);  //200
	}
	

	public static void main(String[] args)
	{
		LearnVariable lv = new LearnVariable();
		lv.printval();
		lv.otherval();

	}

}
