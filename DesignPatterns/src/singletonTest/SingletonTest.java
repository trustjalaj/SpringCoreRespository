package singletonTest;
//Testing
public class SingletonTest extends Object
{

 
	public static void main(String[] args) 
	{
	 SingletonView st1=SingletonView.create();
	 SingletonView st2=SingletonView.create();
	 SingletonView st3=SingletonView.create();
    System.out.println("st1 hashcode is "+st1.hashCode());
    System.out.println("st2 hashcode is "+st2.hashCode());
    System.out.println("st3 hashcode is "+st3.hashCode());
	 //SingletonView st4 = (SingletonView)st3.clone();
    
	}

}
