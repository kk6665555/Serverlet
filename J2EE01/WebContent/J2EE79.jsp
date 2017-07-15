<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${!empty param.delid and empty param.id }">
	<c:redirect url="J2EE78.JSP"></c:redirect>
</c:if>

<sql:setDataSource driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost/oneone"
 user="root" password="root"/>
 
 <c:if test="${!empty param.account }">
 	update member set account=?,password=?,realname=? where id=?
 	<sql:param>${param.account }</sql:param>
 	<sql:param>${param.password }</sql:param>
 	<sql:param>${param.realname }</sql:param>
 	<sql:param>${param.id }</sql:param>
 
 	<c:redirect url="J2EE78.JSP"></c:redirect>
 </c:if>
 
 
 
 <sql:query var="result">
	 Select * form member where id = ?
 	<sql:param>${param.editid }</sql:param>
 </sql:query>
	<form action="">
		Account:<input type="text" name="account" value="${result.rows[0].account }">
		Password:<input type="text" name="password" value="${result.rows[0].password }"> 
		Realname:<input type="text" name="realname" value="${result.rows[0].realname }">
		<input type="submit" value="Update">
	</form>
</body>
</html>