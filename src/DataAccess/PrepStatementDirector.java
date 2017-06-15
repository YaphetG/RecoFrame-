package DataAccess;

public class PrepStatementDirector {
	private BuildPrepStatement buildprepStatement;
	public PrepStatementDirector (BuildPrepStatement buildprepStatement){
		this.buildprepStatement=buildprepStatement;
	}
	public void ConstructPrepStatement(){
		buildprepStatement.buildquery();
		buildprepStatement.buildParameters();
		buildprepStatement.buildparamTypes();
	}
public PreparedStmt getPrepStatement(){
	return buildprepStatement.getPreparedStatement();
	
}
}
