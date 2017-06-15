package DataCollectionImpl;

import DataCollectionFrameWork.AItem;
import DataCollectionFrameWork.AUser;
import DataCollectionFrameWork.ModelFactory;

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
