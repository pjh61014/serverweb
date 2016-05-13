package emp.dao;

import static fw.JdbcTemplate.*;
import static fw.Query.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import emp.dto.MyEmpDTO;

public class MyEmpDAOImpl implements MyEmpDAO {

	@Override
	public MyEmpDTO login(String id, String pass, Connection con)
			throws SQLException {
		MyEmpDTO myemp = null;
		PreparedStatement ptmt = con.prepareStatement(EMP_LOGIN);
		ptmt.setString(1, id);
		ptmt.setString(2, pass);
		ResultSet rs = ptmt.executeQuery();
		
		while(rs.next()){
			myemp = new MyEmpDTO(rs.getString(1),rs.getString(2),rs.getString(3),
					rs.getInt(4),rs.getString(5),rs.getString(6),rs.getString(7));
		}
		
		
		return myemp;
	}

	@Override
	public boolean idCheck(Connection conn, String id) throws SQLException {
		boolean result = false;
		PreparedStatement ptmt=conn.prepareStatement(memberCheck);
		ptmt.setString(1, id);
		ResultSet rs=ptmt.executeQuery();
		if(rs.next()){
			System.out.println("데이터있음");
			result = true;
		}
		close(rs, ptmt, null);
		return result;
	}
	
}
