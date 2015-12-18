package Practice;

public class staticusetwo extends staticuse{
	
	public static void add()
	{
		System.out.println("i am in child");
	}
	/*
	 * if we remove the static keyword before the main method and try to run it we will get
	 * "NoSUCHMETHODERROR".
	 * if we run the program first the static block will be executed ,static variables will be
	 * initialized by the class loader and then will look for main method
	 */
	public static void main(String args[])
	{
		staticuse object = new staticuse();
		System.out.println("******");
		staticuse object1 = new staticuse();
		System.out.println(staticuse.a);
		System.out.println(object.a);
		System.out.println(object1.a);
		staticuse object6=new staticusetwo();
		object6.add();
		/*
		 * Interesting note : static methods belongs to class if we extend the class also we cannot override them.
		 * like in the above example add is static in parent and child.
		 * with the reference of parent and object of child we tried to call add method.
		 * in general case if we override a method child method will be called with parent reference and child object
		 * here we override static so only parent method is coming 
		 */
	}

}
