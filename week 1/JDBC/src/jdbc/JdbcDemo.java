package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {
		Connection conn=null;
		
		try {
			// step 1
			Class.forName("com.mysql.cj.jdbc.Driver");

			// step 2
			 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hexaware_db", "root", "iluvufnf5");

			// step 3
			String insert = "insert into Employees(eid,ename,salary,job) values(110,'Martin',40000,'HR')";
			Statement stmt = conn.createStatement();
			int count = stmt.executeUpdate(insert);
			System.out.println(count + " records effected");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
