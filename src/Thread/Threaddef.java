package Thread;

public class Threaddef {
	
	/*
	 * Thread : individual and lightweight process.Thread has its own call stack.
	 * every program has at least one thread.say main ().
	 * scheduling of threads is different in different CPUS . The order of execution of threads is not guaranteed.
	 * 
	 * How to create a thread ?
	 * 1)By extending THREAD 
	 * 
	 * 2)implementing RUNNABLE INTERFACE.(this is more bettr ,why because in java at a time a single class can not extend more classes .)
	 * 
	 * in both types we are overriding run().
	 * this method will be called once if we call the start() of that thread.
	 * 
	 * Thread states :
	 * 
	 * 1) new 2)runnable 3)wait 4)blocked 5)dead.
	 * immediatly after creation of thread object first stage is NEW. once if we call the START then it will enter into RUNNABLE.
	 * once if a thread is created means it is alive until dead  .but it will be in runnable stage only if we call the start().
	 * (thread is alive in all the stages from creation of thread to dead stage)
	 * runnable : this is a pool contains the threads which are ready to run.depending 
	 * upon the priority of threads that threads will enter into run state.
	 * once a thread is dead means that can not be restarted.
	 * 
	 */

}
