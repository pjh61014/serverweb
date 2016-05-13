package dept.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

import dept.dto.MyDeptDTO;

//DAO클래스의 메소드를 호출하고 관리하는 객체 - 커넥션관리(DAO로 커넥션을 전달)
public interface MyDeptService {
	// 부서등록
	int register(MyDeptDTO dept);// MyDeptDAOEmpl의 insert 메소드를 호출하는 메소드

	
	// 전체 부서 정보 조회하기
	ArrayList<MyDeptDTO> select();

	
	
	// 부서명을 이용해서 부서정보를 조회

	ArrayList<MyDeptDTO> search(String dname);
			
	// 부서 삭제
	int delete(String deptno);

	// 부서코드를 이용해서 해당 부서만 조회하기
	MyDeptDTO read(String deptno) ;

	// 업데이트
	int update(MyDeptDTO dept);

}
