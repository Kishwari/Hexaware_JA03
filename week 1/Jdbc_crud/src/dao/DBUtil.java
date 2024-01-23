package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class DBUtil {     // factory class
	
	public static Connection getDBConnection() { // factory method
		Connection conn=null;
		try {
			// step 1
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step 2
			 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hexaware_db", "root", "iluvufnf5");


		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
