package EngineImplementation;

import EngineFramework.AUser;
import EngineFramework.IModel;

public class User extends AUser {
	
	private User(){
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
