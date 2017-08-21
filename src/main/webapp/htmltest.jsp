<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html">
<html>
<head>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script>
	$(function(){
		$('tr').click(function(){
			alert($(this).find('td').eq(1).html());
		});
	})
</script>
</head>
<body>
<table>
<tr><td>11</td><td>12</td></tr>
<tr><td>21</td><td>22</td></tr>
</table>
</body>
</html>