package DataAccessImplementations;

import java.sql.Connection;
import java.sql.SQLException;

import DataAccessImplementations.ConnectionPool.DB;
import Framework.DataAccess.ConnectionStrategy;

public class ConnectionStrategyImpl implements ConnectionStrategy {
	
	

	@SuppressWarnings("static-access")
	@Override
	public Connection CreateConnection() throws SQLException {
		
		return ConnectionPool.INSTANCE.getConnection(DB.ONLINE_MOVIES);
		
		// TODO Auto-generated method stub
		
	}

}
