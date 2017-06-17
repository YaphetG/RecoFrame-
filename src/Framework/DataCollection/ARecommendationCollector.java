package Framework.DataCollection;

import DataAccessImplementations.DataAccessSubsystemImpl;
import Exceptions.DatabaseException;
import Framework.DataAccess.DataAccessSubsystemFacade;

public abstract class ARecommendationCollector implements RecommendationCollector {

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

}
