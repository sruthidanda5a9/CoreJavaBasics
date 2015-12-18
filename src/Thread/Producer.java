package Thread;

public class Producer implements Runnable{
	waitNotify obj = new waitNotify();
    int x=0;
    Producer(waitNotify obj)
    {
    	this.obj = obj;
    }
	@Override
	public  void run() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<10;i++)
		{
			try
			{
				int t=t = (int)(Math.random()*95);
				obj.setX(i);
				Thread.sleep(t);
			}
			catch(InterruptedException e)
			{
				
			}
		   
		}
	}

}
