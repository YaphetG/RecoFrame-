package Framework.DataAccess;

import java.sql.SQLException;

import Exceptions.DatabaseException;
import Framework.DataCollection.RecomEngineProduct;
import Framework.Engine.ModelCollection;

public interface DataAccessSubsystemFacade {


	public void establishConnection() throws DatabaseException, SQLException;

	public void releaseConnection() throws DatabaseException;

	public ModelCollection read() throws DatabaseException;
	public void write(RecomEngineProduct recommendation) throws DatabaseException;

	public ModelCollection atomicRead() throws DatabaseException;

	


}
