package Framework.Engine;

public abstract class ARecommenderAlgorithm {
	//define interface methods
	
	protected IAlgorithm algorithm;
	public final void runOnDataSet(ModelCollection collection){
		algorithm.operate(collection);
	}
}
