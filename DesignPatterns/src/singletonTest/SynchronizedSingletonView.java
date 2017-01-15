package singletonTest;

public class SynchronizedSingletonView 
{
	private static SynchronizedSingletonView n;
	private  SynchronizedSingletonView() 
	
	{
		System.out.println("Private Constructor");
	}
	//static Factory method
	public synchronized static SynchronizedSingletonView create1()
	{
		if(n==null)
		{
			n=new SynchronizedSingletonView();
		}
		return n;
	}
}


