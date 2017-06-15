package DataCollectionFrameWork;

import java.util.List;

import DataAccess.DatabaseException;

public abstract class ItemCollection implements DataCollector{
	
	public abstract List<IModel> getModelCollection() throws DatabaseException;
	
	
	

}
