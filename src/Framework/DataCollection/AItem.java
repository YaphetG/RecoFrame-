package Framework.DataCollection;

public class AItem implements IModel {
	
	@Override
	public String toString() {
		return "AItem [genre=" + genre + ", id=" + id + "]";
	}




	protected String genre;
	protected String id;
	
	
	public AItem(String id, String genre) {
		this.id = id;
		this.genre = genre;
		
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




	public String getGenre() {
		return genre;
	}




	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	

}
