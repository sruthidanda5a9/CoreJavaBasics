package Practice;

public class inheritanceThree{ //step1 )extends InheritanceTwo {
	/*
	 *inheritanceThree is having all the methods of  
	 *"InheritanceTwo" and "InheritanceOne" 
	 */
	/*public static void main (String args[])
	{
		inheritanceThree object = new inheritanceThree();
		object.hi();
		object.hello();
	}
	 */


	//********************Process tw0
	public static void main(String args[])
	{

		/*we are type casting child object to parent class so
		 * that parent object is having only hi method
		 * 
		 */
		InheritenceOne object = new InheritanceTwo();
		object.hi();


		/*we are type casting parent object to child class so
		 * that  object is having only hi,hello method
		 * 
		 */


		/*InheritanceTwo object1 = (InheritanceTwo) new InheritenceOne();
		object1.hello();
		object.hi(); */

		//************************ process 3

		// casting confusing and important concept


		//InheritenceOne parent = new InheritenceOne();
		/*	InheritanceTwo two =  (InheritanceTwo) new InheritenceOne();
		InheritanceFour four = (InheritanceFour) new InheritenceOne();
		two.hello();
		two.hi();
		four.hh();
		four.hi(); */

		/*
		 * parent type casted to child so it 
		 * having child methods also, but the above 
		 * casting is showing error 
		 * NOTE : DOWNCAST in the INHERITANCE TREE ALWAYS COMPILES
		 * FINE BUT NOT RUN.
		 * just the compiler will always see is that the class are in the
		 * inheritance tree or not .
		 * REASON : EVRY CHILD IS A PARENT BUT PARENT IS NOT CHILD.
		 * SCJP BOOK PAGE 117 FOR MORE CLARITY
		 */


		//InheritenceOne parent = new InheritanceTwo();
		// if child type casted to parent we are able to
		// see only parent methods
		//parent.hi();


		/*
		 * frankly and clearly what i understood from the
		 *  above concept is however in casting 
		 *  what class is on your
		 *  left hand side the object will have all the methods of that
		 *  class(which is on left hand side)
		 * unless if we don't override the methods
		 * if we override the method in child , 
		 * created an reference to parent of object child type
		 * like Parent p =  new child();
		 * the overrided method in child will come in this case 
		 * but not the other methods in child
		 * this is little bit confusing
		 * be clear about it
		 */


		/*
		 * Exception Hnadling for downcasting :
		 * 
		 */
		try
		{
			InheritanceTwo teo =  (InheritanceTwo) new InheritenceOne(8);
			//throw Exception e;
		}
		
		catch(Exception e)
		{
			System.out.println("error occured");
			e.printStackTrace();

			/*
			 * yes above we are doing downcasting , we know run time error will come here
			 * so we placed the code in try block
			 *run time  error occured so the catch block was executed.
			 */
		}
	/*catch(ClassCastException e)
		{
		System.out.println("main error");
		}
		/*
		 * main point if our exception wsa alredy catched even we gave another catch 
		 * block then compiler will show you an "un used catch block"
		 * but we can write specific exception first and the parent exception last.but not
		 * reverse
		 */
		//System.out.println("after catch statemnet");
		finally
		{
			System.out.println("finally");
		}


		/*
		 * from the above code it is clear that we should maintain the order
		 * of try catch,finally blocks.we should not place the other code in between 
		 * the try , catch and finally blocks.
		 * finally block executes pakka after the try catch block even exception 
		 * is occurred or not finally don't care.if we have finally in our code
		 * pakka finally will execute.
		 */

		/*
		 * Intresting Note But i did not implemented :
		 * Finally is optional Block .Every try block should be fowwloed by eithr
		 * catch or finally.
		 * see here ,  If our try throws an exception. Sometimes calling method 
		 * may handle our exception so here catch is not required but we should provide
		 * the Finally in that case.
		 */
	}


}
