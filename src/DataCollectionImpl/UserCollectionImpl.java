package DataCollectionImpl;

import java.util.ArrayList;
import java.util.List;

import DataAccess.DataAccessSubsystem;
import DataAccess.DataAccessSubsystemFacade;
import DataAccess.DatabaseException;
import DataCollectionFrameWork.UserCollector;
import EngineFramework.ModelCollection;

public class UserCollectionImpl extends UserCollector{
	DataAccessSubsystem dataAccess;

	@Override
	public List<ModelCollection> getModelCollection() {
		dataAccess = new DataAccessSubsystemFacade();
		try {
			dataAccess.read();
		} catch (DatabaseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<ModelCollection> users = new ArrayList<ModelCollection>();
		
		
		// TODO Auto-generated method stub
		return users;
	}

}
