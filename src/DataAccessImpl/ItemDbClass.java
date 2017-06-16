package DataAccessImpl;

import java.sql.ResultSet;
import java.util.List;

import DataAccess.DatabaseException;
import DataAccess.DbClass;
import DataCollectionFrameWork.IModel;

public class ItemDbClass implements DbClass{

	@Override
	public void populateEntity(ResultSet resultSet) throws DatabaseException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getDbUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getQuery() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] getQueryParams() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[] getParamTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IModel> getModelCollection() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
