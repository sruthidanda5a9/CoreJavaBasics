package Practice;
/*
 * by default every class parent is OBJECT class
 */
public class InheritanceUsing  {
	public static void main(String args[])
	{
		InheritanceUsing object1 = new InheritanceUsing();
		InheritanceUsing object2 = new InheritanceUsing();
		if(object1.equals(object1))
		{
			System.out.println("objects are equal");
		}
		if(object1 instanceof InheritanceUsing)
		{
			System.out.println("    true   ");
		}
		if(object1 instanceof Object)
		{
			System.out.println("    true   ");
		}
		
	}

}
