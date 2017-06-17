package DataCollectionImplementations;

import Framework.DataCollection.AItem;
import Framework.DataCollection.AUser;
import Framework.DataCollection.ModelFactory;

public class ConcreteModelFactory implements ModelFactory{

	
	@Override
	public AItem getItemInstance() {
		// TODO Auto-generated method stub
		return new Movie();
	}

	@Override
	public AUser getUserInstance() {
		// TODO Auto-generated method stub
		return new Customer();
	}
	

}
