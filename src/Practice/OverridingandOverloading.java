package Practice;
/*polymorphism applies to  override but not to .
 * overload, polymorphism is only for methods not for variables.i.e override is only foe
 * methods not for variables.
 * Override :
 * 1)Method with the same return type and argument list.
 * In the sub class just what we are doing is we are replacing the parent class code
 * with the child class code.
 * 2)Sometimes we want the Parent class implemented code as well extra code in the child class
 * in this case we should use the super key word so that we can add some extra code to the
 * method in the child class.
 * Overload :
 * 1)only the method name is same we should change the argument list
 * in my view what i understood is overloaded methods are different methods except the name is same.
 */


public class OverridingandOverloading {
	
	

	public static void main(String args[])
	{
		/*InheritanceTwo object = new InheritanceTwo();
		object.overridemethod(1, 2);
		object.overloadmethod(3, 4);
		object.overloadmethod(4, 6, 9);
		InheritenceOne object1 = new InheritanceTwo();
		object1.overridemethod(3, 4);
		object1.overloadmethod(5, 7); */
		/*
		 * you know this concept clearly we created reference of parent and object of child
		 * so we are able to see only the methods which are in  reference except override case.
		 */
		
		/*object.overloadmethod(10, 13, 16);*/
		
		
		//cONSTRUCTOR HERE
		  InheritanceTwo object = new InheritanceTwo();
		 
		
		
		
		/*
		 * 100 % clarity for the child class object creation both the parent and child class
		 * constructors will be created 
		 */
	}
	
}
