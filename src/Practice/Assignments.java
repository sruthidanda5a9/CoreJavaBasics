package Practice;

public class Assignments {
	/*
	 * Integers : 1) Decimal 2)Octal 3) Hexa
	 * Decimal : are normal integers (345,23,50)
	 * Octal : starting from 1 to 7 represented by adding zero before the number.(eg: 010,07,06)
	 * hexadecimal : constructed using the "0 to f".
	 * these numbers should be start with "0X" or end with l.
	 * (here upper case or letter case letters both have the same valu)
	 */
	/*
	 * float and double.
	 */
	/*
	 * Boolean should be TRUE OR FALSE
	 */
	Assignments()
	{
		
	int x=1;
	//if (x)
	{
		/*
		 * one interesting thing to check the conditions in java we should use booleans only.
		 * i am trying to check the above if case with an integer 
		 * value here it is showing an error.it is expecting only "true" of
		 *  "false" but this is not the case in "C" language. 
		 */
		
	}
	/*
	 * char : with single quote we have to represent charcters and unicode also used to represent charcters.
	 */
	char c='i';
	char c2=9000;
	char c3= (char)9000;
	//out of range in unicodes also so it is showing ? i guess
	System.out.println(c2);
	System.out.println(c3);
	/*
	 * casting : if we assign an integer to long i.e implicit cast .Integers are always fit in lOng so no problem.
	 * explicit cast: suppose if we want to assign an long to integer in this explicit cast is required.
	 */
	int a=10;
	long b= 30000;
	int d;long e;
	d=(int) 300000000.00;//explicit cast
	e=10;
	byte b8=(byte) (a+b);//explicit casting
	System.out.println(d);//float value converted to integer value
	
	
	/*
	 * i think you are clear with integer casting .But float casting is slitly different .By default all floats are 
	 * double so that if we want to assign an number to float we should explicitly cast it or append "f" to the number.
	 */
	
	float f= (float) 45.8;//45.8 is by default double so we are trying to assign to float so it is showing an error 
	//because of this we are doing explicit casting.
	
	
	byte bb= (byte) 128;
	System.out.println(bb);
	/*
	 * 128 is greater than byte range so explict cating is required.
	 * here by doing 
	 */
	}
	public static void main(String args[])
	{
		Assignments obj= new Assignments();
		int a[] = new int[4];
		System.out.println(a);
	}

}
