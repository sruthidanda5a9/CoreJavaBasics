package collections;

import java.util.Arrays;
import java.util.List;

public class ArraySort {
// int array[]=new int[6];
/*still i don't know that we can directly do operations 
 * on array elemnts like sort search reverse.its shoking for me.*/
public static void main(String args[])
{
	int array[ ] = {1,3,4,5,9,8};
	Arrays.sort(array);
	List list = Arrays.asList(array);
	System.out.println(list.size());
	System.out.println(list.get(0));
	/*
	 * the above statement Array will be converted to LIST.
	 * 
	 * List.toArray() . to convert an list to the array.
	 * i dont know why we are doing this both are same rite???
	 */
	for (int i=0;i<6;i++)
	{
		System.out.println(array[i]);
	}
	
}
}
