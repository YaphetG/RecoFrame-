package DataCollectionImpl;

import java.util.List;

import DataAccess.DataAccessSubsystem;
import DataAccess.DataAccessSubsystemFacade;
import DataAccess.DatabaseException;
import DataCollectionFrameWork.ItemCollector;
import EngineFramework.ModelCollection;

public class ItemCollectorImpl extends ItemCollector {
	DataAccessSubsystem dataaccesss;
	ModelCollection collection;

	@Override
	public List<ModelCollection> getModelCollection() throws DatabaseException {
		 dataaccesss = new DataAccessSubsystemFacade();
		 dataaccesss.read();
		 
		 // the files that has been read and brought are then modified to only two attributes 
		 //and populated to the entity class, put on collection list and returned; 
		
		collection.getCollection();
		// TODO Auto-generated method stub
		
		return null;
	}

}
