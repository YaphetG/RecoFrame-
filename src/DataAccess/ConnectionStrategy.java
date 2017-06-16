package DataAccess;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionStrategy {
	public Connection CreateConnection( String URL) throws SQLException;

}
