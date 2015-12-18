package collections;
import java.io.*;
public class Compare implements Comparable<Compare>{
	
	public int getTest() {
		return test;
	}
	public void setTest(int test) {
		this.test = test;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	int test;
	String Name;
	Compare(int a, String n)
	{
		this.test = a;
		this.Name = n;
	}
	@Override
	public int compareTo(Compare o) {
		// TODO Auto-generated method stub
		int result = Name.compareTo(o.getName());
		return result;
	}
	public int compare(Compare one,Compare two)
	{
		int result ;
		result = one.getName().compareTo(two.getName());
		return result;
	}
	public static void main(String args[])
	{
		
		Compare c = new Compare(1,"sruthi");
		Compare c2 = new Compare(2, "kiran");
		int i=c.compareTo(c2);
		System.out.println(i);
		
		//Collections.sort(compare);
		
	}

}
