<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Change Password</title>
  <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
  <link rel="stylesheet" href="./resources/style.css">
</head>
<body>
 <div class="sidebar p-3">
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
<div class="login-container" style="margin-top:100px">
  <div class="login-form ">
		<form action="changePassword" method="post">
			<h2>Change Password</h2>
			<input type="text" name="memail" placeholder="Enter your email">
			<input type="password" name="mpassword" placeholder="Enter old password">
			<input type="password" name="npassword" placeholder="Enter new password">
			<input style="background-color:#F2125E; color:white" type="submit" value="Change Password">
		</form>
		</div>
		</div>
</body>
</html>