package DataAccessImplementations;

//import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Exceptions.DatabaseException;
import Framework.DataAccess.DbClass;
import Framework.DataAccess.IDataAction;
import Framework.DataAccess.PrepStatementDirector;
import Framework.Util.QueryType;

public class DataAction implements IDataAction {

	/*private static final Logger LOG = Logger.getLogger(DataAction.class.getName());
	protected String query;
	protected PreparedStatement stmt;
	protected Object[] params;
	protected int[] paramTypes;*/
	QueryType querytype;
	
	protected DbClass concreteDbClass;
	protected PrepStatementDirector prepStatement;
	protected ConcreteBuilderPrepStmt stmtBuilder;
	protected PreparedStatement stmt;

	// protected ConnectionPool pool =ConnectionPool.INSTANCE;
	DataAction() throws DatabaseException {

	}

	DataAction(DbClass c) throws DatabaseException {
		concreteDbClass = c;

	}

	@Override
	public void read() {
		stmtBuilder = new ConcreteBuilderPrepStmt();
		prepStatement = new PrepStatementDirector(stmtBuilder);
		
		prepStatement.ConstructPrepStatement(concreteDbClass);
		
		stmt = (PreparedStatement) prepStatement.getPrepStatement();
		try {
			ResultSet rs = stmt.executeQuery();
			  try {
				concreteDbClass.populateEntity(rs);
				concreteDbClass.getModelCollection();
			} catch (DatabaseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//ModelFactory f = new ItemFactory();
		//IModel model = f.getModel();
		
		
		
		
	}
	// TODO Auto-generated method stub

	@Override
	public void write() {
		querytype= QueryType.INSERT;
		
		concreteDbClass.getQuery(querytype);
		// TODO Auto-generated method stub

	}

}
