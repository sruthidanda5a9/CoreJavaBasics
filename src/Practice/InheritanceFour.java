package Practice;

public class InheritanceFour extends InheritenceOne {
	
	
	

	InheritanceFour(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	/*
	 * this class is having 
	 * Hi methods of parent classes
	 */
	public void hh()
	{
		System.out.println("he he i am in child  class");
	}
	
	/*
	 * IS-A relationship here InheritanceFour extending InheritenceOne 
	 * i.e nothing but InheritanceFour IS A InheritenceOne
	 * EG : CAR IS A VEHICLE
	 * CAR EXTENDING VEHICLE CLASS
	 */
	/*
	 * HAS A relation ship if VEHICLE CLASS having an instance of 
	 * ROAD class , we can use ROAD class methods in VEHICLE class with the 
	 * object of ROAD class.
	 * so here we can say that VEHICAL HAS A ROAD relationship
	 * 
	 * 
	 */
	/*
	 * Diamond problem :
	 * in JAVA we can not extend two classes at a time like in c++.
	 * if we extend two classes suppose class A and class B both have 
	 * the same method in that case it creates a problem in child class 
	 * that which method to use.
	 * this problem is called as diamond problem.
	 */
}
