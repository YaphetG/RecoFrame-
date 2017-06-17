package Framework.DataAccess;

import java.sql.ResultSet;
import Framework.Engine.*;
import Framework.Util.QueryType;
import Exceptions.DatabaseException;

public interface DbClass {
	public ModelCollection getModelCollection();
	 public void populateEntity(ResultSet resultSet) throws DatabaseException ;
	    public String getDbUrl(QueryType queryType);
	    public String getQuery(QueryType queryType);
	    public Object[] getQueryParams(QueryType queryType);
	    public int[] getParamTypes(QueryType queryType);

}
