package templateDesignPattern;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
 abstract class Writer 
{
  public int sum(int a,int b)
  {
	  return a+b;
  }
  public abstract void showResult(int result);
}
 //Extension to Template class1
 class ScreenWriter extends Writer
 {
	 public void showResult(int result)
	 {
		 System.out.println(result);
	 }
 }
//Extension to Template class2
class FileWriter extends Writer
{
	 public void showResult(int result)
	 {
		 try
		 {
			 //Confusion where is the FileLocated in which he showed the Output.
			 String s1=String.valueOf(result);
			 BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("abc.txt")));
		     bw.write(s1);
		     bw.flush();
		     bw.close();
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
	 }
}
public class TemplateTest
{
	public static void main(String s[])
	{
		ScreenWriter sc=new ScreenWriter();
		int result=sc.sum(10,20);
		sc.showResult(result);
		FileWriter fw=new FileWriter();
		int result1=fw.sum(10,20);
		sc.showResult(result1);
	}
}