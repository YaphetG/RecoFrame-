package Framework.Engine;

import Framework.DataCollection.IModel;

public interface ModelIterator {
	public boolean hasNext();
	public IModel next();
	public IModel peek();
	public IModel current();
	
	

}
