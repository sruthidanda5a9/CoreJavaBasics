package Practice;
/*
 * EXCEPTION : error occurred during the execution of the program
  these "Exceptions" Child are may be RUNTIME and
  (IO, SQL, other types of exceptions).Throwable is parent of Exception and Error.
 * every Exception under RunTime is UNCHECKED exception,
 *  others are CHECKED EXCEPTIONS.
 * 
 * WHAT IS CHECKED EXCEPTION AND UNCECKED EXCEPTION?
 * 
 * CHECKED EXCEPTION : we should handle these EXCEPTIONS using TRY , CATCH BLOCK
 * or using THROWS keyword.
 * simply if we are not handling the checked exceptions COMPILER will show 
 * an error.
 * 
 * UNCHECKED EXCEPTIONS: These are not verified by the compiler.
 * these occurred at the compile time.
 * 
 * if we want we can also handle this unchecked exceptions
 *  using the try ,catch , finally
 *  ****************************
 *  THROW SYNTAX:using throws we can throw only one exception at a time.
 *  try
 *  {
 *  throw new exceptiontype();
 *  }
 *  catch(exceptiontype e)
 *  {
 *  }
 *  ************* OR 
 *  USING THROWS WE CAN PROPAGATE THIS EXCEPTION TO CALLING METHOD .iN THAT CALLING
 *  METHOD YOU CAN HANDLE USING THE HANDLER
 */

/*
 * still i have question: even if we have throws or not also if we are not catching the
 * exception , our exception will propagates to the calling methods.
 * then why we are using the throws??????
 * 
 * ANS : by throws we are informing the calling method that their is a chance of 
 * exception.
 */
public class Exceptions {
	int a=9;
	int b=8;
	int c;
	public void add() //throws ArithmeticException
	{
		sub();

		/*
		 * case 2:yes see here we are calling sub method it already 
		 * said that it may throw exception using THROWS after method
		 *  declaration but here in add() we are not
		 * handling that so this propagates to main .in that also
		 * we are not handling so that  cause the error in o/p.
		 * 
		 * 
		 * case 3: suppose again if we add the throws to add() method we will 
		 * see what will happen.
		 * 
		 * The exception is propgating to parent and if we are handling their 
		 * no problem otherwise main method propagate that error to JVM and
		 * that cause the problem.
		 */
	}
	/*
	 * case 1:Throw example.
	 */
	/*	public void sub()
	{
		try
		{
			c=a/0;
			throw new ArithmeticException();
			/*
			 * throw main use is we can type cast our exception and we can send.
			 */

	/*	}
		catch (ArithmeticException exp) {
			System.out.println("Error: "+exp.getMessage());
		}

	}*/

	public void sub()//throws ArithmeticException
	{
		//c=a/0;
		/*
		 * this is not necessary that every throws to have an throw statments
		 * just with throw we are just sending what exception was thrown.
		 * if that statments is not here also no change.
		 */
		//throw new ArithmeticException("errrrrrrrrr");
		
		
		/*
		 * Rethrowing an exception.
		 *once our exception is catched again in the catch block we are throwing 
		 *that exception that exception should propgates to calling method. 
		 * 
		 */
		try
		{
			c=a/0;
		}
		/*catch(ArithmeticException e)
		{
			throw new ArithmeticException("error occured");
		}*/
		finally
		{
		System.out.println("tin gtind rinsdfjkns§");
		}
	}
	/*	throws:: catching in main
	 * *******************
	 * public static void main(String args[])
	{
		Exceptions e= new Exceptions();
		try
		{
		e.sub();
		}
		catch(ArithmeticException e1)
		{
			System.out.println("error");
		}
	}*/

	public static void main(String args[])
	{

		Exceptions e = new Exceptions();
		Exceptions e1 = new Exceptions();
		try
		{
			(e).add();

		}
		catch(ArithmeticException eqq)
		{

			System.out.println("error"+eqq.getMessage());
		}
		e.returnstatment();
		e1.returnstatment();

	}
	int r=0;
	public int returnstatment()
			{
				try
				{
					if(r!=0)
					return r;
					else 
						r--;
				}finally{
					System.out.println("finally");
				}
				return r;
		        
			}
}
