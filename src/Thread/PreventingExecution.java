package Thread;

public class PreventingExecution implements Runnable {

/*
 * Thread execution can be prevented using SLEEP , WAIT ,BLOCK states.
 * if the thread is in SLEEP state it will not use the cpu cycles. once the sleep time is over then it will move to the
 * RUNNABLE STAGE.
 * 
 * Wait : IF our THREAD is waiting for some any other resource.
 * main important note : sleep is a static method.and sleep method throws INTERREPTED eXCEPTION.
 */
@Override
public void run() {
	// TODO Auto-generated method stub
	for(int i=0;i<100;i++)
	{
		try {
			Thread.sleep(10);
			System.out.println("i am in sleep mode till now   "+i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public static void main(String args[])
{
	PreventingExecution p =  new PreventingExecution();
	Thread t= new Thread(p);
	t.start();
}

}
