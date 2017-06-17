package Framework.DataCollection;

public abstract class AUser implements IModel {
	protected String id;
	@Override
	public  IModel clone(){
		try{
			return (AUser)super.clone();
		}catch(CloneNotSupportedException e){
			// TODO implement logger or something for errors
		}
		return null;
		
	}

	
	
}
