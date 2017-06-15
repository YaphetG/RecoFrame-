package DataAccess;

public class ConnectionContext {
	private ConnectionStrategy strategy;
	private Connection connection;

	public void setStrategy(ConnectionStrategy strategy) {
		this.strategy = strategy;
	}

	public Connection createConnection(String URL) {
		return strategy.CreateConnection(URL);

	}

}
