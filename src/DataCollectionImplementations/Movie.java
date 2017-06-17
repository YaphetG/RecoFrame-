package DataCollectionImplementations;

import Framework.DataCollection.AItem;

public class Movie extends AItem {
	Movie() {
		// TODO Auto-generated constructor stub
	}
	

	 Movie(String id,String name, String genre,String year) {
		super();
		this.id = id;
		this.name = name;
		this.genre = genre;
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
}
