package DataCollectionImpl;

import DataCollectionFrameWork.AUser;
import DataCollectionFrameWork.IModel;

public class Customer extends AUser {
	
	 Customer(){
		super();
	}
	
	@Override
	public String getId() {
		return this.id;
	}
	@Override
	public void SetId(String s) {
		this.id = s;
		
	}

}
