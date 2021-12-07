<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />

<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>

<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Books</title>
</head>
<body>
	<div class="container mt-5">
						<!-- HEADER -->
		<h1>All Books</h1>
        					<!-- TABLE -->
        <div class="col-9">        	
			<table class="table table-primary table-striped">
				<thead>
				    <tr>
				      <th scope="col-1">ID</th>
				      <th scope="col-6">Title</th>
				      <th scope="col">Language</th>
				      <th scope="col"># of Pages</th>
					</tr>
				</thead>
				<tbody>
				  	<c:forEach var="book" items="${books}">
					<tr>
    					<td><c:out value="${book.id}"/></td>
    					<td><a href="/books/${book.id}"><c:out value="${book.title}"/></a></td>
    					<td><c:out value="${book.language}"/></td>
    					<td><c:out value="${book.numberOfPages}"/></td>
				  	</tr>
					</c:forEach>
				</tbody>
			</table>         
        </div>	
    </div>	
</body>
</html>
