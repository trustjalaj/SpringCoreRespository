package prototype;
//For Singleton class:Clone support you need to provideSo that all doors are closed.
public class Demo implements Cloneable
{
 int a,b;
 public Demo(int x,int y)
 {
	 System.out.println("2-param Constructor");
     a=x;
     b=y;
 }
 public Demo()
 {
	 System.out.println("0-param Constructor");

 }
 public Object myClone()throws Exception
 {
	 Object obj1=super.clone();//perfors cloning of current Object
	 return obj1;
 }
 public void display()
 {
	 System.out.println(a);
	 System.out.println(b);

 }
}
