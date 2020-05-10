<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Refresh" content="5;url=/store_v2.0/jsp/index.jsp">
<!-- <meta http-equiv="Refresh" content="5;url=/store_v2.0/jsp/index.jsp"> -->
<title>Insert title here</title>
<script type="text/javascript">
	var time = 5
	window.onload = function() {
		setInterval('changeTime()',1000)
	}
	
	function changeTime() {
		time--;
		document.getElementById("s1").innerHTML=time;
	}
</script>
</head>
<body>
<h1>操作成功，页面将在<span id="s1">5</span>秒后跳转</h1>

</body>
</html>