<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>

<!-- Google Font -->
<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600&display=swap" rel="stylesheet">

<style>
    body {
        margin: 0;
        font-family: 'Poppins', sans-serif;
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        background: linear-gradient(135deg, #1c1c1c, #2a2a2a);
        color: white;
        overflow: hidden;
    }

    /* Floating shapes */
    .shape {
        position: absolute;
        width: 80px;
        height: 80px;
        background: rgba(255,255,255,0.08);
        border-radius: 15px;
        animation: float 6s infinite ease-in-out;
        filter: blur(1px);
    }

    .shape:nth-child(1) { top: 12%; left: 15%; animation-duration: 7s; }
    .shape:nth-child(2) { top: 70%; left: 25%; animation-duration: 6s; }
    .shape:nth-child(3) { top: 30%; left: 75%; animation-duration: 8s; }
    .shape:nth-child(4) { top: 80%; left: 80%; animation-duration: 7s; }

    @keyframes float {
        0%, 100% { transform: translateY(0px) rotate(0deg); }
        50% { transform: translateY(-25px) rotate(10deg); }
    }

    /* Container */
    .login-box {
        background: rgba(255,255,255,0.08);
        padding: 40px 50px;
        border-radius: 20px;
        backdrop-filter: blur(6px);
        box-shadow: 0 0 40px rgba(255,255,255,0.1);
        animation: fadeIn 1s ease-in-out;
        z-index: 10;
    }

    @keyframes fadeIn {
        from { opacity: 0; transform: translateY(20px); }
        to { opacity: 1; transform: translateY(0); }
    }

    h2 {
        text-align: center;
        margin-bottom: 25px;
        font-weight: 600;
        text-shadow: 0 0 10px rgba(255,255,255,0.25);
    }

    input[type="text"], input[type="password"] {
        width: 100%;
        padding: 12px;
        margin: 10px 0 20px;
        border-radius: 10px;
        border: none;
        outline: none;
        background: rgba(255,255,255,0.15);
        color: white;
        font-size: 16px;
    }

    ::placeholder {
        color: #ccc;
    }

    /* Zepto Style Button */
    input[type="submit"] {
        width: 100%;
        padding: 12px;
        background: white;
        border: none;
        border-radius: 30px;
        font-size: 18px;
        font-weight: 600;
        cursor: pointer;
        color: #1c1c1c;
        box-shadow: 0 5px 25px rgba(255,255,255,0.25);
        transition: 0.3s;
    }

    input[type="submit"]:hover {
        background: #f2f2f2;
        transform: translateY(-4px);
        box-shadow: 0 8px 30px rgba(255,255,255,0.35);
    }
</style>
</head>

<body>

<!-- Floating shapes -->
<div class="shape"></div>
<div class="shape"></div>
<div class="shape"></div>
<div class="shape"></div>

<!-- Login Box -->
<div class="login-box">
    <h2> Login</h2>

    <form action="validateLogin" method="post">
        <label>User Name:</label>
        <input type="text" name="userName" placeholder="Enter username" required>

        <label>Password:</label>
        <input type="password" name="password" placeholder="Enter password" required>

        <input type="submit" value="Login">
    </form>
</div>

</body>
</html>
