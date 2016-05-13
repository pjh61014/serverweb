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
  <script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
  <script type="text/javascript">

	$(document).ready(function(){
		$("#empno").on("change",function(){
			alert("���Գ�")
			$.ajax({
				"url":"/serverweb/idcheck.do",
				"type":"post",
				"data" : {"id":$("#empno").val()},
				"dataType" : "text",
				"success" : success_run,
				"error": err_run				
			});
		});
	});
	
	function success_run(txt){
		$("#myspan").html(txt);
	}
	function err_run(obj,msg,statusMsg){
		//obj: XMLHttmpRequest��ü, msg: ����޼���, statusMsg: �����޼��� 
		alert("�����߻�"+obj+msg+statusMsg);
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
							<input type="text" id="empno" name="id" 
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