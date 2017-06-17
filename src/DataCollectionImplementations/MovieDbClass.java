package DataCollectionImplementations;

import java.sql.ResultSet;
import java.sql.SQLException;

import Exceptions.DatabaseException;
import Framework.DataAccess.DbClass;
import Framework.DataCollection.AItem;
import Framework.Engine.ModelCollection;
import Framework.Util.QueryType;

public class MovieDbClass implements DbClass {

	
	
	ConcreteModelFactory f;
	QueryType queryType;
	 String readQuery = "SELECT * FROM `movies` ";
	String insertQuery = "INSERT INTO `movies` (`ID`, `Name`, `Genre`, `Year`) VALUES (?, ?, ?, ?);";
	String updateQuery = "";
	String deleteQuery = "?";
	Object[] readParams = null;
	int[] readParamTypes = null;
	Object[] insertParams = null;
	int[] insertParamTypes = null;
	Object[] updateParams = null;
	int[] updateParamTypes = null;
	Object[] deleteParams = null;
	int[] deleteParamTypes = null;
	ModelCollection Movies;
	@SuppressWarnings("unused")
	private static final String DB_Movies = "jdbc:mysql://localhost:3306/online_movie_store";

	@Override
	public ModelCollection getModelCollection() {
	return Movies;
	}

	
	@Override
	public void populateEntity(ResultSet rs) {
		Movies = new ModelCollection();
		
			String id = null;
			String name = null;
			String genre = null;
			String year = null;
			try {
				while(rs.next()) {
				
						id = rs.getString("id").trim();
					System.err.println(id+"***************");
					
						name = rs.getString("Name").trim();
					
					genre = rs.getString("Genre").trim();
					year = rs.getString("Year").trim();
					ConcreteModelFactory f= new ConcreteModelFactory();
					AItem movieItem= f.getItemInstance();
					movieItem.setGenre(genre);
					movieItem.SetId(id); 
					Movies.add(movieItem);
					}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
				
			
			
		
		
	}

	@Override
	public String getDbUrl(QueryType queryType) {
		return DB_Movies;
	}

	@Override
	public String getQuery(QueryType queryType) {
		System.out.println(queryType==null ?"Nulll":"Not null");
		
		
		switch(queryType) {
			case READ :
				return readQuery;
			case INSERT :
				return insertQuery;
			case UPDATE :
				return updateQuery;
			case DELETE :
				return deleteQuery;
			default :
				return null;
					
		}
	}

	@Override
	public Object[] getQueryParams(QueryType queryType) {
		switch(queryType) {
			case READ :
				return readParams;
			case INSERT :
				return insertParams;
			case UPDATE :
				return updateParams;
			case DELETE :
				return deleteParams;
			default :
				return null;
				
		}
	}

	@Override
	public int[] getParamTypes(QueryType queryType) {
		switch(queryType) {
		case READ :
			return readParamTypes;
		case INSERT :
			return insertParamTypes;
		case UPDATE :
			return updateParamTypes;
		case DELETE :
			return deleteParamTypes;
		default :
			return null;
			
	}
}


}
