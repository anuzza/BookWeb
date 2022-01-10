<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>

<h1> Search Book </h1><br> <br>

<form action = "SearchBookServlet" method = "post">

Enter Book Id <input type = "number" name = "id">
              <input type = "submit" value = "Find"><br> <br>
              
</form>
<hr>

<table width = "100%">

<thead>

<tr bg color = "red">

<td>BookID</td> 
<td>Title</td>
<td>Author</td>
<td>Price</td>
<td>Publication</td>  
<td>Edition</td>   

</tr>

</thead>

<tbody> 

<%

	//	List<Book> blist = (List<Book>)request.getAttribute("blist");
		//for ( Book b : blist){
				
		%>

	
				
				
			<tr>
			
			<td><%//=b.getId()%> </td>
			<td><%//=b.getTitle()%> </td>
			<td><%//=b.getAuthor()%> </td>
			<td><%//=b.getPrice()%> </td>
			<td><%//=b.getPublication()%> </td>
			<td><%//=b.getEdition()%></td>
			
		
			</tr>
			
			
			
					
			<%//} %>



	




</tbody>





</table>

</body>
</html>