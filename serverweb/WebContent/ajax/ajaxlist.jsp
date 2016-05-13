<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@page import="dept.dto.MyDeptDTO,emp.dto.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
 <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script type="text/javascript">
	var xhr;
		function runAjax(deptno){
			//step1. XMLHttpRequest��ü ����
			 xhr = new XMLHttpRequest();
			//step2. onreadystatechange�� ����
			xhr.onreadystatechange= deptread;
			xhr.open("GET", "/serverweb/ajaxread.do?deptno="+deptno,true);
			xhr.send();		
			//step4. ��û������
			alert(deptno);
					
				
			function deptread(){
				var txt = "<h4>����:</h4>";
				console.log("���°�"+xhr.readyState);
				if(xhr.readyState==4 && xhr.status==200) {
					//mydiv.innerHTML = xhr.responseText;
					var dept =JSON.parse(xhr.responseText);
					document.getElementById("deptno").innerHTML
					=dept.deptno;
					document.getElementById("deptname").innerHTML
					=dept.deptname;
					document.getElementById("loc").innerHTML
					=dept.loc;
					document.getElementById("telNum").innerHTML
					=dept.telNum;
			}
		}
			//step3. ��û ����
			
		}

</script>

	<% //������ �������� ������ ������
	ArrayList<MyDeptDTO> list=(ArrayList<MyDeptDTO>)request.getAttribute("deptlist");
	
	%>
</head>
<body>
	<h1>�μ���� </h1>
<table border="1 solid gray"  width="600" style ="border-collapse:collapse">
<tr bgcolor = "aqua"><th>�����ȣ</th><th>�����</th><th>��ġ</th><th>��ȭ��ȣ</th><th>����</th></tr>
<%
for(int i=0; i<list.size(); i++){
	MyDeptDTO deptInfo = list.get(i);
	/* System.out.println(list.get(i).getDeptno()+" "+list.get(i).getDeptname()+""+list.get(i).getLoc()+" "+list.get(i).getTelNum());
} */
%>
	<tr >
		<td><a href ="javascript:runAjax('<%=deptInfo.getDeptno()%>')"><%=deptInfo.getDeptno()%></a></td>
		<td><a href="/serverweb/deptread.do?deptno=<%=deptInfo.getDeptno()%>&state=READ"><%=deptInfo.getDeptname()%></a></td>
		<td><%=deptInfo.getLoc()%></td>
		<td><%=deptInfo.getTelNum()%></td>
		<td><a href="/serverweb/deptDelete.do?deptno=<%=deptInfo.getDeptno()%>">����</a></td>
	</tr>

<%} %>


</table>

<!-- �μ������� -->
<div class="container-fluid">
			<form role="form" class="form-horizontal"
				action="/serverweb/deptread.do?deptno=&state=UPDATE" method="POST">
				<fieldset>
					<div id="legend">
						<legend>�Ʒ� ����� �ۼ����ּ���.</legend>
					</div>
					<div class="form-group">
						<!-- �μ��ڵ� -->
						<label class="control-label col-sm-2" for="orgcode">�μ��ڵ�</label>
						<div class="col-sm-3" id ="deptno">
							
						</div>
					</div>
		
					
					<div class="form-group">
						<!-- �μ���-->
						<label class="control-label col-sm-2" for="orgname">�μ���</label>
						<div class="col-sm-3" id = "deptname"> 
								
						</div>
					</div>



				


					
					<div class="form-group">
						<!-- �μ���ġ-->
						<label class="control-label col-sm-2" for="orgloc" >�μ���ġ</label>
						<div class="col-sm-3" id = "loc">
							

						</div>
					</div>
					<div class="form-group">
						<!-- ��ȭ��ȣ-->
						<label class="control-label col-sm-2" for="orgtel" >��ȭ��ȣ</label>
						<div class="col-sm-3" id = "telNum">
							
						</div>
					</div>


					<div class="form-group">
						<!-- Button -->
						<div class="col-sm-3 col-sm-offset-2">
							<input type="submit" value="����" class="btn btn-success"/>
						
						</div>
					</div>
				</fieldset>
			</form>
	</div>
</body>
</html>