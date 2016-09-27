<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%--JSTL다운 받아야하나..? --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- JSP Expression Language --%>
	<ul>
		<li>Name : ${customer.name}</li>
		<li>Id : ${customer.id }</li>
		<li>Email : ${customer.email }</li>
	</ul>

	<%-- loop를 생성하기 위해 JSTL을 사용해 테이블 출력 --%>
	<table style="border: 1px solid red; padding: 10px;">
		<c:forEach var="customer" items="${customerList}">
			<tr>
				<td>${customer.id}</td>
				<td>${customer.name}</td>
				<td>${customer.email}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>