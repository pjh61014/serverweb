package emp.service;

import static fw.JdbcTemplate.*;

import java.sql.Connection;
import java.sql.SQLException;

import emp.dao.MyEmpDAO;
import emp.dao.MyEmpDAOImpl;
import emp.dto.MyEmpDTO;

public class MyEmpServiceImpl implements MyEmpService {

	@Override
	public MyEmpDTO login(String id, String pass) {
		Connection con = getConnect();
		MyEmpDAO dao = new MyEmpDAOImpl();
		MyEmpDTO dto = new MyEmpDTO();
		try {
			dto = dao.login(id, pass, con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			close(con);
		}
		
		return dto;
			
	}

	@Override
	public boolean idcheck(String id) {
		Connection conn = getConnect();
		MyEmpDAO dao = new MyEmpDAOImpl();
		boolean result=false;
		try {
			result = dao.idCheck(conn, id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close(null, null, conn);
		return result;
	}

}
