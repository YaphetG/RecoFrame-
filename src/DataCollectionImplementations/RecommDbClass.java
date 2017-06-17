package DataCollectionImplementations;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DataAccessImplementations.DataAction;
import Exceptions.DatabaseException;
import Framework.DataAccess.DbClass;
import Framework.Engine.ModelCollection;
import Framework.Util.QueryType;

public class RecommDbClass implements DbClass {

	QueryType queryType;
	ModelCollection recommendations;
	DataAction dataaction;
	List<String> idCollection = new ArrayList<String>();
	String readQuery = "SELECT * FROM `recomKnowledge` WHERE firstitem = ?";
	String insertQuery = "INSERT INTO `recomknowledge`(`firstItem`, `secondItem_first`) VALUES (?,?)";
	private static final String DB_Recomm = "jdbc:mysql://localhost:3306/recomrelationship";

	@Override
	public ModelCollection getModelCollection() {
		// TODO Auto-generated method stub
		for(String id: idCollection){
			
		
		}
		
		return null;
	}

	@Override
	public void populateEntity(ResultSet rs) throws DatabaseException {
		// TODO Auto-generated method stub
		recommendations = new ModelCollection();
		String secondid = null;

		try {
			while (rs.next()) {

				secondid = rs.getString("seconditem_first").trim();
				idCollection.add(secondid);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String getDbUrl(QueryType queryType) {
		// TODO Auto-generated method stub
		return DB_Recomm;
	}

	@Override
	public String getQuery(QueryType queryType) {
		System.out.println(queryType == null ? "Nulll" : "Not null");
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[] getParamTypes(QueryType queryType) {
		// TODO Auto-generated method stub
		return null;
	}

}
