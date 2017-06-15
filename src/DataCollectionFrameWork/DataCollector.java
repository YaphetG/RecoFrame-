package DataCollectionFrameWork;

import java.util.List;

import DataAccess.DatabaseException;

public interface DataCollector {
	public List<IModel> getModelCollection() throws DatabaseException;
		
	

}
