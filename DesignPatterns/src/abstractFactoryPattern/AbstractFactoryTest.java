package abstractFactoryPattern;
interface Abc
{
	public void xyz();
}
 class AbstractFactoryMethod implements Abc
{
public AbstractFactoryMethod()
{
	System.out.println("XyZ of AbstractFactoryMethod Constructor");

}
public void xyz()
{
	System.out.println("XyZ of AbstractFactoryMethod");
}

}

class AbstractFactoryMethod1 implements Abc
{
public AbstractFactoryMethod1()
{
	System.out.println("XyZ of AbstractFactoryMethod1 Constructor");

}
public void xyz()
{
	System.out.println("XyZ of AbstractFactoryMethod1");
}

}
class Demo
{
	public static Abc m1(String name)
	{
		//Factory Pattern
		if(name.equals("a"))
			return new AbstractFactoryMethod();
		else if(name.equals("b"))
			return new AbstractFactoryMethod1();
		else 
			return null;
	}
}
public class AbstractFactoryTest
{
	//Abstract Factory Pattern Behaviour
	public static void main(String s[])
	{
		Abc a1=Demo.m1("a");
		Abc a2=Demo.m1("b");
         a1.xyz();
         a2.xyz();
	}
	
	
}