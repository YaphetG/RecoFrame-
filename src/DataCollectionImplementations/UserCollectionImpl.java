package DataCollectionImplementations;

import java.util.ArrayList;
import java.util.List;

import DataAccessImplementations.DataAccessSubsystemImpl;
import Exceptions.DatabaseException;
import Framework.DataAccess.DataAccessSubsystemFacade;
import Framework.DataCollection.UserCollector;
import Framework.Engine.ModelCollection;

public class UserCollectionImpl extends UserCollector{
	DataAccessSubsystemFacade dataAccess;

	@Override
	public ModelCollection getModelCollection() {
		dataAccess = new DataAccessSubsystemImpl();
		try {
			dataAccess.read();
		} catch (DatabaseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ModelCollection users = new ModelCollection();
		
		
		// TODO Auto-generated method stub
		return users;
	}

}
