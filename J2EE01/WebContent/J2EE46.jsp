<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.*,java.sql.*" %>
<%@ page session = "true" buffer = "8kb" autoFlush = "true"  %><!-- 預設為true 沒有用用false效能較佳 -->
<%@ page info = "測試" %>
<%@ page errorPage="J2EE47.jsp" %><!-- 發生錯誤將會跳到47 -->
<!-- 指示元素 page include taglib -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%=getServletInfo() %>
	<%
	int a = 10,b=2;
	out.print(a/b);
	
	%>
</body>
</html>