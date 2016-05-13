package basic;

import static fw.JdbcTemplate.*;
import static fw.Query.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dept.dto.MyDeptDTO;

public class Dept {
	private String deptno;
	private String deptname;
	private String loc;
	private String telnum;
	
	public Dept(){
		
	}
	
	public Dept(String deptno, String deptname, String loc, String telnum){
	this.deptno = deptno;
	this.deptname = deptname;
	this.loc = loc;
	this.telnum = telnum;
	}

	
	
	public int insert(String deptno, String deptname, String loc, String telnum){
		String url = "jdbc:oracle:thin:@192.168.9.89:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "insert into mydept values(?,?,?,?)";
		int result=0;		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url, user, password);
			PreparedStatement ptmt = con.prepareStatement(sql);
			ptmt.setString(1, deptno);
			ptmt.setString(2, deptname);
			ptmt.setString(3, loc);
			ptmt.setString(4, telnum);
			
			//prepared는 sql을 실행할 수 있는 기능을 가지고 있음 
			result = ptmt.executeUpdate();
			System.out.println(result + " 개 삽입성공!!!!");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("연결실패");
		}
		
		return result;

	}
	
	
	
	public ArrayList<MyDeptDTO> select() {
		String url = "jdbc:oracle:thin:@192.168.9.89:1521:xe";
		String user = "scott";
		String password = "tiger";
		ArrayList<MyDeptDTO> list = new ArrayList<MyDeptDTO>();
		MyDeptDTO dept = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url, user, password);
			PreparedStatement ptmt = con.prepareStatement(DEPT_SELECTALL);
			ResultSet rs = ptmt.executeQuery();

			while (rs.next()) {
				dept = new MyDeptDTO(rs.getString(1), rs.getString(2),
						rs.getString(3), rs.getString(4));
				dept.setDeptno(rs.getString("deptno"));
				dept.setDeptname(rs.getString("deptname"));
				dept.setLoc(rs.getString("loc"));
				dept.setTelNum(rs.getString("telNum"));
				list.add(dept);

			}
			System.out.println(list.size());
			close(rs);
			close(ptmt);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
		
	}
	
	public int delete(String deptno)  {
		String url = "jdbc:oracle:thin:@192.168.9.89:1521:xe";
		String user = "scott";
		String password = "tiger";
		
		int result =0;
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url, user, password);
			PreparedStatement ptmt = con.prepareStatement(DEPT_DELETE);
			ptmt.setString(1, deptno);
			result = ptmt.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return result;
		
	}

}