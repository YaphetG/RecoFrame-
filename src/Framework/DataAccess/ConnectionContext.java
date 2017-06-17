package Framework.DataAccess;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionContext {
	private ConnectionStrategy strategy;


	public void setStrategy(ConnectionStrategy strategy) {
		this.strategy = strategy;
	}

	public Connection createConnection() throws SQLException {
		return strategy.CreateConnection();

	}

}