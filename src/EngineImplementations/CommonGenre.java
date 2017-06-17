package EngineImplementations;

import java.io.FileWriter;
import java.io.IOException;

import Framework.Engine.IAlgorithm;
import Framework.Engine.Iterator;
import Framework.Engine.ModelCollection;



public class CommonGenre implements IAlgorithm {
	public void operate(ModelCollection movies){
		
		Iterator i1 = (Iterator) movies.CreateIterator();
		
		while(i1.hasNext()){
			Iterator i2 = (Iterator) movies.CreateIterator();
			Movie current = (Movie) i1.next();
			while(i2.hasNext()){
				Movie against = (Movie)i2.next();
				if(current.getGenre().equals(against.getGenre())&&current.getId()!=against.getId())
					save(new MovieToMovie(current.getId(),against.getId()));
			}
			
		}
	}
	
	public void save(MovieToMovie m){
		FileWriter f=null;
		try{
		f = new FileWriter("Assoc.file",true);
		f.write(m.toString()+"\n\r");
		
		}
		catch(IOException x){
			
		}
		finally{
			if(f!=null)
				try {
					f.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}
	
	class MovieToMovie{
		public String id1;
		public String id2;
		public String toString(){
			return id1+","+id2+"\n\r\t";
		}
		public MovieToMovie(String m1,String m2){
			id1 = m1;
			id2 = m2;
		}
	}
}
