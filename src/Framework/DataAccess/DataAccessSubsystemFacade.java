package Framework.DataAccess;

import java.sql.SQLException;

import Exceptions.DatabaseException;
import Framework.DataCollection.RecomEngineProduct;

public interface DataAccessSubsystemFacade {


	public void establishConnection() throws DatabaseException, SQLException;

	public void releaseConnection() throws DatabaseException;

	public void read() throws DatabaseException;
	public void write(RecomEngineProduct recommendation) throws DatabaseException;

	public void atomicRead() throws DatabaseException;

	


}
