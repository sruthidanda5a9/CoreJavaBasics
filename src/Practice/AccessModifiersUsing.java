package Practice;
/*Protected */

public class AccessModifiersUsing {

	/* 
	 * Static block should be able to use only the 
	 * static variables
	 */
	
	static int one=0;
	static 
	{
		one ++;
	}
	
	protected int a = 0;
	/* every class in this package 
	 * able to access this protected member?
	 * YES WE CAN USE THIS PROTECTED VARIABLE EVERY WHWRE 
	 * IN THIS PACKAGE 
	 * USING OBJECT OF THIS CLASS
	 * 2)can we access this in different package?
	 * 	  Sub class (ProtectedUsing)
	 *  of this AccessModifiersUsing is able to access 
	 * this protected variable
	 * if it is not extending then if we try
	 *  to use the protected variable in different package showing error
	 * "CREATE A LOCAL VARIABLE"
	 * 
	 * important note : even in the subclass of different package we 
	 * can not access the protected variable of parent with that 
	 * class OBJECT
	 * 
	 */
	/*
	 * DEFAULT :
	 * no access modifier
	 */
	int b=2;
	
	/*  we are able to access this in this same package with object
	 *  and we are not able to access it in different
	 *  package even it is extending the class
	 */
	
}
