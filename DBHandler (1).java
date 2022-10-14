package CaseStudy1prac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHandler {
	public static Connection establishConnection() {
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = null;
		try {
			conn =DriverManager.getConnection(url,"sys","123");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
