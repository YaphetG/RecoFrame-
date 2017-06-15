package DataAccess;

/// To be finished, The DbAction uses Builder to 

public interface BuildPrepStatement {
	public void buildquery();
	public PreparedStmt getPreparedStatement();
	public  void buildParameters();
	public void  buildparamTypes();

}
