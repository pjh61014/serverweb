package emp.service;

import emp.dto.MyEmpDTO;

public interface MyEmpService {
	MyEmpDTO login(String id, String pass);
	boolean idcheck(String id);

}
