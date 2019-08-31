<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>/sample/admin page</h1>

<%-- 	<a href='<c:url value="/customLogout" />'>Logout</a> --%>
	
	<form action='<c:url value="/customLogout" />' method="post">
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		<button>로그아웃</button>
	</form>
</body>
</html>