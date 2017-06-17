package Framework.DataCollection;

import java.util.List;

import Exceptions.DatabaseException;
import Framework.DataAccess.DataAccessSubsystemFacade;
import Framework.Engine.ModelCollection;

public abstract class ItemCollector implements DataCollector{
	
	
	DataAccessSubsystemFacade dataAccess;
	
	public abstract ModelCollection getModelCollection() throws DatabaseException;
	
	
	

}
