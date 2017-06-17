package DataCollectionImplementations;

import java.sql.ResultSet;
import java.sql.SQLException;

import DataAccessImplementations.DataAction;
import EngineImplementations.Movie;
import Framework.DataAccess.DbClass;
import Framework.DataAccess.IModelFactory;
import Framework.Engine.ModelCollection;
import Framework.Util.QueryType;

public class MovieDbClass implements DbClass {

	ConcreteModelFactory f;
	QueryType queryType;
	String readsinglequery = "SELECT * FROM `movies` where id = ?";
	String readQuery = "SELECT * FROM `movies` ";
	String insertQuery = "INSERT INTO `movies` (`ID`, `Name`, `Genre`, `Year`) VALUES (?, ?, ?, ?);";
	

	ModelCollection Movies;
	DataAction dataaction;
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
			while (rs.next()) {
				id = rs.getString("id").trim();
				name = rs.getString("Name").trim();
				genre = rs.getString("Genre").trim();
				year = rs.getString("Year").trim();
				IModelFactory f = IModelFactory.INSTANCE;
				// f.setItemSupplier(()->new Movie());
				Movie movieItem = (Movie) f.createItemInstance();
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

		switch (queryType) {
		case READ:
			return readQuery;
		case INSERT:
			return insertQuery;

		default:
			return null;

		}
	}

	@Override
	public Object[] getQueryParams(QueryType queryType) {

		return null;

	}

	@Override
	public int[] getParamTypes(QueryType queryType) {
		return null;

	}
}
