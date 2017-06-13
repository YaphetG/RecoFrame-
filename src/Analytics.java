
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
	public void runOnProduct(ARecommenderAlgorithm recommender){
		//pass product data
	}
	public void runOnUser(ARecommenderAlgorithm recommender){
		//pass user data
	}
	public void runAsCorelation(ARecommenderAlgorithm recommender){
		//pass both user and product data
	}
}
