package DataCollectionImpl;

import java.util.List;

import DataAccess.DataAccessSubsystem;
import DataAccess.DataAccessSubsystemFacade;
import DataAccess.DatabaseException;
import DataCollectionFrameWork.IModel;
import DataCollectionFrameWork.ItemCollection;

public class MovieCollection extends ItemCollection {

	@Override
	public List<IModel> getModelCollection() throws DatabaseException {
		DataAccessSubsystem dataAccess = new DataAccessSubsystemFacade();
		dataAccess.read();
		
		// TODO Auto-generated method stub
		return null;
	}

}
