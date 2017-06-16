package DataAccess;

import java.sql.SQLException;

import DataCollectionFrameWork.RecomEngineProduct;

public interface DataAccessSubsystem {


	public void establishConnection(String URL) throws DatabaseException, SQLException;

	public void releaseConnection() throws DatabaseException;

	public void read() throws DatabaseException;
	public void write(RecomEngineProduct recommendation) throws DatabaseException;

	public void atomicRead() throws DatabaseException;

	


}
