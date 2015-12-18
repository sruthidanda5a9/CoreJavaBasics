package Practice;

public class StringBuilderandStringBuffer {
	
	/*
	 * String Buffer and String Builder both are mutable .i.e we can change the 
	 * objects and use the same memory location.
	 * but the difference between this STRINGBUFFER AND STRINGBUILDER 
	 */
	 
	/*
	 * the difference between this strig buffer and string builder are
	 * string buffer is synchroniched. i.e only one thread at a time can use that
	 * string and can change it.
	 */
	/*
	 * String builder is non sysnchronized. i.e nothing but more that one 
	 * thread can access it. so it is preferable to use stringBuilder 
	 * if we have only one thread in the program.
	 * 
	 */
	StringBuilderandStringBuffer()
	{
	StringBuilder s= new StringBuilder("sruthi");
	s.append("kiran");
	System.out.println(s);
	
	}
	public static void main(String args[])
	{
		StringBuilderandStringBuffer s= new StringBuilderandStringBuffer();
		
		/*
		 *string builder is more faster and more efficient but the problem is this
		 *is non synchronized.
		 *if we have only one thread string builder is preferable to use.
		 * 
		 */
	}
}
