<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
 <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <script type="text/javascript">
	var xhr;
		function runAjax(){
			//step1. XMLHttpRequest��ü ����
			
			xhr = new XMLHttpRequest();
			
			myspan = document.getElementById("myspan");
			//step2. onreadystatechange�� ����
			xhr.onreadystatechange= test
			xhr.open("POST", "/serverweb/idcheck.do",true);
			xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
			//step4. ��û������
			xhr.send("id="+myform.empno.value);	
		
			
				
			function test(){
				console.log("���°�"+xhr.readyState);
				if(xhr.readyState==4 && xhr.status==200) {
					myspan.innerHTML = xhr.responseText;
			}
		}
			//step3. ��û ����
			
		}

</script>
</head>
<body>
	<div class="container-fluid">
			<form name = "myform" role="form" class="form-horizontal"
				action="/template/deptinsert.do" method="POST">
				<fieldset>
					<div id="legend">
						<legend>�Ʒ� ����� �ۼ����ּ���.</legend>
					</div>
					<div class="form-group">
						<!-- �μ��ڵ� -->
						<label class="control-label col-sm-2" for="orgcode">�μ��ڵ�</label>
						<div class="col-sm-3">
							<input type="text" id="orgcode" name="deptno"
								placeholder="�μ��ڵ�" class="form-control"
								 required>
						</div>
					</div>

					
					
					<div class="form-group">
						<!-- ����-->
						<label class="control-label col-sm-2" for="orgname">����</label>
						<div class="col-sm-3">
							<input type="text" id="orgname" name="name"
								placeholder="����" class="form-control" minlength="4" required>

						</div>
					</div>
					<div class="form-group">
						<!-- ���-->
						<label class="control-label col-sm-2" for="id">���</label>
						<div class="col-sm-3">
							<input type="text" id="empno" name="id" onchange="runAjax()"
								placeholder="���" class="form-control" minlength="4" required>
							
						</div>
						<span id="myspan" style="color: red"></span>
					</div>



				


					
					<div class="form-group">
						<!-- �н�����-->
						<label class="control-label col-sm-2" for="pass">�н�����</label>
						<div class="col-sm-3">
							<input type="text" id="pass" name="pass"
								placeholder="�н�����" class="form-control" minlength="4" >

						</div>
					</div>
					<div class="form-group">
						<!-- �ּ�-->
						<label class="control-label col-sm-2" for="addr">�ּ�</label>
						<div class="col-sm-3">
							<input type="text" id="addr" name="addr" 
							placeholder="�ּ�" 
								class="form-control" minlength="4" required>

						</div>
					</div>
					<div class="form-group">
						<!-- �޿�-->
						<label class="control-label col-sm-2" for="sal">�޿�</label>
						<div class="col-sm-3">
							<input type="text" id="sal" name="sal" 
							placeholder="�޿�"
								class="form-control" minlength="4" required>

						</div>
					</div>
					<div class="form-group">
						<!-- ���-->
						<label class="control-label col-sm-2" for="grade">���</label>
						<div class="col-sm-3">
							<input type="text" id="grade" name="grade" 
							placeholder="���"
								class="form-control" minlength="4" required>

						</div>
					</div>
					<div class="form-group">
						<!-- Button -->
						<div class="col-sm-3 col-sm-offset-2">
							<input type="submit" value="�����ϱ�" class="btn btn-success"/>
						</div>
					</div>
				</fieldset>
			</form>
	</div>
</body>
</html>