package collections;

public class OverrideInnerclass {
	
	public void name()
	{
		System.out.println("method in OverrideInnerclass ");
	}
}
class Sum
{
	public void function()
	{
	OverrideInnerclass obj = new OverrideInnerclass()
	{
		public void name()
		{
			System.out.println("method in OverrideInnerclass  and extended class");
		}
		public void addition()
		{
			System.out.println("addition method in the anonymous class");
		}
	};
	obj.name();
	/*
	 * we can not call addition method with the OverrideInnerclass (parent class) object.
	 */
	/*kind of overriding method.
	*/
	}
}
