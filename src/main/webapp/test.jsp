<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
	upload test
	<br /><br />

	<a href="test.jsp">test</a>
	<br /><br />

	アップロード<br />
	<form action="./FileTest" method="POST" enctype="multipart/form-data">
		<input name="container" value="test" /><br />
		<!-- <input name="file" value="test.txt" /><br /> -->
		<input type="file" name="file" /><br />
		<input type="submit" />
	</form>
	<hr />
	ダウンロード<br />
	<a href="https://ottest01.mybluemix.net/objectStorage?container=test&file=test.txt">download</a>
</body>
</html>
