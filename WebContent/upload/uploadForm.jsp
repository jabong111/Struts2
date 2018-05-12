<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<s:form action="upload" method="post" enctype="multipart/form-data">	
		<s:file label="File (1)" name="uploads"/>
		<s:file label="File (2)" name="uploads"/>
		<s:file label="File (3)" name="uploads"/>
		<s:submit/>
	</s:form>
</body>
</html>