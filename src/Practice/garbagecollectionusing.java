package Practice;
/*
 * most most important topic is GC.
 * in c and c++ don't offer the automatic garbage collection.their we need to add 
 * some logic to our applications.
 * MEAMORY LEAKS : SOME times while recovering memory few memory we may lost.
 * that is called memory leaks.and collection of this all memory leaks may cause crash
 * and manual garbage collection also very complex.
 */
/*
 * GC : IN JAVA THIS IS AUTOMATIC.
 * HEAP : WHERE ALL JAVA objects present . THIS IS THE ONE AND ONLY ONE PART WHERE THE
 *GARBAGE COLLECTION PROCESS.
 *GC TASK : FINDING THE DISCARD OBJECT AND DELETING.
 *jvm activates the GC if it feels memory is running low.
 *in this case it calls the gc.
 *GC FINDS THE discared objects and it will remove them.
 *
 *SOME TIMES IF WE WANT OUR PROGRAM ALSO CAN START RUNNING GC.(syste.gc())
 *GC : REFERNCE COLLECTOR, SWEEP ALGORITHEM.(no one sure about the algorithem that 
 *the GC is using)
 *
 *SO WHEN AN OBJECT IS ACCESSIBLE TO GC FOR DELETING : the threads related 
 *to the object all are dead . in that case only object is eligible to GC.
 *simply if the object has a no reference then GC will  recover the memory.
 * 
 */
/*
 * how to make objects eligible for GC with your code.
 * Simply assign NULL to your object
 */
public class garbagecollectionusing {
	
	/*
	 * system.gc() to request JVM to GC .But we are not sure that JVM will call GC or not
	 * then what is the purpose of system.gc()??
	 *Answer : Something is better than nothing rite just we are requesting here 
	 *to do or not is up to the JVM .:)
	 *this is very important interview question.:) 
	 */

}
