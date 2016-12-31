package com.spring.autowire;

import java.util.ArrayList;
import java.util.List;

public class MovieFinder 
{
	private Movie movies[]={new Movie("ABC",2016),new Movie("Bahubali",2015),new Movie("3idiots",2016),new Movie("Bajrangi",2015)};
	public List<Movie> findMovies(int year)
	{
		List<Movie> moviesList=new ArrayList<Movie>();
		for(Movie movie: movies)
		{
			if(movie.getYear()==year)
			{
				moviesList.add(movie);
			}
		}
		return moviesList;
	}
}
