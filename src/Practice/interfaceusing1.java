package Practice;
/*
 * Interfaces dont have constructors, they are not part of object tree.BUT ABSTRACT CLASS HAVE CONSTRUCTORS.
 */
public interface interfaceusing1 {
	int a=9;
	public void add();
	public void testMethod();
	void addd();
	
	/* Note : EVEN IF WE DONT GIVE PUBLIC ACCESS MODIFIER IN INTERFACE ALSO
	 * IN INTERFACE EVERY METHOD IS ABSTRACT AND PUBLIC 
	 * if we try to give
	 *  private as access modifier in interface it will show an error
	 *  so interfaces are complete abstract in nature but abstract classes
	 *  are not complete abstract
	 *  interface will not accept final , static , private, protected etc(
	 *  except public methods it will not accept anything)
	 *  methods but variables should be final, static , public
	 *  eventhoug you type or not before intrface , 
	 *  intrfaces are by default abstract
	 *  an interface can extend more than one interface but not class,
	 *  it just only extends but not implements other interfaces
	 */
	//************************************
	 /* intresting Note 
	 * Interface variables are always constansts,
	 *  the subclass can not change the
	 * value of the interface variables
	 * 
	 * by default if you type or not, interface variables are static and final
	 * the main reason for adding static is , in general immediatly after the
	 * creation of the object its variables will be initialized. but here
	 * we can not create an object so we are making them as static
	 */
}
