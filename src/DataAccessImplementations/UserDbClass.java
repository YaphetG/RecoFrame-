package DataAccessImplementations;

import java.sql.ResultSet;

import Exceptions.DatabaseException;
import Framework.DataAccess.DbClass;
import Framework.Engine.ModelCollection;
import Framework.Util.QueryType;

public class UserDbClass implements DbClass {

	@Override
	public void populateEntity(ResultSet resultSet) throws DatabaseException {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public ModelCollection getModelCollection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDbUrl(QueryType queryType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getQuery(QueryType queryType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] getQueryParams(QueryType queryType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[] getParamTypes(QueryType queryType) {
		// TODO Auto-generated method stub
		return null;
	}

}
