package Framework.Engine;
public enum Analytics {
	INSTANCE;
	
	private ModelCollection productCollection;
	private ModelCollection userCollection;
	
	public void setProductCollection(ModelCollection productCollection){
		this.productCollection= productCollection;
	}
	public void SetUserCollection(ModelCollection userCollection){
		this.userCollection = userCollection;
	}
	public void runProductCollection(ARecommenderAlgorithm reco){
		reco.runOnDataSet(productCollection);
	}
}
