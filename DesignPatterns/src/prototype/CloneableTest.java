package prototype;
//increase Performance by not executing Constructor Invocation
public class CloneableTest {

	public static void main(String[] args) throws Exception 
	{
      Demo d1=new Demo(10,20);
      System.out.println("d1 hashcode is "+d1.hashCode());
       d1.display();

      Demo d2=(Demo)d1.myClone();
      System.out.println("d2 hashcode is "+d2.hashCode());
       d2.display();

	}

}
