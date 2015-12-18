package Practice;
/*
 * Inheritance : Main purpose of inheritance is REUSE the code ,POLYMORPHISM
 */
public class InheritenceOne {
	
	/*
	 * checking : How if parent have the constructor and child have the constructor in this case
	 * for which object creation the constructors will be created??
	 * 
	 */
	
	InheritenceOne(int a)
	{
		System.out.println("Constructor of parent "+ a);
	}
	
	/*First here we will see the use of reuse */
	static void hi()
	{
		System.out.println("hello");
	}
	public void add()
	{
		System.out.println("he he he");
	}
	
	/*
	 * Override concept here
	 */
	public void overridemethod(int a,int b)
	{
		System.out.println("a and b values are "+a+" "+b);
	}
	
	/*
	 * Overload concept here : we should change the argument list
	 */
	
	public void overloadmethod(int a, int b)
	{
		System.out.println("the overloaded values are "+a+"  "+b);
		
	}

}
