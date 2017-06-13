package EngineImplementation;

import EngineFramework.AItem;

public class Movie extends AItem {
	private String title;	
	private String genre;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	private Movie(){
		super();
	}	
	
	@Override
	public AItem CreateModel() {
		// TODO Auto-generated method stub
		return new Movie();
	}
	

}
