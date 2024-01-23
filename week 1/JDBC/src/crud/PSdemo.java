package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PSdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn = DBUtil.getDBConnection();

		/*
		 * INSERT String insert = "insert into dept values(?,?,?)";// ? positional
		 * parameters try { PreparedStatement pstmt = conn.prepareStatement(insert);
		 * pstmt.setInt(1, 80); pstmt.setString(2, "Logistics"); pstmt.setString(3,
		 * "Noida"); int count = pstmt.executeUpdate(); System.out.println(count);
		 * 
		 * } catch (SQLException e) { e.printStackTrace(); }
		 */

		/*
		 * UPDATE
		 * 
		 * String update="update dept set dname=?,location=?where dno=?"; try {
		 * PreparedStatement pstmt = conn.prepareStatement(update); pstmt.setString(1,
		 * "Tours&Travel"); pstmt.setString(2, "Greater Noida"); pstmt.setInt(3, 80);
		 * int count = pstmt.executeUpdate();
		 * System.out.println("record updated is "+count);
		 * 
		 * } catch (SQLException e) { e.printStackTrace(); }
		 */

		/*
		 * SELECT by dno String
		 * selectById="select dno,dname,location from dept where dno=?"; try {
		 * PreparedStatement pstmt = conn.prepareStatement(selectById);
		 * 
		 * pstmt.setInt(1, 10); ResultSet rs=pstmt.executeQuery(); while(rs.next()) {
		 * System.out.println(rs.getInt("dno")+" "+rs.getString("dname")+" "+rs.
		 * getString("location")); } } catch (SQLException e) { e.printStackTrace(); }
		 */
		
		/*
		 * SELECT ALL String selectAll = "select dno,dname,location from dept";
		 * 
		 * try { PreparedStatement pstmt = conn.prepareStatement(selectAll);
		 * 
		 * // pstmt.setInt(1, 50);
		 * 
		 * ResultSet rs = pstmt.executeQuery();
		 * 
		 * while (rs.next()) {
		 * 
		 * System.out.println(rs.getInt("dno") + " " + rs.getString("dname") + "  " +
		 * rs.getString("location")); }
		 * 
		 * } catch (SQLException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
		
		
		 // DELETE
		  
		  String delete="delete from dept where dno=?"; 
		  try {
		  PreparedStatement pstmt = conn.prepareStatement(delete);
		   pstmt.setInt(1, 80);
		  int count = pstmt.executeUpdate();
		  System.out.println("record deleted is "+count);
		  
		  } catch (SQLException e) { e.printStackTrace(); }
		 
	}

}
