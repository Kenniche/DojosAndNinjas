<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri= "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/style.css">
<script type="text/javascript" src="js/app.js"></script>
<link rel="stylesheet" href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" />
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Dojo Page</title>
</head>
<body>
	<div class="container">
		<h1> <c:out value="${dojo.name}"/></h1>
		<table class=" mt-5 table table-striped ">
			<thead class="table-info">
				<tr>
					<td>First Name</td>
					<td>Last Name</td>
					<td>Age</td>
				</tr>
			</thead >
  			<c:forEach items="${dojo.ninjas}" var="ninja">
				<tr>
					<td> <c:out value="${ninja.firstName}"/> </td>
					<td> <c:out value="${ninja.lastName}"/> </td>
					<td> <c:out value="${ninja.age}"/> </td>
				</tr>
  			</c:forEach>
		</table>
	</div>
</body>
</html>