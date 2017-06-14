package EngineFramework;

public abstract class AItem implements IModel {

	
	protected String id;
	@Override
	public IModel clone(){
		try{
			return (AItem)super.clone();
		}catch(CloneNotSupportedException e){
			// TODO Implement logger or something here
		}
		return null;
	}

}
