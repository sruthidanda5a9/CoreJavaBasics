package Practice;
import java.io.*;
import javax.print.attribute.standard.Finishings;

/* try to extend the FinalKeyWrd class here : even
 it is not showing that class to extend here
* examples of final class : String class 
 * we can not extend that class but 
 * we can use them with reference */
public class FinalKeyWord2 {

	public static String one= "Sruthi";

	public  static final void  addString()
	{

		one.charAt(0);
		System.out.println("we are inside of method");
		/* after import now we are able to use that methods but not 
		 * ovareide it(we can not overide that methods and we cannot 
		 * add our own code ) this is the main use of final key word.
		 *  */
		//dddd();
	}
  public static  void dddd()
  {
	  
  }
	public static void main(String args[])
	{

		FinalKeyWord2 object = new FinalKeyWord2();
         dddd();
		/* method don't have final or static try to 
		 * call it with object
	  object.addString();  output: we are inside of method */
		/* ADDING STATIC TO METHODS */
		FinalKeyWord2.addString(); 

		// System.out.println(FinalKeyWord.b);

		/*Note Static :
		 *  1)Static methods, variables , blocks are belongs to class
		 * not to object .so that we can call static methods, variblaes  directly with the class names
		 * object is not required, if we want we can call with object also.but its value is same for all objects.
		 * 2) static methods can call only static methods including main method
		 *  (including static block) 
		 *  and static variables but not non static members
		 * 3) static blocks are the first blocks 
		 *    witch execute first for every objcet   
		 *    example : if we want to count how many 
		 *    objects are for class we can simply place that code in 
		 *    static block (count) this block executes for every 
		 *    object so we can easy know how many objects are present
		 *    
		 * we can use final and static together */
	}
}
