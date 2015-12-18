package Thread;
/*
 * surprising each object has its own lock.
 */
public class StringBufferandbuilderdiff implements Runnable{
	StringBuffer buf = new StringBuffer();
	StringBuilder bul = new StringBuilder();
	StringBufferandbuilderdiff(StringBuffer buf, StringBuilder b)
	{
		this.buf = buf;
		this.bul=b;
	}
	public void run()
	{
	/*	buf.append(" sruthi");
		buf.append(" kiran");
		System.out.println(buf);*/
		bul.append(" sruthi");
		bul.append(" kiran");
		bul.append(" ting ting");
		System.out.println(bul);
	}
	public static void main(String args[])
	{
		StringBufferandbuilderdiff obj = new StringBufferandbuilderdiff(new StringBuffer("obj1"),new StringBuilder("obj1"));
		StringBufferandbuilderdiff obj2 = new StringBufferandbuilderdiff(new StringBuffer("obj2"),new StringBuilder("obj2"));
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj2);
		
		Thread t3 = new Thread(obj);
		Thread t4 = new Thread(obj2);
		t3.start();
		t4.start();
		t1.start();
		t2.start();
	}

}
