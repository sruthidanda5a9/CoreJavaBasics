package Practice;

import AccessModifiers.InterfaceOne;
/*
 * abstract classes also have the constructors but the thing is how they will be called .(we are not able to create
 * an instance variable to it).once if we create the instance of the child of abstractor then this abstractor class 
 * constructor will be called.
 * but interfaces dont have the constructors. instructors are not part of the 
 * object tree.
 */
public class abstracttest extends AbstractKeyword implements InterfaceOne {

	/*
	 * Interesting Note : Abstract class can implement an interface 
	 * here like normal class it is not required to implement the methods.
	 * only the class whatever is extending the abstract class should implement
	 * all the abstract methods and non implemented methods of interface.:)
	 * But interface can extend one or more interfaces there is no chance for 
	 * the interface to implement
	 * 
	 */
	
	@Override
	public void sub() {
		// TODO Auto-generated method stub
		a = 80; 
		
		/*variables in 
		abstract class are not CONSTANTS , we can chnage them
		not like in interface.*/
		/* we can add abstract to only methods not to variables
		 * variables are like normal class variables.
		 */
		
	}
	public static void main(String args[])
	{
		AbstractKeyword object = new abstracttest();
		System.out.println(object.a);
		/*
		 * with reference variable of abstract class we
		 * can access the methods and variable of that class
		 */
	}

}
