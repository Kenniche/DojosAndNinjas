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
<title>New Dojo</title>
</head>
<body>
	<div class = "container">
		<h5 class="mt-3 display1">New Dojo</h5>
    		<form:form action="/dojos/new" method="post" modelAttribute="newDojo">
	      		<p>
	      			<form:label path="name" class="form-label">Name:</form:label>
		      		<form:errors path="name" class="text-danger" />
		      		<form:input path="name" class="form-control"/>
	      		</p>
	      		<div class="d-flex justify-content-end">
		    		<input type="submit" value="Create Dojo" class="btn btn-sm btn-outline-primary mt-3" />
	      		</div>
    		</form:form>
	</div>
</body>
</html>