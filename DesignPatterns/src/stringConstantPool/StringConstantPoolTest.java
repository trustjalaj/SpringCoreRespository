package stringConstantPool;

public class StringConstantPoolTest
{

	public static void main(String[] args) 
	{
        StringConstantView t1=new StringConstantView(10,"Jalaj");
        System.out.println("t1 object hashcode is "+t1.hashCode());
       t1.display();
        StringConstantView t2=t1.modifyData(20,"Mansi");
        System.out.println(t2.hashCode());
        System.out.println("t2 display is");

        t2.display();
        System.out.println("t1 display is");

        t1.display();
        StringConstantView t3=t1.modifyA(30);
        System.out.println(t3.hashCode());
        System.out.println("t3 display is");

        t3.display();
        System.out.println("t1 display is");

        t1.display();

	}

}
