package DataAccessImpl;

import java.sql.PreparedStatement;

import DataAccess.BuildPrepStatement;
import DataAccess.PreparedStmt;

public class ConcreteBuilderPrepStmt implements BuildPrepStatement{
	protected PreparedStatement stmt;

	@Override
	public void buildquery() {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void buildParameters() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildparamTypes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PreparedStmt getPreparedStatement() {
		// TODO Auto-generated method stub
		return null;
	}

}
