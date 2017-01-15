package stringConstantPool;

public final class StringConstantView 
{
private final int a;
private final String b;
//Constructors
public StringConstantView(int a,String b)
{
this.a=a;
this.b=b;
}
//Write factory method when Data modification is required
public StringConstantView modifyData(int a,String b)
{
	return new StringConstantView(a,b);
}
public StringConstantView modifyA(int a)
{
	return new StringConstantView(30,this.b);

}
public StringConstantView modifyB(String b)
{
	return new StringConstantView(this.a,b);	

}
public void display()
{
	System.out.println(a);
	System.out.println(b);

}
}
