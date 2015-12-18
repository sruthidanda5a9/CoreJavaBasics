package AccessModifiers;
/*
 * during our coding suppose if, else statements we assumes always something like
 * the values of the variables.
 * In order to know our assumption is correct or not we use ASSRT.
 * if we assume there is a chance of exception in this case adding try and catch blocks 
 * may reduce the performance. why because our assumption is not always correct.
 * 
 * and some case we will add if or else statements if our assumption is wrong in that 
 * case we will never go to the else part this is also reduces the 
 * performance.
 * 
 * so its better to add ASSERT .IF out assumption is true then assert will 
 * throw an assertion error.which is never handled.
 * 
 * we can enable the assert only in debug mode and testing case.
 * if we deploy our code assert statement will not execute .JVM dont care about this 
 * if we deploy our code.
 */
public class Assertionuse {
	int b=9;
	void add(int a)
	{
		assert(a>0):a=9;
		/*here assert is not enabled so we are not able to check the values.
		*/
		System.out.println(a+" "+b);
	}
	public static void main(String args[])
	{
		Assertionuse object= new Assertionuse();
		object.add(-9);
	}
}
