package AccessModifiers;
import Practice.*;
/* Note: Only the sub class in different package will be able to access 
 * Protected members*/

public class Protectedusing extends AccessModifiersUsing{
	public void add()
	{
		System.out.println(a);

		/*Note 1:
		 * able to access protected variable
		 *  of parent class which is in
		 * different package but not able to 
		 * access default */
		//**************************************
		/* Note 2 :
		 * Created Object for the Parent , Tried to access its 
		 * Protected variable using Object But not able to why why?
		 * The Subclass out side of package can access the
		 * protected variale just by using INHERITENCE
		 * WE can not access with reference.
		
		AccessModifiersUsing object = new AccessModifiersUsing();
		System.out.println(object.a);  */
		
		//*****************
		/*Note 3 : After inhering the Outside package
		 *  pROTECTED VARIBALE 
		 * imediatly  here it will become as Private so child of this 
		 * inherited class cannot see this variables */

	}
	public static void main(String args[])
	{
		Protectedusing object = new Protectedusing();
		object.add();
	}

}
