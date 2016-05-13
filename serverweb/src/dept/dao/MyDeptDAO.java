package dept.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

import dept.dto.MyDeptDTO;

//���������� DB������ �� �ִ� ��ü
public interface MyDeptDAO {
	//��ü �μ� ���� ��ȸ�ϱ� 
	ArrayList<MyDeptDTO> select(Connection con) throws SQLException;
	//�μ����
	int insert(MyDeptDTO dept,Connection con) throws SQLException;//�μ����
	//�μ����� �̿��ؼ� �μ������� ��ȸ
	ArrayList<MyDeptDTO> search(String dname,Connection con) throws SQLException;
//�μ� ����
	int delete(String deptno, Connection con) throws SQLException;
	
	//�μ��ڵ带 �̿��ؼ� �ش� �μ��� ��ȸ�ϱ� 
	MyDeptDTO read(String deptno, Connection con)throws SQLException;
	
	//������Ʈ 
	int update(MyDeptDTO dept, Connection con) throws SQLException;
}













