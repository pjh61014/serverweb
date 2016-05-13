package dept.dto;

public class MyDeptDTO {
	private String deptno;
	private String deptname;
	private String loc;
	private String telNum;
	
	public MyDeptDTO(){
		
	}

	public MyDeptDTO(String deptno, String deptname, String loc, String telNum) {
		super();
		this.deptno = deptno;
		this.deptname = deptname;
		this.loc = loc;
		this.telNum = telNum;
	}
	
	public MyDeptDTO(String deptname) {
		super();
		this.deptname = deptname;
	}
	
	
	
	
	@Override
	public String toString() {
		return "DeptDTO [deptno=" + deptno + ", deptname=" + deptname
				+ ", loc=" + loc + ", telNum=" + telNum + "]";
	}

	public String getDeptno() {
		return deptno;
	}

	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getTelNum() {
		return telNum;
	}

	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}
	
	
	}
