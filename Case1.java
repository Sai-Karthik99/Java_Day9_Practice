
public class Case1 {

	public static void main(String[] args)
	{
		try
		{
			test();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception is handled by the main method");
		}
			
		
		
	}
	public static void test()
	{
		int c=10/0;
	}
		

	}


