<%@ page contentType="text/html;charset=euc-kr"%>

<html>
<head>
<title>���� ���ε� ����</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
</head>

<body>
<!-- ���� ���ε带 �ϱ����ؼ��� method="post" ������ ����Ʈ���� �ϸ�  enctype="multipart/form-data"�� ��������Ѵ�. -->
<form name="fileForm" method="post" enctype="multipart/form-data" action="serverweb/upload.do">
	�ۼ���: 
	<input type="text" name="user"><br>
	��  ��: 
	<input type="text" name="title"><br>
	���ϸ�: 
	<input type="file" name="uploadFile"><br>
	<input type="submit" value="���� �ø���"><br>
</form>
</body>
</html>

