package dept.service;

import static fw.JdbcTemplate.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

import dept.dao.MyDeptDAO;
import dept.dao.MyDeptDAOImpl;
import dept.dto.MyDeptDTO;
public class MyDeptServiceImpl implements MyDeptService {

	@Override
	public int register(MyDeptDTO dept) {
		Connection con = getConnect();
		MyDeptDAO dao = new MyDeptDAOImpl();
		int result = 0;
		try{
			result = dao.insert(dept, con);
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			close(con);
		}
		return result;
	}

	@Override
	public ArrayList<MyDeptDTO> search(String dname) {
		ArrayList<MyDeptDTO> deptlist = new ArrayList<MyDeptDTO>();
		System.out.println("서비스"+dname);
		Connection con = getConnect();
		MyDeptDAO dao = new MyDeptDAOImpl();
		try{
			deptlist = dao.search(dname, con);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return deptlist;
	}

	@Override
	public ArrayList<MyDeptDTO> select() {
		ArrayList<MyDeptDTO> deptlist = new ArrayList<MyDeptDTO>();
		System.out.println("서비스");
		Connection con = getConnect();
		MyDeptDAO dao = new MyDeptDAOImpl();
		try{
			deptlist = dao.select(con);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return deptlist;
	}

	@Override
	public int delete(String deptno) {
		Connection con = getConnect();
		MyDeptDAO dao = new MyDeptDAOImpl();
		int result = 0;
		try{
			result = dao.delete(deptno, con);
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			close(con);
		}
		return result;
	}

	@Override
	public MyDeptDTO read(String deptno) {
		Connection con = getConnect();
		MyDeptDAO dao = new MyDeptDAOImpl();
		MyDeptDTO dto = new MyDeptDTO();
		System.out.println("서비스 read_deptno: "+deptno);
			try {
				dto= dao.read(deptno, con);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				close(con);
			}
			return dto;
		
		
	}

	@Override
	public int update(MyDeptDTO dept) {
		Connection con = getConnect();
		MyDeptDAO dao = new MyDeptDAOImpl();
		int result = 0;
		try{
			result = dao.update(dept, con);
		}catch (SQLException e) {
			e.printStackTrace();
		}finally{
			close(con);
		}
		return result;
	
	}

	

}










