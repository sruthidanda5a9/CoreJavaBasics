package Practice;
/* 
 * Constructor shouLD NOT HAVE RETURN TYPE
 * NAME OF THE CONSTRUCTOR SHOULD BE SAME AS CLASS NAME 
 * 
 * for more infor : scjp book 134 page
 */

/*
 * Intresting point : Every class have the default constructor.which is of no args.
 * suppose if you created a constructor with no args 
 * by yourself then that default constructor will not be created 
 * automtaically why ? you already have an constructor .
 * suppose if you your class have an only one constructor with arguments . 
 * In that case ALSO  default constructor will NOT be created 
 * automatically.WHY ?? YOU ALREADY HAD A CONSTRUCTOR WITH ARGUMENTS .
 * MAIN POINT : IF YOU TYPED AN CONSTRUCTOR BY USERSELF THEN COMPILER WILL NOT CREATE AN ANOTHER CONSTROR.
 * 
 * most important point : we can calll constructir only by creating object,
 *  we can not call it automatically like the other 
 * methods.
 */

public class ConstructorUsing {
   public int c=0;
	static int a=0;
	static
	{
		System.out.println("static in parent");
	}
	{
		System.out.println("init block parent1");
	}
	{
		System.out.println("init block parent2");
	}
	public ConstructorUsing() {
		System.out.println(a);
		
		/*
		 * how a constructor able to access static variable??
		*/
		
		/*
		 * with private constructor ,even if we tried to 
		 * create an object in the outside of this class will throw you
		 * an error (change the visibility of the method)
		 * 
		 */
		// TODO Auto-generated constructor stub
		System.out.println("this is constructor");
	}

	public void ConstructorUsing()
	{
		System.out.println("this is having return"
				+ " type so it is not constructor");
	}
	
	/*public static void main(String args[])
	{
		ConstructorUsing Object =new ConstructorUsing();
		/* 
		 * the above statements results
		 * in the execution of ConstructorUsing() Constructor
		 * so gives result "this is constructor" 
		 
		Object.ConstructorUsing();
		/*
		 *the above statements results
		 * in the execution of ConstructorUsing() method
		 * which is having void as retuen type
		 * so gives result "this is having return type 
		 * so it is not constructor"  
		 
	}
*/
}
