package Practice;

public class InheritanceTwo extends InheritenceOne implements interfaceusing1 {

	/*
	 * checking : How if parent have the constructor and child have the constructor in this case
	 * for which object creation the constructors will be created??
	 * 
	 */
	
	InheritanceTwo( )
	{
		
		
    super(a);
    
    /* Interesting case : created constructor with
     *  arguments in parent but no arguments in child.
     * in this case if we create an object to child with no arguments but 
     * child responsibility is to send the arguments value 
     * parent this is happening with the super.
     * if we don't include the super statement child constructor 
     * will look for the default constructor in parent
     * but parent don't have the default constructor so it will show an error
     * 
     */
    
	/* even it is a constructor also we have to pass the values to the
		parent constructor using the super keyword
		*/
		System.out.println("The constructors in child class");
	}
	
	
	
	/*First here we will see the use of reuse 
	 * we are extending "InheritenceOne" so "InheritanceTwo" class is
	 * having all the methods which are in "InheritenceOne" */
	public void hello()
	{
		System.out.println("hello how are you?");
	}

	/*
	 * see the beauty of JAVA , we can not extend two classes at a time,
	 *(because of they both have the same method that cause a problem in 
	 *child class that which method to use
	 *but we can extend one class and implements another interface at the same 
	 *time , even if both have the same method does not create any problem
	 *why why why why???
	 *its because only one class having the implementation for that
	 *method, interface don't have the implementation.
	 *so it is not creating any problem 
	 */
	
	
	@Override
	public void addd() {
		// TODO Auto-generated method stub

	}
	
	/*
	 * overriding Hi method of parent
	 */
	static void hi()
	{
		/*
		 * some times we just wanted to run the 
		 * parent class "hi" method first and then 
		 * we want to add some extra code in child
		 * in that case instead of doing copy past from 
		 * parent simply we can use super keyword.
		 */
		//super.hi();
		System.out.println(" i am in child");
		
		/*
		 * see again the beauty of static : here we are overriding 
		 * an "hi" method which is static .
		 * in general while overriding with the reference of 
		 * parent and object of child tried to access the override method,
		 * here method overrided in child will come but
		 *  if we add static to it then method in parent will come.
		 * 
		 */
	}


	/*
	 * i was wondered while preparing this ,
	 * seriously i don't know till now that
	 * we can create a reference to interface which 
	 * is of implemented class
	 * so that with that reference we can access only
	 *  the methods which 
	 * are in interface.
	 * BUT WE CANNOT CREATE AN OBJECT TO INTERFACE
	 */
	/*
	 * Reference : it is just the name : ex : classname reference;
	 * object : it is Complete stuff
	 *  ex : classname object =  new classname();
	 */
	
	
	/*
	 * Overriding concept
	 * 
	 */
	
	
	public void overridemethod(int a, int b)
	{
		/*
		 * we supposed to change the parent class code here 
		 */
		/*
		 * beauty of super keyword, if we want to include the parent class code also in the child
		 * we should add super keyword.
		 */
		super.overridemethod(a, b);
		System.out.println("the overridede deteils in child class  "+a+" "+b);
	}
	
	/*
	 * Overload method
	 */
	public void overloadmethod(int a, int b ,int c)
	{
		super.overloadmethod(a, b);
		System.out.println("the overloaded values are "+a+"  "+b+" "+c);
		
	}



	@Override
	public void testMethod() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	/*public static void main(String args[])
	{
		InheritanceTwo object = new InheritanceTwo();
		interfaceusing1 object2= new InheritanceTwo();*/
	/*
	 * 	interfaceusing1 object3= new interfaceusing1();
	 * THIS IS NOT POSSIBLE i.e creating an object to interface.
	 */
	/*	object2.addd();

	} */
}
