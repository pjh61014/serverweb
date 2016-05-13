package fw;
//SQL만 정의하는 클래스 - 프레임워크 기반으로 작업을 하면 설정파일(XML)로 변경됨
public class Query {
	public static String DEPT_INSERT
			="insert into mydept values(?,?,?,?)";
	public static String DEPT_SELECT
	="select * from mydept where deptname like ?";
	public static String DEPT_SELECTALL
	="select * from mydept";
	public static String DEPT_SELECT_NAME
	="select deptname from mydept";
	public static String MEMBER_LIST =
	"select e,id, e.name, e.addr, d.deptname"+"from myemp e, mydept d"
	+"where e.deptno = d.deptno"
	+"and d,deptname = ?";
	public static String DEPT_DELETE ="delete from mydept where deptno=?";
	public static String DEPT_READ
	="select * from mydept where deptno = ?";
	public static String EMP_LOGIN
	="select * from myemp where id=? and pass=?";
	public static String DEPT_UPDATE
	="update mydept set deptname=?, loc=?, telNum=? where deptno = ?";
	public static String memberCheck
	="select *from myemp where id=?";
}
