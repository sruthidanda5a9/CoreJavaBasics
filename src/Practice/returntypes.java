package Practice;

public class returntypes {
	/*
	 * return types : if the return type is void i.e nothing but we can not return any thing in that method.
	 */
	
	/*
	 * small question : what about constructors will they return ??
	 * In the definition of constructor is it won't have return type. so simply Constructors don't return anything
	 */
	
	returntypes()
	{
		//return 0;
	}
	public returntypes add()
	{
		return null;
		/*
		 * we can return an object type : in this case we can return anything that
		 * implicitly cast to an return type object
		 */
		
	}
	/*
	 * we can do overload in the same class but we can not do override in the same class.
	 * we should do override in the child class
	 */
	public int add(int a , int b)
	{
		return 1+3;
	}
	/* 
	 * we can return an array also .Interesting thing i don't know we can return object and array
	 */

}
