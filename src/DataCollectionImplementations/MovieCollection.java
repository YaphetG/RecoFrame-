package DataCollectionImplementations;

import java.util.List;

import DataAccessImplementations.DataAccessSubsystemImpl;
import Exceptions.DatabaseException;
import Framework.DataAccess.DataAccessSubsystemFacade;
import Framework.DataCollection.ItemCollector;
import Framework.Engine.ModelCollection;

public class MovieCollection extends ItemCollector {

	@Override
	public ModelCollection getModelCollection() throws DatabaseException {
		DataAccessSubsystemFacade dataAccess = new DataAccessSubsystemImpl();
		dataAccess.read();
		
		// TODO Auto-generated method stub
		return null;
	}

}
