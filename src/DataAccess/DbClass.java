package DataAccess;

import java.sql.ResultSet;
import java.util.List;

import DataCollectionFrameWork.IModel;
import DataCollectionImpl.Movie;

public interface DbClass {
	public List<IModel> getModelCollection();
	 public void populateEntity(ResultSet resultSet) throws DatabaseException ;
	    public String getDbUrl();
	    public String getQuery();
	    public Object[] getQueryParams();
	    public int[] getParamTypes();

}
