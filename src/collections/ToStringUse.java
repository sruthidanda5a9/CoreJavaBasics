package collections;

/*
 * to convert any thing in the form we can read.
 */
public class ToStringUse {
	public static void main(String args[])
	{
		Test obj1 = new Test(3, 4);
		/*
		 * Step 1 : i did not overrided the TOsTRING method.Directly trying to display the object
		 * so the rest is in not clear 
		 * 
		 * the output of System.out.println(obj1);
		 * (result : collections.Test@3343c8b3)
		 */
		System.out.println(obj1);
		/*
		 * step 2 : mainly in the println sttament if we are trying to display object . that will first llok for the
		 * to string method if we did not ovevride it th result is not clear.
		 * if we overide the tostring method in the println of object first calls the tostring method.
		 * so the result is :hello i am overriding to string 
		 */
	}

}
class Test
{
	int testA,testB;
	Test(int a , int b)
	{
		this.testA = a;
		this.testB = b;
	}
	public String toString()
	{
		return "hello i am overriding to string ";
		
	}
}