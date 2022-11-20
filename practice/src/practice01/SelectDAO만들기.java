package practice01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectDAO만들기 {

	public DVO만들기복습 one(int id) {
		DVO만들기복습 bag= null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user ="study";
			String password = "1234";
			
			Connection con = DriverManager.getConnection(url,user,password);
			
			String sql = "SELECT * FROM MOVIE WHERE ID=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				int id2 = rs.getInt(1);
				String title = rs.getString(2);
				String content = rs.getString(3);
				String actor = rs.getString(4);
				
				System.out.println("검색한 결과>>" + id2 + " " + title + " " + content + " " + actor);
				bag= new DVO만들기복습();
				bag.setId(id2);
				bag.setTitle(title);
				bag.setContent(content);
				bag.setActor(actor);
			}
			ps.close();
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return bag;
		
	}
	

}
