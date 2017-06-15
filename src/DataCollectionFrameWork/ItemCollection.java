package DataCollectionFrameWork;

import java.util.List;

import DataAccess.DataAccessSubsystem;
import DataAccess.DatabaseException;

public abstract class ItemCollection implements DataCollector{
	
	
	DataAccessSubsystem dataAccess;
	
	public abstract List<IModel> getModelCollection() throws DatabaseException;
	
	
	

}
