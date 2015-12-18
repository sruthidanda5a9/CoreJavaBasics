package collections;

public class MyOuter {
	private int x= 90;
	
	 void funMyOuter()
	{
		 final int inervar =90;
		/*MyInner in = new MyInner();
		in.funMyInner();*/
		
		
		/*
		 * useless stuff : we can create an class with in the method also but in the method it self we need to create an instance to that class
		 * to access that inner class methods with in method.
		 */
		System.out.println("helloooo");
		class InsideFunInnerclass
		{
			InsideFunInnerclass()
			{
				/*
				 * why why ?? inner class in method is not able to access the non final variables of that method??
				 * but it is happily able to access the out classes variables.. :O:O
				 * its interesting : local variable of method life time is only in method.it stays in stack.
				 * but the object of this inner class of method stays in heap. their may be chance to
				 * passs that class refernce to other methods so if we use the local variable in that case that is problem.
				 */
				System.out.println(inervar);
				System.out.println("inner class with in method.");
				System.out.println(x);
				
				/*
				 * this is useless unless we create an instance to this class with in this method.
				 */
			}
			
		}
		InsideFunInnerclass obj = new InsideFunInnerclass();
		functionOuter(obj);
		/*
		 * because of this reason here we are passing this class object to another method.
		 * local variables of method scope is only in that method.
		 * 
		 */
	}
	
	void functionOuter(Object o)
	{
		
	}
	/*
	 * see here the interesting note : if we have abstract methods class should be abstract.
	 * but if we have an abstract inner class it is not necessary for the outer class to be abstract.
	 * but the question is : how to implement those abstract methods of inner class?
	 */
	abstract class MyInner 
	{
		/*
		 * 
		 * this refers to the current object of the reference by which we are calling the method.
		 * to get the current object of outer class by using this ( we should use the outer class name followed by this.)
		 */
		void funMyInner()
		{
			System.out.println("inner class ref  "+ this);
			System.out.println("Outer class ref  "+MyOuter.this);
		}
		 abstract void add();
	}
	/*
	 * same concept is applied to inner class as well.
	 */
	class AnotherInner extends MyInner
	{

		@Override
		void add() {
			// TODO Auto-generated method stub
			
		}
		@Override
		void funMyInner() {
			// TODO Auto-generated method stub
			super.funMyInner();
		}
		
	}
	class AnotherInner2
	{
	   /*
	    * this class is not able to get the methods of other class with out ref
	    * but it is able to get the out class variable and functions with out ref.
	    */
		 void add() {
			System.out.println(x);
			funMyOuter();

		}
	}
	public static void main(String args[])
	{
		MyOuter obj = new MyOuter();
	//	MyInner objeI = obj.new MyInner();
	//	objeI.funMyInner();
		obj.funMyOuter();
	}

}
