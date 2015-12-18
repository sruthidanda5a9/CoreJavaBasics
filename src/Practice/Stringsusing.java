package Practice;


public class Stringsusing {
	Stringsusing()
	{

		/*
		 * Very Interesting and very Importan40t Points :
		 * 
		 * Strings are immutable OBJCETS i.e nothing but we can not change them.
		 */

		String s =  new String("Sruthi Kiran");

		/*
		 * wE created the string object using new . so in memory it creates an 
		 * "sruthi kiran" object . With Reference variable "s" WE ARE referening them.
		 */
		s.concat("nunna");

		/*
		 * Above we created a new object by appending "nunna" to "sruthi kiran"
		 * the new object is Sruthi kiran nunna. but no REFERENCE ASSIGNED
		 * to that new object so we can not access them.
		 */

		/*
		 * main important thing to be noted here is once the object(string) is created it will
		 * never be changed.for other strings agin it will create a memory for them.
		 */
		System.out.println("the string s is "+s.toUpperCase());

		String s2=s.concat("nunna");

		System.out.println(s2);//now SRUTHI KIRAN NUNNA WILL COME.
		/*
		 * Creating this many strings is waste of memory in HEAP .
		 * sO JVM COMEUP WITH NEW SOLUTION i.e STRING CREATION POOL . 
		 * here once a string object is created first it
		 * wil check for that sting in the pool.if that string exists in 
		 * that case JVM will not create a new string but assigns our reference 
		 * to that string objcet.so from this we can say that one string object 
		 * can contain so many references.SO IMMUTABLE is the main advantage here.:)
		 *why because if one reference changes the object the values of other 
		 *refernce will effect. 
		 * 
		 */
		/*
		 * WAYS TO CREATE A STRING OBJECT .
		 */

		String s3= "sruthi";
		String s4 =  new String("KRANTHI kiran");

		/*
		 * the difference between this two methods is if we use new even if the 
		 * string exist in the pool also it will create some memory in stack 
		 * for this string.
		 * if are not using new to create a string in that case it uses the string in 
		 * pool if it exist .
		 if it is not exist in pool in that case it will create some memory in heap. 
		 */

	}


	public static void main(String args[])
	{
		Stringsusing s =  new Stringsusing();

	}




}
