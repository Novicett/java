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
		
		String sql="INSERT INTO MOVIE VALUES(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, bag.getId());
		ps.setString(2, bag.getTitle());
		ps.setString(3, bag.getContent());
		ps.setString(4, bag.getActor());
		int result= ps.executeUpdate();
	
	}
	
}
