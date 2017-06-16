package DataCollectionImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import DataAccess.DataAccessSubsystemFacade;
import DataAccess.DatabaseException;
import DataAccess.DbClass;
import DataCollectionFrameWork.IModel;

public class MovieDbClass implements DbClass {

	enum QueryType {READ, INSERT, UPDATE, DELETE};
	QueryType queryType;
	List<Movie> Movies = new ArrayList<>(); 
	String readQuery = "SELECT * FROM `movies` WHERE Genre = ?";
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
	@SuppressWarnings("unused")
	private static final String DB_Movies = "jdbc:mysql://localhost:3306/online_movie_store";

	@Override
	public List<IModel> getModelCollection() {
		/*queryType = QueryType.READ;
		readParams = new Object[]{Genre};
		readParamTypes = new int[]{Types.VARCHAR};
		DataAccessSubsystemFacade dss = new DataAccessSubsystemFacade();
	//	dss.establishConnection(this);
		dss.read();
		dss.releaseConnection();*/
		return null;
	}

	@Override
	public void populateEntity(ResultSet rs) throws DatabaseException {
		Movies = new ArrayList<>();
		try {
			String id = null;
			String name = null;
			String genre = null;
			String year = null;
			while(rs.next()) {
				id = rs.getString("id").trim();
				name = rs.getString("name").trim();
				genre = rs.getString("genre").trim();
				year = rs.getString("year").trim();
				
				Movies.add(new Movie(id, name, genre, year));// factory 
				
			}
		} catch(SQLException e) {
			throw new DatabaseException(e);
		}
		
	}

	@Override
	public String getDbUrl() {
		return DB_Movies;
	}

	@Override
	public String getQuery() {
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
	public Object[] getQueryParams() {
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
	public int[] getParamTypes() {
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

/*	@Override
	public void populateEntity(ResultSet resultSet) throws DatabaseException {
		// TODO Auto-generated method stub
		
	}*/

}
