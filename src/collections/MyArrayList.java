package collections;
import java.util.*;

/*
 * Array List Declaration :
 * 
 * 1)non generic and not type safe
 * ArrayList test = new ArrayList();
 * List test = new ArrayList();
 * this syntax accepts any object witch is either cat . dog string snything.
 * in order to place the premitives we need to add them like 
 * test.add(new Integer(1));
 * but if we have autoboxing this will handle while we are trying to add an integers.
 * 
 * 
 * 2)Type Safe : this feature is added recently in latest versions of java.
 * 
 * list<String> tets =  new ArrayList<String>(); 
 * if we are speciging the type menas only that type is acceptable.
 */


public  class MyArrayList {
	
	/*
	 * Here not required to specify the size of an array . if we insert an elements size grows.
	 * how the array size grows?
	 * 
	 * some cases first it will give capacity of 10 elemensts and if we are trying to add 11th element then again
	 * it will assign 10 capacity.
	 * sometimes it depends on jvm.
	 * 
	 * Sort : if our arratlist contains premitive types by using SORT method it will sort the elements in the list.
	 * for integers based on numeric values and for strings based on alphabests it will arrange the elements.
	 * but if our arraylist stores the objects then how it will sort ???
	 * 
	 * here is the answer : COMPARETO : sort using the COMPARETO to compare the objects . 
	 * we can compare with objects instance varibales. 
	 * boolean t = titile.compareto(obj.getTitle());
	 * depending up on the above returned boolean value the values will be arranged.
	 * for this we need to implements comparable.
	 * 
	 */
		 public static void main(String[] a){
	         	ArrayList a2 =  new ArrayList();
	         	List al =  new ArrayList();
		        al.add(new String("JAVA"));
		        al.add(new String("sruthi"));
		        al.add(new String("kiran"));
		        al.add(new String("king"));
		        //a2.add("1");
		        System.out.println(al.size());
		       /*for (Object s : al)
		        {
		       	System.out.println(s);
		        }*/
				/*Iterator<String>  i= al.iterator();
		        while(i.hasNext())
		        {
		        	System.out.println(i.next());
		        }*/
		    }

}
