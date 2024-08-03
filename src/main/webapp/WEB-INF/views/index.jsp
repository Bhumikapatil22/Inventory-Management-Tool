<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>IMT</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
        }
        .welcome-text {
            font-size: 2.5rem;
            color: #007bff;
            font-weight: bold;
        }
        .login-btn {
            font-size: 1.2rem;
            padding: 10px 20px;
            border-radius: 25px;
        }
        .card {
            border: none;
            box-shadow: 0 0 15px rgba(0, 0, 0, 0.2);
            border-radius: 15px;
        }
        .navbar-brand {
            font-size: 1.5rem;
            font-weight: bold;
        }
        .navbar-nav a {
            font-size: 1rem;
        }
        
        .hero-section {
        display: flex;
    flex-direction:column;
    justify-content: center;
    align-items: center;
    text-align:center;
            padding-top: 80px;
             padding-bottom:40px;
            color:  rgb(27, 27, 41);;
        }
        .hero-image {
        
            width: 280px;
           
        }
        .features-section {
         transform: translateY(-30px);
            z-index:2;
        }
        .feature-card {
            border: none;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            border-radius: 15px;
            transition: transform 0.3s;
        }
        .feature-card:hover {
            transform: translateY(-10px);
        }
        .feature-icon {
            font-size: 3rem;
            color: #007bff;
        }
        .btn
        {
        padding:5px 20px 5px 20px;
         background-color:#F2125E;
         color:white;
        }
        .welcome-text,.lead
        {
        color:rgb(27, 27, 41);
        }
    </style>
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="#">IMT</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        
    </nav>
    <div class="container-fluid hero-section ">

            <div class="col-md-6">
                <h1 class="welcome-text">Welcome to Our Inventory Management Tool</h1>
                <p class="lead">Manage your inventory efficiently and effectively with our state-of-the-art tool.</p>
                <a href="login" class="btn login-btn mb-2">Login</a>
            </div>    
        </div>
    </div>
    <div class="container features-section">
        <div class="row">
            <div class="col-md-4 text-center">
                <div class="card feature-card p-4">
                    <i class="feature-icon fas fa-truck"></i>
                    <h4 class="mt-3">Easy Logistics</h4>
                    <p>Streamline your logistics with our easy-to-use features.</p>
                </div>
            </div>
            <div class="col-md-4 text-center">
                <div class="card feature-card p-4">
                    <i class="feature-icon fas fa-chart-line"></i>
                    <h4 class="mt-3">Real-Time Analytics</h4>
                    <p>Get real-time insights into your inventory data.</p>
                </div>
            </div>
            <div class="col-md-4 text-center">
                <div class="card feature-card p-4">
                    <i class="feature-icon fas fa-shield-alt"></i>
                    <h4 class="mt-3">Secure & Reliable</h4>
                    <p>Your data is secure with our top-notch security measures.</p>
                </div>
            </div>
        </div>
    </div>
    
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script src="https://kit.fontawesome.com/a076d05399.js"></script>
</body>
</html>
