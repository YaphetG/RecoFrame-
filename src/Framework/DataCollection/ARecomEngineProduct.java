package Framework.DataCollection;

public  class ARecomEngineProduct  implements RecomEngineProduct{
	String id1;
	String id2;
	
	public ARecomEngineProduct(){
		
	}
	public ARecomEngineProduct(String id1, String id2) {
		super();
		this.id1 = id1;
		this.id2 = id2;
	}
	public String getId1() {
		return id1;
	}
	public String getId2() {
		return id2;
	}
	@Override
	public String toString() {
		return "ARecomEngineProduct [id1=" + id1 + ", id2=" + id2 + "]";
	}
	

	
}
