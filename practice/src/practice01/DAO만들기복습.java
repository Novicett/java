package practice01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DAO만들기복습 {	
	public void insert(DVO만들기복습 bag) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver"); // 드라이버 연동
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user ="study";
		String password = "1234";
		Connection con = DriverManager.getConnection(url,user,password);
		//db연결 성공
		
		String sql="UPDATE MOVIE SET CONTENT=? WHERE ID=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(2, bag.getId());
		ps.setString(1, bag.getContent());
		int result= ps.executeUpdate();
	
	}
	
}
