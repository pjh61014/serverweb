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
			System.out.println("�Է¼���");
		}else{
			System.out.println("�Է½���");
		}
		close(ptmt);
		return result;
	}

	@Override
	public ArrayList <MyDeptDTO> search(String dname, Connection con) throws SQLException {
		//�˻��Ǵ� ��� ���ڵ带 Vector�� ��� ������ �� �ֵ��� �����ϼ���
		//1. DAO�� ȣ���ϴ� Service�� DAO���� �����ϴ� Vector�� �޾Ƽ� �����ʷ� �ѱ� �� �ֵ���
		//   ����
		//2. �����ʿ��� ���ϵȴ� Vector�� ��� MyDeptDTO���� ������ ��� JTextArea�� ����� 
		//   �� �ֵ��� �ݺ����� �۾��ϼ���
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
		System.out.println("dao �Ѿ��");
		PreparedStatement ptmt = con.prepareStatement(DEPT_DELETE);
		ptmt.setString(1, deptno);
		int result = ptmt.executeUpdate();
		if(result>0){
			System.out.println("�Է¼���");
		}else{
			System.out.println("�Է½���");
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
			System.out.println("�Է¼���");
		}else{
			System.out.println("�Է½���");
		}
		close(ptmt);
		return result;
	}

	
}














