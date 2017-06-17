package DataAccessImplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Exceptions.DatabaseException;
import Framework.DataAccess.ConnectionContext;
import Framework.DataAccess.ConnectionStrategy;
import Framework.DataAccess.DbClass;
import Framework.DataAccess.IDataAction;
import Framework.DataAccess.PrepStatementDirector;
import Framework.DataCollection.RecomEngineProduct;
import Framework.Engine.ModelCollection;
import Framework.Util.QueryType;

public class DataAction implements IDataAction {

	/*private static final Logger LOG = Logger.getLogger(DataAction.class.getName());
	protected String query;
	protected PreparedStatement stmt;
	protected Object[] params;
	protected int[] paramTypes;*/
	QueryType querytype;
	ConnectionStrategy strategy;
	Connection con;
	ModelCollection collection;
	
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
	public ModelCollection read() {
		String query;
		querytype=QueryType.READ;
		try {
			ConnectionContext connect = new ConnectionContext();
			strategy = new ConnectionStrategyImpl();
			connect.setStrategy(strategy);
			con=connect.createConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		query = concreteDbClass.getQuery(querytype);
	System.out.println(query);
		
		/*stmtBuilder = new ConcreteBuilderPrepStmt();
		prepStatement = new PrepStatementDirector(stmtBuilder);
		
		prepStatement.ConstructPrepStatement(concreteDbClass);
		
		query =  (String) prepStatement.getPrepStatement();*/
	
			try {
				stmt = con.prepareStatement(query);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
			
			;
			
			
			try {
				ResultSet rs = stmt.executeQuery(query);
				
				concreteDbClass.populateEntity(rs);
					} 
			catch (DatabaseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
				
			collection=	concreteDbClass.getModelCollection();
			return collection;
			
			
			
			
			
		
		
		//ModelFactory f = new ItemFactory();
		//IModel model = f.getModel();
		
		
		
		
	}
	// TODO Auto-generated method stub

	@Override
	public void write(RecomEngineProduct recommendation) {
		String query;
		String firstid = recommendation.getId1();
		String secondid= recommendation.getId2();
		try {
			ConnectionContext connect = new ConnectionContext();
			strategy = new ConnectionStrategyRDB();
			connect.setStrategy(strategy);
			con = connect.createConnection();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		querytype= QueryType.INSERT;
		
		query= concreteDbClass.getQuery(querytype);
		try {
			stmt = con.prepareStatement(query);
			stmt.setString(1, firstid);
			stmt.setString(2,secondid);
			stmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			
		// TODO Auto-generated method stub

	}

}
