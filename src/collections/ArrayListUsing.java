package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListUsing {
	static int sum =0;
	 public static void main(String[] a){
      	ArrayList<String> a2 =  new ArrayList<String>();
      	List al =  new ArrayList();
    	ArrayList<Integer> a3 =  new ArrayList<Integer>();
	        al.add(new String("JAVA"));
	        al.add(new String("sruthi"));
	        al.add(new String("kiran"));
	        al.add(new String("king"));
	        a2.add("hrllooo");
	        a2.add("hrrrr");
	        a3.add(1);
	        a3.add(5);
	        a3.add(6);
	        a3.add(9);
	        System.out.println(add(a3));
	        System.out.println(a2.size());
	        System.out.println(al.size());
	 }
	 public static int add(ArrayList<Integer> a3)
	 {
		 for(int a : a3)
		 {
		sum =  sum  + a;
		 }
		return sum;
		 
	 }

}
