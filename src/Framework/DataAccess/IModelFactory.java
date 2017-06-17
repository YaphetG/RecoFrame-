package Framework.DataAccess;

import java.util.function.Supplier;

import Framework.DataCollection.IModel;

public enum IModelFactory {
	INSTANCE;
	
	private Supplier<IModel> userSupplier;
	private Supplier<IModel> itemSupplier;
	
	public IModel createItemInstance(){
		return itemSupplier.get();
	}
	
	public IModel createUserInstance(){
		return userSupplier.get();
	}
	
	public void setUserSupplier(Supplier u){
		userSupplier = u;
	}
	public void setItemSupplier(Supplier i){
		itemSupplier = i;
	}
}
