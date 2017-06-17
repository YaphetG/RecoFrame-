package Framework.Engine;
import java.util.ArrayList;
import java.util.List;
import Framework.DataCollection.IModel;


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
	public boolean add(IModel model){
		return collection.add(model);
		
	}
	public boolean remove(int index){
		return collection.remove(index) != null;
	}
	

}
