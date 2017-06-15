package DataCollectionFrameWork;

/*  This is the interface for fetching saved Recommendation association between products 
  */

public interface RecommendationCollector {
 
	public void save( ARecomEngineProduct recommendation);
	public void read(IModel model);
	
	
}
