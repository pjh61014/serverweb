package dept.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

import dept.dto.MyDeptDTO;

//직접적으로 DB연동할 수 있는 객체
public interface MyDeptDAO {
	//전체 부서 정보 조회하기 
	ArrayList<MyDeptDTO> select(Connection con) throws SQLException;
	//부서등록
	int insert(MyDeptDTO dept,Connection con) throws SQLException;//부서등록
	//부서명을 이용해서 부서정보를 조회
	ArrayList<MyDeptDTO> search(String dname,Connection con) throws SQLException;
//부서 삭제
	int delete(String deptno, Connection con) throws SQLException;
	
	//부서코드를 이용해서 해당 부서만 조회하기 
	MyDeptDTO read(String deptno, Connection con)throws SQLException;
	
	//업데이트 
	int update(MyDeptDTO dept, Connection con) throws SQLException;
}













