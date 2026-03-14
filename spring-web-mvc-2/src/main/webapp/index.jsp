<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>

<style>
    /* ----- Animated Gradient Background ----- */
    body {
        margin: 0;
        padding: 0;
        font-family: Arial, sans-serif;
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        background: linear-gradient(-45deg, #ee7752, #e73c7e, #23a6d5, #23d5ab);
        background-size: 400% 400%;
        animation: gradientBG 12s ease infinite;
    }

    @keyframes gradientBG {
        0% { background-position: 0% 50%; }
        50% { background-position: 100% 50%; }
        100% { background-position: 0% 50%; }
    }

    /* ----- Form Styling ----- */
    .form-container {
        background: rgba(255, 255, 255, 0.15);
        padding: 30px;
        border-radius: 12px;
        backdrop-filter: blur(10px);
        box-shadow: 0 0 20px rgba(0,0,0,0.2);
        width: 320px;
        text-align: center;
        color: #fff;
    }

    input[type="text"], input[type="password"] {
        width: 90%;
        padding: 10px;
        margin: 10px 0;
        border: none;
        border-radius: 6px;
        outline: none;
    }

    input[type="submit"] {
        width: 100%;
        padding: 10px;
        background: #23d5ab;
        border: none;
        border-radius: 6px;
        color: white;
        font-size: 16px;
        cursor: pointer;
        transition: 0.3s;
    }

    input[type="submit"]:hover {
        background: #23a6d5;
    }

    h2 {
        margin-bottom: 20px;
        color: #fff;
    }

</style>
</head>
<body>

<div class="form-container">
    <h2>Login</h2>
    <form action="login" method="post">
        <input type="text" name="username" placeholder="Enter Username" required><br>
        <input type="password" name="password" placeholder="Enter Password" required><br>
        <input type="submit" value="Login">
    </form>

    <br><br>

    <h2>Logout</h2>
    <form action="logout" method="post">
        <input type="submit" value="Logout">
    </form>
</div>

</body>
</html>
