package Practice;
/*
 * wrapping up of data and code in single unit.
 */
public class EncapsulationUsing {
	/*
	 * Note : Making instance variables as private and 
	 * accessing them only using public methods
	 * 1) if other programmers may using your code , their is 
	 * a chance that they may change your variables.
	 * so we are making that variables as private and priving the
	 * access to that variables using public methods.
	 * it is not effecting enyones code.
	 * OOD : PROVIDES MAINTAINABILITY AND EFFICIENCY in OO
	 */
	public  int width;
	public int height; 
	
	/*check what will hapeen if we have public variables in Encapuslation two class*/
	
	public void setWidthHeight(int w)
	{
		width = w;
		height =  w/3;
	}
	
	/*
	  * we always wanted that height should be 1/3 of width;
	  * but here our varibales are open any one can change it
	  * see Encapuslationtwo class
	  */
	
	public  int width1;
	public int height1; 
	
	/*check what will hapeen if we have private variables 
	 * in Encapuslation two class proving access 
	 * with only public methods
	 * */
	
	public void setWidthHeight1(int w)
	{
		width1 = w;
		height1 =  w/3;
	}
	
	private int a;
	private int b;
	private int c;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	/*
	 * we created private variables and accessed using public methods.
	 * see class Encapsulationtwo class.
	 */
	
}
