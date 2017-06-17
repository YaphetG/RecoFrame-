package EngineImplementations;

import Framework.DataCollection.AUser;

public class Customer extends AUser {
	String name;
	String id;
	String account;
	
	 Customer(String name, String id, String account){
		super(name, id);
		this.account= account;
	 }
	
	@Override
	public String getId() {
		return this.id;
	}
	@Override
	public void SetId(String s) {
		this.id = s;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

}
