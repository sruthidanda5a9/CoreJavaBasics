package AccessModifiers;
import Practice.*;
public class interfaceusing implements interfaceusing1,InterfaceOne{
	/* try to change the implemented interface variable value 
	 * showing the error as final variable can not be changed
	 * from this by default interface variables are final and static
	 * */

	@Override
	public void addd() {
		// TODO Auto-generated method stub

		//a = 45;
	}
	public void sub()
	{
		//a= 56;
	}
	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("method common to "
				+"interfaceone and interfaceusing1 interfaces");

	}
	@Override
	public void testMethod() {
		// TODO Auto-generated method stub
		
	}

	//**************

	/*
	 * Important Note: 
	 * if a class implementing two interfaces,
	 *  if both interfaces have the same method, then in the 
	 *  implemented class only one method will come.
	 */
}
