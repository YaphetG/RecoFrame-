package DataAccessImpl;

//import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import DataAccess.DatabaseException;
import DataAccess.DbClass;
import DataAccess.IDataAction;
import DataAccess.PrepStatementDirector;
import DataCollectionFrameWork.IModel;

public class DataAction implements IDataAction {

	/*private static final Logger LOG = Logger.getLogger(DataAction.class.getName());
	protected String query;
	protected PreparedStatement stmt;
	protected Object[] params;
	protected int[] paramTypes;*/
	
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
		prepStatement = new PrepStatementDirector(stmtBuilder);
		prepStatement.ConstructPrepStatement(concreteDbClass);
		stmt = (PreparedStatement) prepStatement.getPrepStatement();
		try {
			ResultSet rs = stmt.executeQuery();
			  try {
				concreteDbClass.populateEntity(rs);
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
		// TODO Auto-generated method stub

	}

}
