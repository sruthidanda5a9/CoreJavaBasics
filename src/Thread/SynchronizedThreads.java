package Thread;

public class SynchronizedThreads implements Runnable {
	/*
	 * RACE CONDITION : 
	 */
	private Account acc =  new Account();
	public void run()
	{
		/*
		 * either way is fine
		 */
		synchronized (acc) 
		{			
		for(int i=0;i<2;i++)
		{
		makewithdraw(10);
		if(acc.getBalance() < 0)
		{
			System.out.println("out of balance");
		}
		}
		}
		
	}
	public  void  makewithdraw(int amount)
	{
	
		if(acc.getBalance() >= amount)
		{
			System.out.println(Thread.currentThread().getName() + "  is going to execute  " +acc.getBalance());
			try
			{
				Thread.sleep(1);
			}catch(InterruptedException e)
			{
				
			}
			acc.withdraw(amount);
			System.out.println(Thread.currentThread().getName() + " Completes execution  "+ acc.getBalance());
		}
		else
		{
			System.out.println(Thread.currentThread().getName()+"  IS OUT OFF BALANCE" + acc.getBalance());
		}
	}
	
	public static void main(String args[])
	{
		SynchronizedThreads syn =new SynchronizedThreads();
		Thread t =  new Thread(syn);
		Thread  t2 = new Thread(syn);
		SynchronizedThreads syn2 =new SynchronizedThreads();
		Thread t3 =  new Thread(syn2);
		Thread  t4 = new Thread(syn2);
		t.setName("sruthi");
		t2.setName("kiran");
		t3.setName("sruthi hhh");
		t4.setName("kiran kkkk");
		t.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
