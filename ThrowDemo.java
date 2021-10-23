
public class ThrowDemo {

	public static void main(String[] args)
	{
		int a=15;
		int b=10;
		if(a>b)
		{
			throw new ArithmeticException("manually throw");
		}
		else
			System.out.println("no exception");
	}

}
