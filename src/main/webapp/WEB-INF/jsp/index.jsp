<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
<style>
table, td {
	border: 1px solid;
	border-spacing: 0px;
}
</style>
</head>
<body>
	<table>
		<tbody>
			<c:forEach items="${list}" var="i">
				<tr>
					<td><c:out value="${i.ID}" /></td>
					<td><c:out value="${i.VALUE}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>