package Practice;
/*
 * The most most important topic : EQUALS AND == 
 * EQUALS : look for the values in different locations.
 * (two different refernce variables referning the differnt locations)
 * == : compare the values in same location.
 * (two refernce variables referning the same location)
 * 
 */
public class collectionsusing {
	public collectionsusing()
	{
		String s1 = new String("sruthi");
		String s2 = new String("sruthi");
		String s3 = new String("kiran");
		String s4 = "kiran";
		String s5 = s1;
		System.out.println(s1.equals(s2));
		/*
		 * returns true they both refer to the different location.
		 */
		System.out.println(s1 == s2);
		/*
		 * s1 == s2 becomes false why becasue they both are different locations.
		 */
		System.out.println(s3.equals(s2));
		System.out.println(s4 == s3);
		/*
		 * false refers different locations.
		 */
		System.out.println(s5 == s1);
		System.out.println(s1.equals(s5));
		System.out.println(s4.equals(s3));
		//true
		/*
		 * simply equals : location change
		 * == : same location .
		 */
	}
	public String toString()

	{
		return null;
	}
	public boolean equals(Object O)
	{
		System.out.println("in equals method");
		if((O instanceof String )&& (O.toString() == this.toString()))
		{
			return true;
		}
		return false;
	}
	public int charAt()
	{
		return 1;
	}
		
		public static void main(String args[])
	
	{
		collectionsusing obj = new collectionsusing();
	}

}
