package EngineImplementations;


import java.sql.*;
import Framework.Engine.Analytics;
import Framework.Engine.ModelCollection;
import DataCollectionImplementations.*;
import Exceptions.DatabaseException;
public class Runner {

	public static void main(String[] args) {
		
		ModelCollection clln=null;
		try {
			clln = (new MovieCollection()).getModelCollection();
		} catch (DatabaseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(clln!=null){
		Analytics.INSTANCE.setProductCollection(clln);
		Analytics.INSTANCE.runProductCollection(new GenreBasedRecommender());
		}
		else{
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		}
		
		 
		
	}
	
	
	
	private static ModelCollection getMovies(){
		Movie m = new Movie();
		ModelCollection movieCollection = new ModelCollection();
		
		for(Integer i=0; i<100;i++/**/){
			m.SetId(i.toString());
			char c =(char) ((i.intValue()+33)%94);
			m.setTitle(new Character(c).toString());
			if(i<30)m.setGenre("Comedy");
			else if(i<70)m.setGenre("Acton");
			else m.setGenre("Romance");
			movieCollection.add(m);
			m =(Movie) m.clone();
			
			
		}
		return movieCollection;
	}

}
