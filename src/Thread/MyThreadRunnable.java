package Thread;

public class MyThreadRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("hello thisis my thread");
		
	}
	public static void main(String args[])
	{
		MyThreadRunnable obj = new MyThreadRunnable();
		/*
		 * if we are implementing runnable , we need to create an THREAD OBJECT AND we need to passs our runnable 
		 * implemented class object to that thread. then only we can start our Thread. 
		 * why why why separate thread and why why we are passing our object to that? 
		 */
		Thread t = new Thread(obj);
		t.start();
	}

}
