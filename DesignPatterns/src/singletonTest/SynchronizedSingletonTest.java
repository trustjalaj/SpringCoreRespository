package singletonTest;

public class SynchronizedSingletonTest 
{
 
	public static void main(String[] args) 
	{
		
		
		SynchronizedSingletonView st1=SynchronizedSingletonView.create1();
		SynchronizedSingletonView st2=SynchronizedSingletonView.create1();
		SynchronizedSingletonView st3=SynchronizedSingletonView.create1();
		 System.out.println("st1 hashcode is "+st1.hashCode());
		    System.out.println("st2 hashcode is "+st2.hashCode());
		    System.out.println("st3 hashcode is "+st3.hashCode());
         
	    
		 //SingletonView st4 = (SingletonView)st3.clone();
	}

}
