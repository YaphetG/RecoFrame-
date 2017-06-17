package Framework.DataAccess;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionStrategy {
	public Connection CreateConnection() throws SQLException;

}
