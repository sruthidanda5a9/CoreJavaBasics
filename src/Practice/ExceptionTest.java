package Practice;

public class ExceptionTest  extends Exception{
	
	public static void main(String args[])
	{
		testExceptionmethod();
	}

	private static void testExceptionmethod() {
		// TODO Auto-generated method stub
		int b=10;
		//try
		{
			int a = b/0;
			throw new ArithmeticException();
		}
		//finally
	}

}
