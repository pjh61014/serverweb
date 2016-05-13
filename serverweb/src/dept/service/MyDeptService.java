package dept.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

import dept.dto.MyDeptDTO;

//DAOŬ������ �޼ҵ带 ȣ���ϰ� �����ϴ� ��ü - Ŀ�ؼǰ���(DAO�� Ŀ�ؼ��� ����)
public interface MyDeptService {
	// �μ����
	int register(MyDeptDTO dept);// MyDeptDAOEmpl�� insert �޼ҵ带 ȣ���ϴ� �޼ҵ�

	
	// ��ü �μ� ���� ��ȸ�ϱ�
	ArrayList<MyDeptDTO> select();

	
	
	// �μ����� �̿��ؼ� �μ������� ��ȸ

	ArrayList<MyDeptDTO> search(String dname);
			
	// �μ� ����
	int delete(String deptno);

	// �μ��ڵ带 �̿��ؼ� �ش� �μ��� ��ȸ�ϱ�
	MyDeptDTO read(String deptno) ;

	// ������Ʈ
	int update(MyDeptDTO dept);

}
