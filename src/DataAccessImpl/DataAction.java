package DataAccessImpl;

//import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Logger;

import DataAccess.BuildPrepStatement;
import DataAccess.DatabaseException;
import DataAccess.DbClass;
import DataAccess.IDataAction;

public class DataAction implements IDataAction{
	
	
	
	
	private static final Logger LOG 
    = Logger.getLogger(DataAction.class.getName());
protected String query;
protected PreparedStatement stmt;
protected Object[] params;
protected int[] paramTypes;
protected DbClass concreteDbClass;
protected BuildPrepStatement prepStatement;
protected ConnectionPool pool =ConnectionPool.INSTANCE;
	DataAction() throws DatabaseException{
		
	}
	
	DataAction(DbClass c) throws DatabaseException {
        concreteDbClass = c;
       

}

	@Override
	public void read() {
		prepStatement = new PrepStatementDirector();
		
	}
		// TODO Auto-generated method stub
		
	}
