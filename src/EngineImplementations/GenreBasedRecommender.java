package EngineImplementations;

import Framework.Engine.ARecommenderAlgorithm;

public class GenreBasedRecommender extends ARecommenderAlgorithm {
	public GenreBasedRecommender(){
		this.algorithm = new CommonGenre();		
	}
	
}
