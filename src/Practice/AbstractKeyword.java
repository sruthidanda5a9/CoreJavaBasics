package Practice;

import AccessModifiers.InterfaceOne;

/*if a class is abstratct we need to extend it and implement it 
 * we can  not create an object to abstract 
 * class but we can create reference to this. clearly we can create an reference to the
 * pure abstract class (interface) also :)
 *  */

public abstract class  AbstractKeyword  implements InterfaceOne  {

	int  a=0;
	int  b=0;

	/*
	 * ONLY methods can be abstracted in abstract class 
	 * variables cannot be abstracted.
	 * if we have at least one abstract method that 
	 * class should be abstracted.
	 * WE CAN NOT INSTANTIATE THE ABSTRACT CLASS BUT HOW TO USE THE
	 * VARIABLES IN THE OUT SIDE WORLD??
	 * 
	 * ans: with the reference variable.:)
	 */

	public final void add()
	{

		/* 
		 * this method can not be changed i.e we can not override this
		 * NOTE : FINAL CLASS : WE CAN NOT EXTEND 
		 * BUT CAN USE IT WITH REFERENCE VARIABLE
		 * FINAL METHOD AND FINAL VARIABLES WE CANNOT CHANGE BUT
		 * WE CAN USE THEM.
		 * FINAL CLASS WE CAN NOT SEE THIS CLASS TO EXTEND IT.
		 */

	}
	public abstract  void sub();

	/* abstartc methods should not have an implementation extended class should provide 
	 * the implementation and create an object for them
	 * abstract methods should end with ";" */
	/* TRY TO CREATE AN OBJECT FOR THIS ABSTART CLASS
	 *Note : abstract and final this combination is never possible
	 *why because we can not override the final .the main purpose of abstract 
	 *is override .:)
	 */
	/* it is not required that every member 
	in the abstract class should be abstract.*/

	public static void main(String args[])
	{
		//can not instatintiate the type abstract type error is coming
		//AbstractKeyword object = new AbstractKeyword();
	}
	/*Important Note : we can use final methods in abstartct class 
	 * but we canot add final to
	 * abstratc methods , we should overide
	 *  the abstratc methods in the subclass so we should not add 
	 * final keyword to abstract methods */

}
abstract	 class Another extends AbstractKeyword
{

	/*abstract class can extend normal class as well abstract class.
	 * 
	 */
	@Override
	public void sub() {
		// TODO Auto-generated method stub

	}
	/* one abstratc class extends an another abstract class
	 * like interfaces we should not implement abstart class we should do only extract
	 */
}