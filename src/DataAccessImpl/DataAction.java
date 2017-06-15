package DataAccessImpl;

//import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Logger;

import DataAccess.BuildPrepStatement;
import DataAccess.DatabaseException;
import DataAccess.DbClass;
import DataAccess.IDataAction;
import DataAccess.PrepStatementDirector;

public class DataAction implements IDataAction{
	
	
	
	
	private static final Logger LOG 
    = Logger.getLogger(DataAction.class.getName());
protected String query;
protected PreparedStatement stmt;
protected Object[] params;
protected int[] paramTypes;
protected DbClass concreteDbClass;
protected PrepStatementDirector director;
protected BuildPrepStatement prepStatement;
protected ConnectionPool pool =ConnectionPool.INSTANCE;
	DataAction() throws DatabaseException{
		
	}
	
	DataAction(DbClass c) throws DatabaseException {
        concreteDbClass = c;
       

}

	@Override
	public void read() {
		director= new PrepStatementDirector(prepStatement);
		director.ConstructPrepStatement();
		
		
	}
		// TODO Auto-generated method stub

	@Override
	public void write() {
		// TODO Auto-generated method stub
		
	}
		
	}
