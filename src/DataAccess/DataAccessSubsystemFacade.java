package DataAccess;

public class DataAccessSubsystemFacade implements DataAccessSubsystem{
	DataActionMediator action;
	
	
	public DataAccessSubsystemFacade() {
    	
    }

	@Override
	public void establishConnection(DbClass dbClass) throws DatabaseException {
		
			if(dbClass != null) {
				action = new DataAction(dbClass);
			}
			else {
				throw new DatabaseException("Cannot establish connection - DbClass is null");
			}
		}
		// TODO Auto-generated method stub
		
	

	@Override
	public void releaseConnection() throws DatabaseException {
		// TODO Auto-generated method stub
		
	}

		@Override
		public void read() throws DatabaseException {
			
			action= new DataAction();
			action.read();
			
		}

		@Override
		public void atomicRead(DbClass dbClass) throws DatabaseException {
			// TODO Auto-generated method stub
			
		}

}
