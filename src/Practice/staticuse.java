package Practice;

public class staticuse {
	/*
	 * i already know that static variables are class variables. we have to call them with class names
	 * i am clear that we can call the static variable with class name or objcect but the result is same
	 * here in the below program we are incrementing static variable in constructor so that we are able to 
	 * know how many objects are in the class.:)
	 */

	/*
	 * Static block : as i know already that if we start running our program compiler first will look for the
	 * static methods and blocks and variables . those methods , variables and blocks will be called first so that
	 * our starting method is main and static block ,static variable initialization(Called only once)
	 */
	public static int a=0;
	static  
	{
		System.out.println("ststic block");
		staticuse objcte=new staticuse();
		System.out.println(a);
	}

	staticuse()
	{
		a++;
		System.out.println(a);		
	}
	public static void  add()
	{
		System.out.println("ting ting");
	}

}
