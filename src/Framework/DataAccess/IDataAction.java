package Framework.DataAccess;



import Framework.DataCollection.RecomEngineProduct;
import Framework.Engine.ModelCollection;

public interface IDataAction {
	
	public ModelCollection read();
	void write(RecomEngineProduct recommendation);

}
