package Practice;
/*
 * constructors can not be overriden . just we can overload them.:)
 */
public class ConstructorTwo extends ConstructorUsing {
	
	public static int sttaicvar = 0;
	{
		System.out.println("init block child1");
	}
	{
	System.out.println("init block child2");
	}
	static
	{
		System.out.println("static in child");
	}
	public ConstructorTwo()
	{
		sttaicvar = sttaicvar+4; 
		/*How a constructor is able to access the static variables??
		*/
		System.out.println("Constructor in child");
		System.out.println(a);
		System.out.println(c);
		/*
		 * how the child constructor is able to access the parent static variable???
		 * Construtcor main purpose is to initialize the variables.
		 * so except the private varibales it can access the parent other variables.
		 */
	}
	public void staticvariabletest()
	{
		sttaicvar = sttaicvar+10;
		/*
		 * Ohhhh now i got it : static methods can access only the static variables but
		 * non static methods can access the static variable also be clear.:)
		 * 
		 * one main point constructors are non static .. :)
		 * why you know static belongs to class we can not override them so constructor is not
		 * static.
		 */
	}
	public static void main(String args[])
	{
		//ConstructorUsing object = new ConstructorUsing();
		/*
		 * the above statemnts creats the object for ConstructorUsing
		 * which results in the execution of its constructor
		 */
		/*
		 * Note : If we change the access modifier of "ConstructorUsing"
		 * Constructor to private and tried to create an object 
		 * it shows the error as change the visiblity
		 * 
		 */
		//ConstructorTwo object = new ConstructorTwo();
		//ConstructorUsing object1= new ConstructorTwo();
		/*simply which class is creating object not 
		 * the reference i.e right hand side all constructors will be called.
		 * 
		 */
		ConstructorUsing obj= new ConstructorUsing();
	}

}
