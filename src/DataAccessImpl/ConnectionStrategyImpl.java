package DataAccessImpl;

import java.sql.Connection;
import java.sql.SQLException;

import DataAccess.ConnectionStrategy;
import DataAccessImpl.ConnectionPool.DB;

public class ConnectionStrategyImpl implements ConnectionStrategy {
	
	

	@SuppressWarnings("static-access")
	@Override
	public Connection CreateConnection(String URL) throws SQLException {
		
		return ConnectionPool.INSTANCE.getConnection(DB.ONLINE_MOVIES);
		
		// TODO Auto-generated method stub
		
	}

}
