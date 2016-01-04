<%-- 
    Document   : list
    Created on : Jan 2, 2016, 8:13:00 PM
    Author     : GX82
--%>
<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html lang="en">



<body>

	<div class="container">

		<c:if test="${not empty msg}">
		    <div class="alert alert-${css} alert-dismissible" role="alert">
			<button type="button" class="close" data-dismiss="alert" 
                                aria-label="Close">
				<span aria-hidden="true">×</span>
			</button>
			<strong>${msg}</strong>
		    </div>
		</c:if>

		<h1>All Users</h1>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>#ID</th>
					<th>title</th>
					<th>sbn_number</th>
					<th>author</th>
					<th>publisher</th>
                                        
				</tr>
			</thead>

			<c:forEach var="book" items="${books}">
			    <tr>
				<td>${book.id}</td>
                                <td>${book.title}</td>
                                <td>${book.isbn_number}</td>
                                <td>${book.author}</td>
                                <td>${book.publisher}</td>
                                
                                
				
				<td>
				  <spring:url value="/${book.id}" var="userUrl" />
				  <spring:url value="/${book.id}/delete" var="deleteUrl" /> 
				  <spring:url value="/${book.id}/update" var="updateUrl" />

				  <button class="btn btn-info" 
                                          onclick="location.href='${userUrl}'">Query</button>
				  <button class="btn btn-primary" 
                                          onclick="location.href='${updateUrl}'">Update</button>
				  <button class="btn btn-danger" 
                                          onclick="this.disabled=true;post('${deleteUrl}')">Delete</button>
                                </td>
			    </tr>
			</c:forEach>
		</table>

	</div>

	

</body>
</html>