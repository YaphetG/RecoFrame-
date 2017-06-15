package DataAccess;

//import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Logger;

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
		prepStatement= new ConcreteBuilder();
		prepStatement.getPreparedStatement();
	}
		// TODO Auto-generated method stub

	@Override
	public void write() {
		// TODO Auto-generated method stub
		
	}
		
	}
