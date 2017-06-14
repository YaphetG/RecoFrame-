package EngineImplementation;

import EngineFramework.ModelCollection;
import EngineFramework.Iterator;


public class Runner {

	public static void main(String[] args) {
		ModelCollection clln = getMovies();
		Iterator i = (Iterator) clln.CreateIterator();
		while(i.hasNext()){
			Movie m = (Movie)i.next();
			System.out.println(m.getId()+ " , "+ m.getTitle()+" , "+ m.getGenre());
		}
	}
	
	
	
	private static ModelCollection getMovies(){
		Movie m = new Movie();
		ModelCollection movieCollection = new ModelCollection();
		
		for(Integer i=0; i<100;i++){
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
