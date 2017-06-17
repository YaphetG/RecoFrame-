package EngineImplementations;

import Framework.DataCollection.AItem;

public class Movie extends AItem {
	
	

	public Movie( String id, String genre, String year, String name) {
		super(id, genre);
	 this.name = name;
	 this.year = year;
	}


	private String name;	
	private String genre;
	private String id;
	private String year;
	
	public String getName() {
		return name;
	}

	
	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String getId() {
		
		return this.id;
	}

	@Override
	public void SetId(String s) {
		this.id = s;
		
	}


	@Override
	public String toString() {
		return "Movie [name=" + name + ", genre=" + genre + ", id=" + id + ", year=" + year + "]";
	}
	
}
