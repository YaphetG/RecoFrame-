package DataCollectionImplementations;

import Framework.DataCollection.AUser;

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
