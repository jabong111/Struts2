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
	<table border="1">
		<s:iterator value="uploads" status="stat">
			<tr>
				<td>FIlE:[<s:property value="%{#stat.index}"/>]</td>
				<td><s:property value="%{uploads[#stat.index]}"/></td>
			</tr>
		</s:iterator>	
	</table>
	<br>
	
	<table border="1">
		<s:iterator value="uploadsContentType" status="stat">
			<tr>
				<td>Content Type:[<s:property value="%{#stat.index}"/>]</td>
				<td><s:property value="%{uploadsContentType[#stat.index]}"/></td>
			</tr>
		</s:iterator>	
	</table>
	
	<br>
	<table border="1">
		<s:iterator value="uploadsFileName" status="stat">
			<tr>
				<td>File Name:[<s:property value="%{#stat.index}"/>]</td>
				<td><s:property value="%{uploadsFileName[#stat.index]}"/></td>
			</tr>
		</s:iterator>	
	</table>
	

</body>
</html>