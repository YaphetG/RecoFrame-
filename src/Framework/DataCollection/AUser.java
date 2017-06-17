package Framework.DataCollection;

public  class AUser implements IModel {
	@Override
	public String toString() {
		return "AUser [name=" + name + ", id=" + id + "]";
	}

	String name;
	String id;
	
	public AUser(String name, String id){
		 this.name= name;
		 this.id=id;
		 
	
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void SetId(String s) {
		// TODO Auto-generated method stub
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
}
