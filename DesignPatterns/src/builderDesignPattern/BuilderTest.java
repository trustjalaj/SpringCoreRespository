package builderDesignPattern;
class Burger 
{
public int price()
{
	return 25;
}
}
class Fries
{
	public int price()
	{
		return 15;
	}
}
class Drink
{
	public int price()
	{
		return 30;
	}
}
class MealBuilder
{
	//builder pattern logic
	public int calcPrice()
	{
		return new Burger().price()+new Fries().price()+new Drink().price();
	}
}
class SnackBuilder
{
	public int calcPrice()
	{
		return new Fries().price()+new Drink().price();
	}
}
public class BuilderTest
{
	public static void main(String s[])
	{
		MealBuilder mb1=new MealBuilder();
		int value1=mb1.calcPrice();
		System.out.println("The meal Price is"+value1);
		SnackBuilder sb1=new SnackBuilder();
		int value2=sb1.calcPrice();
		System.out.println("The snack Price is"+value2);
	}
}