package com.spring.autowire;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args)
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		MovieLister lister=(MovieLister)ctx.getBean("movieLister");
		System.out.println("List Of 2015 Movies");
		lister.listMovies(2015);
		System.out.println("List of 2016 Movies");
		lister.listMovies(2016);
	}

}
