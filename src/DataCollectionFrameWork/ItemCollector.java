package DataCollectionFrameWork;

import java.util.List;

import DataAccess.DataAccessSubsystem;
import DataAccess.DatabaseException;
import EngineFramework.ModelCollection;

public abstract class ItemCollector implements DataCollector{
	
	
	DataAccessSubsystem dataAccess;
	
	public abstract List<ModelCollection> getModelCollection() throws DatabaseException;
	
	
	

}
