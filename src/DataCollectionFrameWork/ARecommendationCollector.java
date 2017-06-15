package DataCollectionFrameWork;

import DataAccess.DataAccessSubsystem;
import DataAccess.DataAccessSubsystemFacade;
import DataAccess.DatabaseException;

public abstract class ARecommendationCollector implements RecommendationCollector {

	@Override
	public void save(ARecomEngineProduct recommendation) {
		DataAccessSubsystem dataAccess = new DataAccessSubsystemFacade();
		try {
			dataAccess.write(recommendation);
		} catch (DatabaseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
