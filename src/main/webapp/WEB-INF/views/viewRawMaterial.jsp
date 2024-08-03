<%@page import="java.util.*" %>
<%@page import="com.bhumika.model.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Raw Material</title>
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
	List<RawMaterial>rawmaterials=(List<RawMaterial>)request.getAttribute("rawmaterialList");
%>
 <div class="login-container">
 <h2 style="color:#F2125E;">View Raw Material</h2>
<table>

<tr>
	<th>Material no.</th>
	<th>Material Name</th>
	<th>Quantity</th>
	<th>unit</th>
	<th>Cost</th>
	<th>Update_Quantity</th>
	<th>Delete</th>
</tr>

<% 
for(RawMaterial r :rawmaterials)
{%>
<tr>
	<td><%=r.getMid() %></td>
	<td><%=r.getMname() %></td>
	<td><%=r.getMquantity() %></td>
	<td><%=r.getMunit()%></td>
	<td><%=r.getMcost()%></td>
	<td><a class="btn btn-outline-primary pt-0 pb-0" href="update" >Update</a></td>
	<td><a class="btn btn-outline-danger pt-0 pb-0" href="delete?mid=<%=r.getMid()%>">Delete</a></td>
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