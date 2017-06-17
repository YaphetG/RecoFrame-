package DataAccessImplementations;

import java.sql.Connection;
import java.sql.SQLException;

import DataAccessImplementations.ConnectionPool.DB;
import Framework.DataAccess.ConnectionStrategy;

public class KnowlegdeDbConnectionStrategyImpl implements ConnectionStrategy{

	@Override
	public Connection CreateConnection() throws SQLException {
		// TODO Auto-generated method stub
		return ConnectionPool.INSTANCE.getConnection(DB.RECOMKNOWLEDGE);
	}

}
