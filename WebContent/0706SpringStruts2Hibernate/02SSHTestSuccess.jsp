<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%System.out.println("sss"); %>
<s:iterator value="catList" var="cat">
	<s:property value="#request.cat.id"/><s:property value="#request.cat.name"/><s:property value="#request.cat.createDate"/><br/>
</s:iterator>
<s:iterator value="catList" var="c">
	sss<s:property value="#c.id"/><s:property value="#c.name"/><s:property value="#c.createDate"/><br/>
</s:iterator>
</body>
</html>