package DataCollectionFrameWork;

public abstract class ARecomEngineProduct  implements RecomEngineProduct{
	String id1;
	String id2;
	
	public ARecomEngineProduct(){
		
	}
	public ARecomEngineProduct(String id1, String id2) {
		super();
		this.id1 = id1;
		this.id2 = id2;
	}
	@Override
	public String toString() {
		return "ARecomEngineProduct [id1=" + id1 + ", id2=" + id2 + "]";
	}
	

	
}
