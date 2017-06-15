package DataCollectionFrameWork;


/* 
This Class provides A connection with the DataAccess Subsystem to fetch Data from the provided Database
and return list of Model 

The collection of model type fetched from Database through the DataBase Subsystem is
 to be used by the engine for running a recommendation algorithm 


the facade provides Encapsulation to the dataBase Subsystem providing only required operations 


* Design patterns left to use, visitor and one structural (this info is for our team)
*/
import java.util.List;

import DataAccess.DataAccessSubsystemFacade;

public abstract class UserCollector implements DataCollector {
	
	DataAccessSubsystemFacade dataAccess;
	public abstract List<IModel> getModelCollection();
}
