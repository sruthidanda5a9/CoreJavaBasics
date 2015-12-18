package Practice;
/*
 * dont get confuse : main to find the length of an array we are using "length" 
 * property.
 * but to find the length of an string we are using the length () method.
 * difference between method and property is here property menas it has the 
 * alredy implemented and that is fixed to that propert name.
 * 
 * method menas what ever we implemented will be executed.
 * in array we already specified the lenght using new so no need to
 *  calucate it using 
 * method.
 */

public class Arraysusing {

	/*
	 * int[9] a;array is an object .
	 * In array declaration  in the above statement we can not 
	 * give the size of an array.

	int aa[]=new int[];
	if we want to give the size of an array : this can be done by usinh
	new operator.so the array object is stored in HEAP.
	we can provide the size of an array ony with the new operator.
	we can not give the size of an array in declaration.
	even if the array is local to method also this is OBJECT.
	ARRAY WILL BE STORED IN HEAP.EVEN ITS A COLLECTION OF PREMITIVIES ALSO
	 */
	/*
	 * like static blocks we have initialization blocks.
	 * static blocks are executed while the class loader loading the program.
	 * init blocks are called for every object initialization.
	 * clearly for every class "STATIC" BLOCK executes only one time. 
	 * "INIT" block executes for each and every object  creation.
	 * 
	 */
	static{
		System.out.println("hellooo i am static");
	}

	/*
	 * init block
	 */
	{
		final int i=0;
		System.out.println("hello i am init");
	}


	/*
	 * constructors
	 * what is the difference between init and constructors???
	 * both are calling for the object creation.
	 * answer : Instance initializers are also useful in anonymous inner classes,
	 *  which can't declare any constructors at all.
	 */
	Arraysusing()
	{
		final int i=0;

	}
	public static void main(String args[])
	{
		Arraysusing object = new Arraysusing();
		Arraysusing object2= new Arraysusing();
	}
	/*
	 * output:
	 * hellooo i am static
	hello i am init
	hello i am init
	 */
	/*
	 * compiler specially represent the errors in
	 * the initialization or static blocks.
	 * 
	 * example : Exception Initialization error.
	 */

}
