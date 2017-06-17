package DataCollectionImplementations;

import DataAccessImplementations.DataAccessSubsystemImpl;
import Exceptions.DatabaseException;
import Framework.DataAccess.DataAccessSubsystemFacade;
import Framework.DataCollection.ARecomEngineProduct;
import Framework.DataCollection.IModel;
import Framework.DataCollection.RecommendationCollector;
import Framework.Engine.ModelCollection;

public class MovieRecommendationCollector implements RecommendationCollector{

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
	public ModelCollection read(IModel model) {
		return null;
		// TODO Auto-generated method stub
		
	}

}
