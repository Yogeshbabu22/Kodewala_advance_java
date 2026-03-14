<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Login Page</title>

    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: 'Segoe UI', sans-serif;
            background: linear-gradient(120deg, #ff6a00, #ee0979, #6a00f4, #2575fc, #00c6ff);
            background-size: 400% 400%;
            animation: gradientAnimation 10s ease infinite;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        @keyframes gradientAnimation {
            0% { background-position: 0% 50%; }
            50% { background-position: 100% 50%; }
            100% { background-position: 0% 50%; }
        }

        .login-container {
            width: 360px;
            padding: 35px;
            border-radius: 15px;
            backdrop-filter: blur(12px);
            background: rgba(255, 255, 255, 0.20);
            box-shadow: 0 0 35px rgba(0, 0, 0, 0.2);
            color: white;
            text-align: center;
        }

        .login-container h2 {
            margin-bottom: 25px;
            font-weight: 600;
            text-shadow: 0px 0px 4px rgba(0,0,0,0.3);
        }

        .btn-link {
            display: inline-block;
            width: 100%;
            padding: 12px;
            background: rgba(255,255,255,0.3);
            color: white;
            border-radius: 8px;
            text-decoration: none;
            font-size: 18px;
            cursor: pointer;
            transition: 0.3s ease;
        }

        .btn-link:hover {
            background: rgba(255,255,255,0.5);
            transform: translateY(-2px);
        }

    </style>
</head>

<body>

    <div class="login-container">
        <h2>Welcome Back</h2>

        <!-- Clickable link that opens your Spring MVC controller -->
        <a class="btn-link" href="login">Click Here to Login</a>

    </div>

</body>
</html>
