<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add New Employee</title>
</head>
<body>
<h2>Add New Employee</h2>
<form:form method="POST" action="saveEmployee">
<table>
<tr>
<td>Name</td>
<td><form:input path="empname"/></td>
</tr>
<tr>
<td>Salary</td>
<td><form:input path="salary"/></td>
</tr>
<tr>
<td>Designation</td>
<td><form:input path="designation"/></td>
</tr>
<tr>
<td colspan="2">
<input type="submit" value="Save Employee"/>
</td>
</tr>
</table>
</form:form>
</body>
</html>