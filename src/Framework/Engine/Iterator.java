package Framework.Engine;

import Framework.DataCollection.IModel;



public class Iterator implements ModelIterator {
	private ModelCollection collection;
	private int index=0;
	public Iterator(ModelCollection collection){
		this.collection = collection;
	}
	@Override
	public boolean hasNext() {
		if(collection.getCollection().size()-1<= index+1){
			return false;
		}
		return true;
	}

	@Override
	public IModel next() {
		if(hasNext()){
			return (IModel) this.collection.getCollection().get(++index);			
		}
		return null;
	}

	@Override
	public IModel peek() {
		if(hasNext()){
			return this.collection.getCollection().get(index+1);			
		}
		return null;
	}

	@Override
	public IModel current() {
		if(index <collection.getCollection().size())
			return collection.getCollection().get(index);
		return null;
	}

}
