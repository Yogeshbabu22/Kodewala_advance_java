<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Re-seller Login</title>

<style>
    body {
        margin: 0;
        font-family: "Poppins", sans-serif;
        background: linear-gradient(135deg, #f6d365, #fda085);
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        animation: fadeIn 1s ease-in-out;
    }

    @keyframes fadeIn {
        from { opacity: 0; transform: translateY(20px); }
        to { opacity: 1; transform: translateY(0); }
    }

    .login-box {
        background: #fff;
        padding: 40px 50px;
        width: 380px;
        border-radius: 20px;
        text-align: center;
        box-shadow: 0 10px 30px rgba(0,0,0,0.2);
        animation: zoomIn 0.6s ease-out;
    }

    @keyframes zoomIn {
        from { transform: scale(0.7); opacity: 0; }
        to { transform: scale(1); opacity: 1; }
    }

    h2 {
        color: #e67e22;
        margin-bottom: 20px;
        font-size: 26px;
    }

    label {
        font-weight: bold;
        color: #555;
        display: block;
        text-align: left;
        margin-top: 10px;
    }

    input {
        width: 100%;
        padding: 12px;
        margin-top: 5px;
        border: 2px solid #ddd;
        border-radius: 10px;
        font-size: 15px;
        transition: 0.3s ease;
    }

    input:focus {
        border-color: #e67e22;
        box-shadow: 0 0 8px rgba(230,126,34,0.4);
        transform: scale(1.03);
        outline: none;
    }

    button {
        width: 100%;
        margin-top: 25px;
        padding: 12px;
        background: #e67e22;
        color: white;
        border: none;
        font-size: 17px;
        font-weight: bold;
        border-radius: 12px;
        cursor: pointer;
        transition: 0.3s ease;
        box-shadow: 0 6px 18px rgba(230,126,34,0.4);
    }

    button:hover {
        background: #d35400;
        transform: scale(1.07);
        box-shadow: 0 8px 25px rgba(211,84,0,0.6);
    }
</style>

</head>
<body>

<div class="login-box">
    <h2>Re-seller Login</h2>

    <form action="validateLogin" method="post">

        <label>Email:</label>
        <input type="email" name="email" required>

        <label>Password:</label>
        <input type="password" name="password" required>

        <button type="submit">Login</button>

    </form>
</div>

</body>
</html>
