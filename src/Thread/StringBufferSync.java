package Thread;

public class StringBufferSync implements Runnable{
	/*
	 * here is the program to synchronize the string buffer.
	 */
	//private StringBuffer buf = new StringBuffer();
	private StringBuilder buf = new StringBuilder();
	int j=0;
	StringBufferSync(StringBuilder b)
	{
		this.buf = b;
	}
	public void run()
	{
		synchronized (buf) {
		while(j<3)
		{
		for (int i=0;i<3;i++)
		{
			System.out.println(buf.charAt(j));
		}
		j++;
		}
	}
	}
	public static void main(String args[])
	{
		//StringBufferSync t = new StringBufferSync(new StringBuffer("abc"));
		StringBufferSync t = new StringBufferSync(new StringBuilder("abc"));
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		t1.start();
		t2.start();
		t3.start();
	}

}
