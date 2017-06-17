package EngineImplementations;

import Framework.DataCollection.AItem;

public class Movie extends AItem {

	private String name;	
	private String genre;
	private String id;
	private String year;

	public Movie(String id, String genre, String year, String name) {
	 this.id =id;
	 this.genre = genre;
	 this.name = name;
	 this.year = year;
	}


	public Movie() {
		// TODO Auto-generated constructor stub
		super();
	}


	
	public String getName() {
		return name;
	}

	
	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setId(String id) {
		this.id = id;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((year == null) ? 0 : year.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (year == null) {
			if (other.year != null)
				return false;
		} else if (!year.equals(other.year))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Movie [name=" + name + ", genre=" + genre + ", id=" + id + ", year=" + year + "]";
	}

	
}
