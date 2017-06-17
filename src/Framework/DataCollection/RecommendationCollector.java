package Framework.DataCollection;

import Framework.Engine.ModelCollection;

/*  This is the interface for fetching saved Recommendation association between products 
  */

public interface RecommendationCollector {
 
	public void save( ARecomEngineProduct recommendation);
	public ModelCollection read(IModel model);
	
	
}
