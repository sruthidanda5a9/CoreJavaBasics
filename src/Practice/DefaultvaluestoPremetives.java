package Practice;

/*
 * interesting note : java not providing default values to the local variables, they must be initialized.
 * java giving default values to global variables only.
 */
public class DefaultvaluestoPremetives {
	
	/*
	 *the following are the global variables so java providing default values to them. 
	 */
	
	int a;
	long l;
	char c;
	float f;
	String s;
	int  aa[] ;
	String bb[]= new String[10];
	String cc[];
	public DefaultvaluestoPremetives()
	{
		System.out.println(a);
		System.out.println(l);
		System.out.println(f);
		System.out.println("c"+c);
		System.out.println(s);
		System.out.println("aa"+aa);
		System.out.println("bb"+cc);
		for(int i=0;i<9;i++)
			System.out.println(bb[i]);
	}
	public static void main(String args[])
	{
		
		/*
		 * the following DefaultvaluestoPremetives b = null; is local variables ,so java is not providing the 
		 * default value to it.
		 * if we don't initialize the local variables java is showing an compile error.
		 */
		
		
	/*	DefaultvaluestoPremetives b = null;
		DefaultvaluestoPremetives obj= new DefaultvaluestoPremetives();
		System.out.println(b);
		System.out.println(obj.s.toLowerCase());
		
		*/
		
		/*
		 * the above statement is showing null pointer exception
		 * we are trying to convert string which is null to lowercase.
		 * the string don't have value so it is showing an error.(null pointer exception)
		 * this is run time error
		 */
		
		
		int c;
		
		/*
		 * he he i hate this see we created a local variable c but not used and initialized ,so no error is coming
		 */
		/*
		 * System.out.println(c);
		 * here above i tried to use this uninitialized local variable here error is coming.
		 */
		
		/*int aaa[];
		System.out.println(aaa);
		same the above thing is happening with array as well
		*/
		
		/*
		 * here i will show you the clearly the assignment:)
		 * don't be confused learn it clearly and 
		 */
		DefaultvaluestoPremetives obj ;
		DefaultvaluestoPremetives b = new DefaultvaluestoPremetives();
		DefaultvaluestoPremetives object= new DefaultvaluestoPremetives();
		object.a =10;
		obj=object;
		obj.a=30;
		b=object;
		b.a =40;
		int[] a22= new int[4];
		/*
		 * surprising arrays dont have any problem why becz these are objects.
		 */
		System.out.println(a22);
		System.out.println(object.a);
		System.out.println(b.a);
		int a=30;
		int bb;
		bb=a;
		System.out.println(bb+a);//both have the same value rite like this is happening to object references.:)
		
	}
	

}
