package DataAccess;

public interface DataAccessSubsystem {

	public void establishConnection(String URL) throws DatabaseException;

	public void releaseConnection() throws DatabaseException;

	public void read() throws DatabaseException;

	public void atomicRead() throws DatabaseException;

}
