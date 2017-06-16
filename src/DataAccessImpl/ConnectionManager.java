package DataAccessImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConnectionManager   {
	
	public enum DB {
		ONLINE_MOVIES, RECOMKNOWLEDGE;
	}
	
	private static final String DB_URL_ONLINEMOVIES
		= "jdbc:mysql://localhost:3306/online_movie_store";
	private static final String DB_URL_RECOMKNOWLEDGE
		= "jdbc:mysql://localhost:3306/RECOMMENDATION_KNOWLEDGE";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";
	
	public static Connection getConnection(DB db) throws SQLException {	
		Connection conn = null;
		switch(db) {
			case ONLINE_MOVIES:
				conn = DriverManager.getConnection(DB_URL_ONLINEMOVIES, USERNAME,
						PASSWORD);
				break;
			case RECOMKNOWLEDGE:
				conn = DriverManager.getConnection(DB_URL_RECOMKNOWLEDGE, USERNAME,
						PASSWORD);
				break;
			default:
				//do nothing
		}
		
		System.out.println("Got connection...");
		return conn;
	}

}
