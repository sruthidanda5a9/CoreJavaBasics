package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

/*
 * only uniq values.
 */
public class Setusing {
   public static void main(String args[])
   {
	   
	   Set s = new TreeSet();
	   List l = (List) new ArrayList();
	   /*
	    * adding elements to set
	    */
	   s.add("1");
	   s.add("2");
	   s.add("1");
	   /*
	    * this is not adding the duplicate value
	    */
	   /*
	    * adding elemnts to list
	    */
	   l.add("sruthi");
	   l.add("kiran");
	   System.out.println(s.size());
	   java.util.Iterator i  = s.iterator();
	   while(i.hasNext())
	   {
		   System.out.println(i.next());
	   }
	   System.out.println(l.size());
	   java.util.Iterator il  = l.iterator();
	   while(il.hasNext())
	   {
		   System.out.println(il.next());
	   }
   }

}
