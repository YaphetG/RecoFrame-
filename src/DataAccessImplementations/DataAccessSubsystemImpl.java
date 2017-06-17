package DataAccessImplementations;

import java.sql.SQLException;

import DataCollectionImplementations.MovieDbClass;
import Exceptions.DatabaseException;
import Framework.DataAccess.ConnectionContext;
import Framework.DataAccess.ConnectionStrategy;
import Framework.DataAccess.DataAccessSubsystemFacade;
import Framework.DataAccess.DbClass;
import Framework.DataAccess.IDataAction;
import Framework.DataCollection.RecomEngineProduct;

public class DataAccessSubsystemImpl implements DataAccessSubsystemFacade{
	IDataAction action;
	ConnectionStrategy strategy;
	DbClass moviedbclass;
	
	
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
	public void read() throws DatabaseException {
		try {
			ConnectionContext connect = new ConnectionContext();
			
			
			strategy = new ConnectionStrategyImpl();
			
			connect.setStrategy(strategy);
			connect.createConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		moviedbclass = new MovieDbClass();
		action= new DataAction(moviedbclass);
		action.read();

	}

	@Override
	public void atomicRead() throws DatabaseException {
		// Implement

	}

	@Override
	public void write(RecomEngineProduct recommendation) throws DatabaseException {
		try {
			ConnectionContext connect = new ConnectionContext();
			
			
			strategy = new KnowlegdeDbConnectionStrategyImpl();
			
			connect.setStrategy(strategy);
			connect.createConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		action = new DataAction(moviedbclass);
		action.write();
		
	}


	




}
