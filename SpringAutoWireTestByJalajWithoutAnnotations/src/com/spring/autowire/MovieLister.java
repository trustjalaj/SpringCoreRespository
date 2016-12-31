package com.spring.autowire;

import java.util.Iterator;
import java.util.List;

public class MovieLister 
{
	private MovieFinder movieFinder;
	public void setMovieFinder(MovieFinder movieFinder)
	{
		this.movieFinder=movieFinder;
	}
	public void listMovies(int year)
	{
		List<Movie> moviesList=movieFinder.findMovies(year);
		Iterator<Movie> it=moviesList.iterator();
		while(it.hasNext())
		{
			Movie movie=(Movie)it.next();
			System.out.println(movie.getName());
		}
	}
}
