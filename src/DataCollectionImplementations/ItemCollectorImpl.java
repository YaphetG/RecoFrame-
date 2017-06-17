package DataCollectionImplementations;

import java.util.List;

import DataAccessImplementations.DataAccessSubsystemImpl;
import Exceptions.DatabaseException;
import Framework.DataAccess.DataAccessSubsystemFacade;
import Framework.DataCollection.ItemCollector;
import Framework.Engine.ModelCollection;

public class ItemCollectorImpl extends ItemCollector {
	DataAccessSubsystemFacade dataaccesss;
	ModelCollection collection;

	@Override
	public ModelCollection getModelCollection() throws DatabaseException {
		 dataaccesss = new DataAccessSubsystemImpl();
		 dataaccesss.read();
		 
		 // the files that has been read and brought are then modified to only two attributes 
		 //and populated to the entity class, put on collection list and returned; 
		
		collection.getCollection();
		// TODO Auto-generated method stub
		
		return null;
	}

}
