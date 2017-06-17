package DataAccessImplementations;

import java.sql.SQLException;

import DataCollectionImplementations.MovieDbClass;
import DataCollectionImplementations.RecommDbClass;
import Exceptions.DatabaseException;
import Framework.DataAccess.DataAccessSubsystemFacade;
import Framework.DataAccess.DbClass;
import Framework.DataAccess.IDataAction;
import Framework.DataCollection.RecomEngineProduct;
import Framework.Engine.ModelCollection;

public class DataAccessSubsystemImpl implements DataAccessSubsystemFacade{
	IDataAction action;
	
	DbClass moviedbclass;
	DbClass recomdbclass;
	
	
	public DataAccessSubsystemImpl() {
	}

	@Override
	public void establishConnection() throws DatabaseException, SQLException {
		

	}

	@Override
	public void releaseConnection() throws DatabaseException {
		// Implement

	}

	@Override
	public ModelCollection read() throws DatabaseException {
		ModelCollection collection;
		moviedbclass = new MovieDbClass();
		action= new DataAction(moviedbclass);
		collection = action.read();
		
		return collection;
	}

	@Override
	public void atomicRead() throws DatabaseException {
		// Implement

	}

	@Override
	public void write(RecomEngineProduct recommendation) throws DatabaseException {
		
		// TODO Auto-generated method stub
		recomdbclass= new RecommDbClass();
		action = new DataAction(recomdbclass);
		action.write(recommendation);
		
	}


	




}
