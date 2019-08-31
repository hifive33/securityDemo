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
	<form action="<c:url value='/signup' />" method="post">
		<input type="text" name="userid" /><br />
		<input type="password" name="userpwd" /><br />
		<input type="text" name="username" /><br />
		<input type="text" name="auth" value="ROLE_MEMBER"/><br />
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		<button>submit</button>
	</form>
	
</body>
</html>