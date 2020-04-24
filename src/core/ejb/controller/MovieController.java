package core.ejb.controller;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import core.ejb.DAO.MovieEJB;
import core.entity.Movies;

@ManagedBean(name="movie")
public class MovieController {

	
	private Movies movies;
	
	@EJB
	private MovieEJB movieEJB;
	
	@PostConstruct
	public void init() {
		movies = new Movies();
	}
	
	public String saveMovies() {
		
		movieEJB.saveMovies(movies);
		return "success";
	}

	public Movies getMovies() {
		return movies;
	}

	public void setMovies(Movies movies) {
		this.movies = movies;
	}
}
