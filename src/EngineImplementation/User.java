package EngineImplementation;

import EngineFramework.AUser;
import EngineFramework.IModel;

public class User extends AUser {
	private int id;
	private User(){
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public IModel CreateModel() {
		// TODO Auto-generated method stub
		return new User();
	}

}
