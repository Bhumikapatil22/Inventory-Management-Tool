<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Dashboard</title>
  <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
  <link rel="stylesheet" href="./resources/style.css">
  <style>
  #content{
	position:relative;
	top:190px;
	left:140px;
	display: flex;
    flex-direction:column;
    justify-content: center;
    align-items: center;
}
  </style>
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
    
    <div id="content">
      <h2 style="color:#F2125E;">Welcome to Dashboard</h2>
      <p>Select an option from the sidebar to see more details.</p>
    </div>
  </div>

  <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
  <script src="./resources/script.js"></script>
</body>
</html>

