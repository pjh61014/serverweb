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
  $(document).ready(function(){
	  $("#mysubmit").on("click",function(){
		 $("#myform").submit(function(){
			 //form내 name과 value를 배열로 가져옴
			 var postData = $(this).serializeArray();
			 $.ajax({
				 type:"post",
				 url:"/serverweb/ajaxinsert.do",
				 data:postData,
				 error:function(){
					 alert(e.responseText)
				 }
				 
			 });
			 return false;
		 });		  
	  });
  });
  
  </script>
</head>
<body>
	<div class="container-fluid">
			<form role="form" class="form-horizontal" id="myform">
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
						<!-- 부서명-->
						<label class="control-label col-sm-2" for="orgname">부서명</label>
						<div class="col-sm-3">
							<input type="text" id="orgname" name="deptname"
								placeholder="부서명" class="form-control" minlength="4" required>

						</div>
					</div>



				


					
					<div class="form-group">
						<!-- 부서위치-->
						<label class="control-label col-sm-2" for="orgloc">부서위치</label>
						<div class="col-sm-3">
							<input type="text" id="orgloc" name="loc"
								placeholder="부서위치" class="form-control" minlength="4" >

						</div>
					</div>
					<div class="form-group">
						<!-- 전화번호-->
						<label class="control-label col-sm-2" for="orgtel">전화번호</label>
						<div class="col-sm-3">
							<input type="text" id="orgtel" name="telNum" 
							placeholder="전화번호"
								class="form-control" minlength="4" required>

						</div>
					</div>


					<div class="form-group">
						<!-- Button -->
						<div class="col-sm-3 col-sm-offset-2">
							<input type="submit" value="가입하기" class="btn btn-success" id="mysubmit"/>
						</div>
					</div>
				</fieldset>
			</form>
	</div>
</body>
</html>