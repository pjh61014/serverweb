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
			alert("들어왔냥")
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
		//obj: XMLHttmpRequest객체, msg: 응답메세지, statusMsg: 에러메세지 
		alert("오류발생"+obj+msg+statusMsg);
	}
</script>
</head>
<body>
	<div class="container-fluid">
			<form name = "myform" role="form" class="form-horizontal"
				action="/template/deptinsert.do" method="POST">
				<fieldset>
					<div id="legend">
						<legend>아래 양식을 작성해주세요.</legend>
					</div>
					<div class="form-group">
						<!-- 부서코드 -->
						<label class="control-label col-sm-2" for="orgcode">부서코드</label>
						<div class="col-sm-3">
							<input type="text" id="orgcode" name="deptno"
								placeholder="부서코드" class="form-control"
								 required>
						</div>
					</div>

					
					
					<div class="form-group">
						<!-- 성명-->
						<label class="control-label col-sm-2" for="orgname">성명</label>
						<div class="col-sm-3">
							<input type="text" id="orgname" name="name"
								placeholder="성명" class="form-control" minlength="4" required>

						</div>
					</div>
					<div class="form-group">
						<!-- 사번-->
						<label class="control-label col-sm-2" for="id">사번</label>
						<div class="col-sm-3">
							<input type="text" id="empno" name="id" 
								placeholder="사번" class="form-control" minlength="4" required>
							
						</div>
						<span id="myspan" style="color: red"></span>
					</div>



				


					
					<div class="form-group">
						<!-- 패스워드-->
						<label class="control-label col-sm-2" for="pass">패스워드</label>
						<div class="col-sm-3">
							<input type="text" id="pass" name="pass"
								placeholder="패스워드" class="form-control" minlength="4" >

						</div>
					</div>
					<div class="form-group">
						<!-- 주소-->
						<label class="control-label col-sm-2" for="addr">주소</label>
						<div class="col-sm-3">
							<input type="text" id="addr" name="addr" 
							placeholder="주소" 
								class="form-control" minlength="4" required>

						</div>
					</div>
					<div class="form-group">
						<!-- 급여-->
						<label class="control-label col-sm-2" for="sal">급여</label>
						<div class="col-sm-3">
							<input type="text" id="sal" name="sal" 
							placeholder="급여"
								class="form-control" minlength="4" required>

						</div>
					</div>
					<div class="form-group">
						<!-- 등급-->
						<label class="control-label col-sm-2" for="grade">등급</label>
						<div class="col-sm-3">
							<input type="text" id="grade" name="grade" 
							placeholder="등급"
								class="form-control" minlength="4" required>

						</div>
					</div>
					<div class="form-group">
						<!-- Button -->
						<div class="col-sm-3 col-sm-offset-2">
							<input type="submit" value="가입하기" class="btn btn-success"/>
						</div>
					</div>
				</fieldset>
			</form>
	</div>
</body>
</html>