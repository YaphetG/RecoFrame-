package DataAccess;

public interface DataAccessSubsystem {

	public void establishConnection(DbClass dbClass) throws DatabaseException;

	public void releaseConnection() throws DatabaseException;

	public void read() throws DatabaseException;

	public void atomicRead(DbClass dbClass) throws DatabaseException;

}
