package DataCollectionImpl;

import java.util.List;

import DataAccess.DataAccessSubsystem;
import DataAccess.DataAccessSubsystemFacade;
import DataAccess.DatabaseException;
import DataCollectionFrameWork.ItemCollection;
import EngineFramework.ModelCollection;

public class MovieCollection extends ItemCollection {

	@Override
	public List<ModelCollection> getModelCollection() throws DatabaseException {
		DataAccessSubsystem dataAccess = new DataAccessSubsystemFacade();
		dataAccess.read();
		
		// TODO Auto-generated method stub
		return null;
	}

}
