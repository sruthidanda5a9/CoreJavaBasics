package Thread;

public class waitNotify {
	/*
	 * There is a situation that one thread operation is depend on another thread.
	 * in that case we are going to use wait,notify,notify all
	 * we are saying the thread to wait until i notify you.:)
	 * see the well known example of producer and consumer .
	 * producer has to produce the value and consumer has to consume it. if consumer consumes it before
	 * the producer produces then its a problem.
	 */
	Consumer c;
	Producer p;
	int x;
	boolean flag = false;
	
	
	public synchronized int getX()  {
		if(flag == false)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		flag= false;
		notifyAll();
		System.out.println("getting x "+x);
		return x;
		
		
	}


	public synchronized void setX(int x)  {
		if(flag == true)
		{
	
		 try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		else
		{
			System.out.println("seting  x "+x);
			this.x = x;
			flag = true;
			 notify();
		}
	}


	public static void main(String args[])
	{
		waitNotify obj = new waitNotify();
		Producer P = new Producer(obj);
		Consumer c= new Consumer(obj);
		Thread t= new Thread(P);
		Thread t2= new Thread(c);
	    t.start();
	    t2.start();
	}

}
