package DataAccessImpl;

import java.sql.*;
enum ConnectionPool {
	INSTANCE;
	

	private ConnectionPool() {
	}
	
	
	public enum DB {
		ONLINE_MOVIES,RECOMKNOWLEDGE;
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
	
	
	public static void main(String[] args) throws SQLException {
		
	
	String URL = "jdbc:mysql://localhost:3306/online_movie_store";
	String User= "root";
	String password = "";
	
	
	//Class.forName(com.mysql.jdbc.Driver).newInstance();
	Connection conn = DriverManager.getConnection(URL, User, password);
	
	
	
	PreparedStatement prepState= conn.prepareStatement("SELECT * FROM `movies` WHERE Genre = ?");
	prepState.setString(1, "comedy");
	ResultSet res = prepState.executeQuery();
	
	while(res.next())
		System.out.println(res.getString("name"));
	
	
	res.close();
	prepState.close();
	conn.close(); 
	
	}
	//Implement Connection Creation from Sql
}

