package busResv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	
	private static final String url="jdbc:oracle:thin:@localhost:1521:xe";
	private static final String userName="system";
	private static final String passWord="tiger";
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url, userName, passWord);
		
	}

}