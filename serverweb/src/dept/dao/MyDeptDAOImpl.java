package dept.dao;

import static fw.JdbcTemplate.close;
import static fw.Query.*;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dept.dto.MyDeptDTO;
public class MyDeptDAOImpl implements MyDeptDAO{

	@Override
	public int insert(MyDeptDTO dept, Connection con) throws SQLException {
		PreparedStatement ptmt = con.prepareStatement(DEPT_INSERT);
		ptmt.setString(1, dept.getDeptno());
		ptmt.setString(2, dept.getDeptname());
		ptmt.setString(3, dept.getLoc());
		ptmt.setString(4, dept.getTelNum());
		int result = ptmt.executeUpdate();
		if(result>0){
			System.out.println("입력성공");
		}else{
			System.out.println("입력실패");
		}
		close(ptmt);
		return result;
	}

	@Override
	public ArrayList <MyDeptDTO> search(String dname, Connection con) throws SQLException {
		//검색되는 모든 레코드를 Vector에 담아 리턴할 수 있도록 구현하세요
		//1. DAO를 호출하는 Service도 DAO에서 리턴하는 Vector를 받아서 리스너로 넘길 수 있도록
		//   변경
		//2. 리스너에서 리턴된느 Vector에 담긴 MyDeptDTO들의 정보를 모두 JTextArea에 출력할 
		//   수 있도록 반복으로 작업하세요
		ArrayList<MyDeptDTO> deptlist = new ArrayList<MyDeptDTO>();
		MyDeptDTO dept = null;
		System.out.println("dao"+dname);
		PreparedStatement ptmt = con.prepareStatement(DEPT_SELECT);
		ptmt.setString(1, "%"+dname+"%");
		ResultSet rs = ptmt.executeQuery();
		while(rs.next()){
			dept = new MyDeptDTO(rs.getString(1),
				rs.getString(2), rs.getString(3), rs.getString(4));
			deptlist.add(dept);
		}
		close(rs);
		close(ptmt);
		return deptlist;
	}

	@Override
	public ArrayList<MyDeptDTO> select(Connection con) throws SQLException {
		ArrayList<MyDeptDTO> deptlist = new ArrayList<MyDeptDTO>();
		MyDeptDTO dept = null;
		System.out.println("dao");
		PreparedStatement ptmt = con.prepareStatement(DEPT_SELECTALL);
		ResultSet rs = ptmt.executeQuery();
		while(rs.next()){
			dept = new MyDeptDTO(rs.getString(1),
				rs.getString(2), rs.getString(3), rs.getString(4));
			deptlist.add(dept);
		}
		close(rs);
		close(ptmt);
		return deptlist;
	}

	@Override
	public int delete(String deptno, Connection con) throws SQLException {
		System.out.println("dao 넘어옴");
		PreparedStatement ptmt = con.prepareStatement(DEPT_DELETE);
		ptmt.setString(1, deptno);
		int result = ptmt.executeUpdate();
		if(result>0){
			System.out.println("입력성공");
		}else{
			System.out.println("입력실패");
		}
		close(ptmt);
		return result;
	}
	
	@Override
	public MyDeptDTO read(String deptno, Connection con) throws SQLException {
		MyDeptDTO dept = null;
		System.out.println("dao");
		PreparedStatement ptmt = con.prepareStatement(DEPT_READ);
		ptmt.setString(1, deptno);
		ResultSet rs = ptmt.executeQuery();
		while(rs.next()){
			dept = new MyDeptDTO(rs.getString(1),
				rs.getString(2), rs.getString(3), rs.getString(4));
		}
		close(rs);
		close(ptmt);
		return dept;
	}

	@Override
	public int update(MyDeptDTO dept, Connection con) throws SQLException {
		PreparedStatement ptmt = con.prepareStatement(DEPT_UPDATE);
		ptmt.setString(1, dept.getDeptname());
		ptmt.setString(2, dept.getLoc());
		ptmt.setString(3, dept.getTelNum());
		ptmt.setString(4, dept.getDeptno());
		int result = ptmt.executeUpdate();
		if(result>0){
			System.out.println("입력성공");
		}else{
			System.out.println("입력실패");
		}
		close(ptmt);
		return result;
	}

	
}














