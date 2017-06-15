package DataAccess;

public class DataAccessSubsystemFacade implements DataAccessSubsystem {
	IDataAction action;
	ConnectionStrategy strategy;

	public DataAccessSubsystemFacade() {
	}

	@Override
	public void establishConnection(String URL) throws DatabaseException {
		ConnectionContext connect = new ConnectionContext();
		// Instantiate A strategyImplementation
		// strategy= new "instance of ConnectionStrategy Implementation()";
		connect.setStrategy(strategy);
		connect.createConnection(URL);

	}

	@Override
	public void releaseConnection() throws DatabaseException {
		// Implement

	}

	@Override
	public void read() throws DatabaseException {
		// Instantiate A DataAction here
		// action= new Instance of IData
		action.read();

	}

	@Override
	public void atomicRead() throws DatabaseException {
		// Implement

	}

}
