package Practice;

//checking how final key word usesd
/* purpose : We cannot sub class the final 
 * class i.e we can can not extend and 
 * we can not override the methods or variable */
public final class FinalKeyWord {
 
//	final static int  b =0;
  public void add()
  {
	  for( ; ; )
	  {
		  int i=0;/*
		  interesting note : we can not assign access modifiers to local variables WHY??
		  */
	  }
  }
  public static void main(String args[])
  {
	  AccessModifiersUsing object = new AccessModifiersUsing();
	  System.out.println(object.a);
	  /*
	  able to access protected varibale of
	   AccessModifiersUsing using its object in the same package
	  */
	  System.out.println(object.b);
	  /*/*
	  able to access default varibale of
	   AccessModifiersUsing using its object package
	  */
	  /*
	   * can we careate an object to finel class???
	   */
	  FinalKeyWord on = new FinalKeyWord();
	 
  }
}
