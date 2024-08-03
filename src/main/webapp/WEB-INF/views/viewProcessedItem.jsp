<%@page import="java.util.*" %>
<%@page import="com.bhumika.model.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Processed Item</title>
 <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
  <link rel="stylesheet" href="./resources/style.css">
</head>
<body> <div class="sidebar p-3">
    <h2>IMT</h2>
    <nav>
      <a href="add" >Add Raw Material</a>
      <a href="viewRawMaterial">view Raw Material</a>
      <a href="addProcessedItem">add Processed Item</a>
      <a href="viewProcessedItem">viewProcessedItem</a>
      <a href="issue">Issue Raw Material</a>
      <a href="viewIssueRawMaterial">View Issued Raw Materials</a>
      <a href="issuePItem">Issue Processed Item</a>
      <a href="viewIssueProcessedItem">View Issued Processed Items</a>
      <a href="viewunavailableRawMaterial">View Unavailable Raw Materials</a>
      <a href="viewunavailableProcessedItem">View unavailable Processed Item</a>
      <a href="change">Change Password</a>
         
    </nav>
  </div>
  <div class="main-content">
    <nav class="navbar navbar-expand-lg navbar-light bg-white">
      <a class="navbar-brand" href="#">IMT Admin</a>
      <div class="collapse navbar-collapse">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item">
            <a class="nav-link" href="dashboard">Dashboard</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="login">Logout</a>
          </li>
        </ul>
      </div>
    </nav>
    </div>


<%
	List<ProcessedItem>processedItems=(List<ProcessedItem>)request.getAttribute("processedItemList");
%>
<div class="login-container">
<h2 style="color:#F2125E;">View Processed Item</h2>
<table>
<tr>
	<th>Item no.</th>
	<th>Item Name</th>
	<th>Quantity</th>
	<th>unit</th>
	<th>Cost</th>
	<th>Update_Quantity</th>
	<th>Delete</th>
</tr>

<% 
for(ProcessedItem p :processedItems)
{%>
<tr>
	<td><%=p.getPid() %></td>
	<td><%=p.getPname() %></td>
	<td><%=p.getPquantity() %></td>
	<td><%=p.getPunit()%></td>
	<td><%=p.getPcost()%></td>
	<td><a class="btn btn-outline-primary pt-0 pb-0" href="updatePItem" >Update</a></td>
	<td><a class="btn btn-outline-danger pt-0 pb-0" href="deleteProcessedItem?pid=<%=p.getPid()%>">Delete</a></td>
</tr>
<%
}
%>
<tr>

</tr>
</table>
</div>
</body>
</html>