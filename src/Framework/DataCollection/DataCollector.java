package Framework.DataCollection;

import java.util.List;

import Exceptions.DatabaseException;
import Framework.Engine.ModelCollection;

public interface DataCollector {
	public ModelCollection getModelCollection() throws DatabaseException;
		
	

}
