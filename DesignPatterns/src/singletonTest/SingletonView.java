package singletonTest;
//My Aim is to create SingleTon class so that multiple Objects are not created.
public class SingletonView 
{
private static SingletonView n;
private SingletonView()
//private constructor use is that we cannot access this Constructor from outside the class.
//Check for other reasons
{
	System.out.println("Private Constructor");
}

//static Factory method
public static SingletonView create()
{
	if(n==null)
	{
		n=new SingletonView();
	}
	return n;
}
}

