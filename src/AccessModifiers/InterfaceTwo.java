package AccessModifiers;
import Practice.*;
public class InterfaceTwo {

	
	/*
	 * InterfaceUsing implemented two interfaces which are having the 
	 * same method in two interfaces . In this case Implemented class 
	 * is required to implement only one method.
	 */
	public static void main(String args[])
	{
		InterfaceOne object = new interfaceusing();
		interfaceusing1 object1 = new interfaceusing();
		object.add();
		object1.add();


		/*
		 * Note : we created references to interfaces of object 
		 * implemented class type .In this case BOTH THE 
		 * interfaces have the same method .
		 * just check the above code , with two interface
		 *  refernces we can call the implemented method.
		 * 
		 */
	}
}
