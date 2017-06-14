package EngineImplementation;

import EngineFramework.AItem;
import EngineFramework.IModel;

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

	@Override
	public String getId() {
		
		return this.id;
	}

	@Override
	public void SetId(String s) {
		this.id = s;
		
	}
}
