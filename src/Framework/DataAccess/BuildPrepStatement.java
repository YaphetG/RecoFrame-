package Framework.DataAccess;


/// To be finished, The DbAction uses Builder to construct the prepared Statement and concrete Builder are 
//Implemented by the clients as per reference, then the DbAction class reads from DataBase as per the database type 
//specified by the client developers. Points to check, how the prepared Statement is used for executing query for SQL.Maybe
//Something else to Generalize might come out of it. 



public interface BuildPrepStatement {
	public void buildquery(DbClass db);
	public Object getPreparedStatement();
	public  void buildParameters(DbClass db);
	public void  buildparamTypes(DbClass db);

}
