package DataCollectionFrameWork;

import java.util.List;

public abstract class UserCollector implements DataCollector {
	public abstract List<IModel> getModelCollection();
}
