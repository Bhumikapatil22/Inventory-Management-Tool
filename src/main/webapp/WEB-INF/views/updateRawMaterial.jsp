<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Raw Material</title>
 <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
<style>
body {
  background-color: #f8f9fa;
    		display:flex;
            justify-content:center;
            align-items:center;
            width:100%;
            height: 100vh;
            margin: 0;
            font-family: Arial, sans-serif;
            color: #F2125E;
}

.navbar
		{
		position:absolute;
		top:0;
		left:0;
		margin-left:0;
		width:100%;
		}

form {
	display:flex;
	flex-direction:column;
	justify-content:center;
    align-items:center;
    background: #ffffff;
    padding: 40px;
    border-radius: 8px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    max-width: 600px;
    width: 100%;
   }

h2 {
    margin-bottom: 20px;
    color: #333333;
}

input[type="text"], input[type="password"],input[type="submit"] {
    width: 350px;
    padding: 10px;
    margin: 10px 0;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}



input[type="submit"]:hover {
    background: #0056b3;
}
</style>
</head>
<body>
 <div class="main-content">
    <nav class="navbar navbar-expand-lg navbar-light bg-white">
      <a class="navbar-brand" href="#">IMT</a>
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
<div class="login-form" >
		  <form action="updateRawMaterial" method="post">
		<h2>Update Raw Material</h2>
		<input type="text" name="mid" placeholder="Enter material id">
		<input type="text" name="mquantity" placeholder="Enter quantity to upgrade">
		<input style="background-color:#F2125E;color:white;" type="submit" value="Update">
</form>
    </div>
</body>
</html>
