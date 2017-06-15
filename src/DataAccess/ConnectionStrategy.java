package DataAccess;

public interface ConnectionStrategy {
	public Connection CreateConnection( String URL);

}
