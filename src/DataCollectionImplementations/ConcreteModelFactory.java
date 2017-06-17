package DataCollectionImplementations;

import EngineImplementations.Movie;
import Framework.DataCollection.AItem;
import Framework.DataCollection.AUser;
import Framework.DataCollection.ModelFactory;

public class ConcreteModelFactory implements ModelFactory{
	String id = null;
	String genre= null;
	String name= null;
	
	@Override
	public AItem getItemInstance() {
		
		// TODO Auto-generated method stub
		return new Movie(id, genre, id, genre);
	}

	@Override
	public AUser getUserInstance() {
	
		// TODO Auto-generated method stub
		return new AUser(name, id);
	}
	

}
