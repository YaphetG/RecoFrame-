package Framework.DataAccess;



public class PrepStatementDirector {
	private BuildPrepStatement buildprepStatement;

	public PrepStatementDirector(BuildPrepStatement buildprepStatement) {
		this.buildprepStatement = buildprepStatement;
	}

	public void ConstructPrepStatement(DbClass db) {
		
		buildprepStatement.buildquery(db);
		buildprepStatement.buildParameters(db);
		buildprepStatement.buildparamTypes(db);
	}

	public Object getPrepStatement() {
		return buildprepStatement.getPreparedStatement();

	}
}
