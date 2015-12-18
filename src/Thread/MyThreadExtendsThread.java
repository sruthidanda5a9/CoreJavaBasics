package Thread;

public class MyThreadExtendsThread extends Thread{
	/*
	 * creating thread using extending the thread.
	 */
	public void run()
	{
		for(int i= 0 ;i<5;i++)
		{
			System.out.println(i + " " + getName());
		}
		System.out.println("hello this is run of my thread.");
	}
	public static void main(String args[])
	{
		MyThreadExtendsThread t = new MyThreadExtendsThread();
		MyThreadExtendsThread t2 = new MyThreadExtendsThread();
		MyThreadExtendsThread t3 = new MyThreadExtendsThread();
		t.start();//then run method will be called automatically
		/*
		 * if we want we can call the run() with the object we can call but that thread will not create an seperate stack for that.
		 */
		//t.run();
		t3.start();
		System.out.println(t.getName());
		t2.start();//running multiple threads
		
		/*
		 * here we started three threads it does not mean that all the threads will run in order. that is not guaranteed.
		 *any thread can run in any order.it depends on the scheduler of the CPU.some will run one thread after another thread,
		 *and some will like one thread will start and pause and another thread will start .
		 *this is depending on the thread scheduler. 
		 */
	}

}
