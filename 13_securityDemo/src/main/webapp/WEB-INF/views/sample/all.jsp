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
	<h1>/sample/all page</h1>
	<a href="<c:url value='/signup' />">signup</a><br />
	<a href="<c:url value='/customLogin' />">login</a><br />
	<a href="member">member</a><br />
	<a href="admin">admin</a>
</body>
</html>