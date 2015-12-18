package Test;

public class Test2 {
	public static void main(String args[])
	{
		Test1 test =  new Test1(0, 0);
		Test1 testarray[] =  new Test1[10];
		for(int i=0;i<10;i++)
		{
			testarray[i] =  new Test1(0,0);
		}
		test.a=10;
		System.out.println(test.a);
		testarray[1].setA(10);
		System.out.println(testarray[1].a);
		
	}

}
