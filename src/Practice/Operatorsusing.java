package Practice;

public class Operatorsusing {
	
	/*
	 * why do we want String as an argument ?? Compiler will look for the 
	 * main method with arguments to start the program this is design.
	 */
	public static void main(String args[])
	{
		int x=1;
		System.out.println("hhhh");
		System.out.println();
		Operatorsusing obj= new Operatorsusing();
		Operatorsusing obj2= new Operatorsusing();
		Operatorsusing obj3= new Operatorsusing();
		obj3=obj;
		
		if( "string".equals("sruthi"))
		{
			System.out.println("equals check");
		}
		
		
		if(obj != (obj2))
		{
			System.out.println("ting not !=");
			/*
			 * objects can be compared with "==" operator.
			 */
			
		}
		if(obj == (obj3))
		{
			System.out.println("ting ==");
			/*
			 * objects can be compared with "==" operator.
			 */
			
		}
		if(x==8)
		{
			/*
			 * Yes we know that if accepts only boolean values.
			 */
		}
		/*
		 * as you know in your childhood while dealing with switch if case
		 * don't have the break then our program automatically executes all the
		 * remaining cases next to that case.
		 */
		switch(x)
		{
		/*
		 * case "sruthi": ERROR
		 * IN CASE ALL THE TYPES SHOULD BE COMPATABLE TO COMPARE
		 */
			
		case 1:
		{
			System.out.println("hehe");
			/*seriously :O :O
			 * we are able to keep our case statements in block.:O
			 */
		}
		case 2 :
			System.out.println("two two");
			break;
		}
		int a[]= {1,2,3};
		for(int n:a)
		{
			
			System.out.println("iteration "+x+"  "+n);
			x++;
		}
		
	}

}
