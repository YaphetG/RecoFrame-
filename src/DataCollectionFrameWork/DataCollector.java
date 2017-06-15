package DataCollectionFrameWork;

import java.util.List;


import DataAccess.DatabaseException;
import EngineFramework.ModelCollection;

public interface DataCollector {
	public List<ModelCollection> getModelCollection() throws DatabaseException;
		
	

}
