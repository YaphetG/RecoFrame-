package EngineFramework;

public abstract class AUser implements IModel {

	protected long id;
	//To-do Add generic feilds 
	@Override
	public abstract IModel CreateModel();

}
