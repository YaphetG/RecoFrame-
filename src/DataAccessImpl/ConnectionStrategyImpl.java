package DataAccessImpl;

import DataAccess.Connection;
import DataAccess.ConnectionStrategy;

public class ConnectionStrategyImpl implements ConnectionStrategy {

	@Override
	public Connection CreateConnection(String URL) {
		
		return ConnectionPool.INSTANCE;
		
		// TODO Auto-generated method stub
		
	}

}
