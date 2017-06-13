import java.util.ArrayList;
import java.util.List;


public class ModelCollection {
	private List<IModel> collection;
	
	public ModelCollection(){
		collection = new ArrayList<>();
	}
	
	public ModelIterator CreateIterator(){
		return new Iterator(this);
	}
	public List<IModel> getCollection(){
		return this.collection;
	}
	

}
