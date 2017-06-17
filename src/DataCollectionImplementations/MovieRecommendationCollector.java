package DataCollectionImplementations;

import DataAccessImplementations.DataAccessSubsystemImpl;
import Exceptions.DatabaseException;
import Framework.DataAccess.DataAccessSubsystemFacade;
import Framework.DataCollection.ARecomEngineProduct;
import Framework.DataCollection.RecommendationCollector;
import Framework.Engine.ModelCollection;

public class MovieRecommendationCollector implements RecommendationCollector {

	@Override
	public void save(ARecomEngineProduct recommendation) {
		DataAccessSubsystemFacade dataAccess = new DataAccessSubsystemImpl();
		try {
			dataAccess.write(recommendation);
		} catch (DatabaseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public ModelCollection read(String id) {
		DataAccessSubsystemFacade dataAccess = new DataAccessSubsystemImpl();
		ModelCollection collection = new ModelCollection();
		try {
			dataAccess.atomicRead();
		} catch (DatabaseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return collection;
	}

}
