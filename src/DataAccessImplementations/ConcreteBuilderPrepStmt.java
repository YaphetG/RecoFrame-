package DataAccessImplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

import DataAccessImplementations.ConnectionPool.DB;
import Framework.DataAccess.BuildPrepStatement;
import Framework.DataAccess.DbClass;
import Framework.Util.QueryType;

public class ConcreteBuilderPrepStmt implements BuildPrepStatement {
	String query;
	int[] paramTypes;
	Object[] parameters;
	QueryType queryType;
	protected PreparedStatement stmt;
	Connection conn;
	
	
	
	

	@Override
	public void buildquery(DbClass db) {
		queryType= QueryType.READ;
		query = db.getQuery(queryType);

	}

	@Override
	public Object getPreparedStatement() {
		// TODO Auto-generated method stub
		PreparedStatement stmt = null;
	
			
			try {
				setValues(stmt, parameters, paramTypes);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return stmt;
		
	}

	private static void setValues(PreparedStatement stmt, Object[] params, int[] paramTypes) throws SQLException {
		int count = 0;
		for (int i = 0; i < paramTypes.length; ++i) {
			++count;
			int type = paramTypes[i];
			switch (type) {
			case Types.BIGINT:
				stmt.setInt(count, (Integer) params[i]);
				break;
			case Types.BOOLEAN:
				stmt.setBoolean(count, (Boolean) params[i]);
				break;
			case Types.DATE:
				stmt.setDate(count, (java.sql.Date) params[i]);
				break;
			case Types.DOUBLE:
				stmt.setDouble(count, (Double) params[i]);
				break;
			case Types.FLOAT:
				stmt.setDouble(count, (Float) params[i]);
				break;
			case Types.INTEGER:
				stmt.setInt(count, (Integer) params[i]);
				break;
			case Types.NULL:
				stmt.setNull(count, 0);
				break;
			case Types.VARCHAR:
				stmt.setString(count, (String) params[i]);
				break;
			default:
				stmt.setObject(count, params[i]);
			}

		}
	}

	@Override
	public void buildParameters(DbClass db) {
		// TODO Auto-generated method stub
		parameters = db.getQueryParams(queryType);

	}

	@Override
	public void buildparamTypes(DbClass db) {
		// TODO Auto-generated method stub
		paramTypes = db.getParamTypes(queryType);
	}

}
