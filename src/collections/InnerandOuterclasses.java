package collections;

public class InnerandOuterclasses extends MyOuter{

	private int OuterA = 90;
	static int OuterB = 100;
	InnerandOuterclasses()
	{
		/*Inner obj = new Inner();
		obj.seeOuter(); */
	/*
	 * in non static methods we can directly create an object to the Inner class
	 */
	}
	/*
	 * with inner class object we can not access the out class members.
	 */
	public void seeInner()
	{
		System.out.println("helloo");
	}
	class Inner 
	{

		Inner()
		{
			System.out.println("hello i am constructor inner");
		}
		public void seeOuter()
		{
			Inner obji = new Inner();
			System.out.println("the outer values are " + OuterA + " " +OuterB);
			InnerandOuterclasses object = new InnerandOuterclasses();
			object.seeInner();
			seeInner();
		}
	}
	public static void main(String args[])
	{
		InnerandOuterclasses obj = new InnerandOuterclasses();
		Inner obji = obj.new Inner();
		obji.seeOuter();
		/*
		 * in the static methods of outer class if we want to create an object to the
		 * Inner class : Outer class Object should required.
		 */
		OverrideInnerclass object = new OverrideInnerclass();
		object.name();
		Sum objaa = new Sum();
		objaa.function();
		
	}
}
