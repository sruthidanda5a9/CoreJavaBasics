package Thread;

public class Consumer implements Runnable {
	int x;
	waitNotify obj;
	Consumer(waitNotify obj)
	{
		this.obj=obj;
	}



	@Override
	public  void run() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<10;i++)
		{
			
			try
			{
				int t= t = (int)(Math.random()*95);
				
				Thread.sleep(t);
				
				x=obj.getX();
			}
			catch(InterruptedException e)
			{
				
			}
		
		
	}
	}
}
