<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>

<style>
    body {
        margin: 0;
        font-family: "Poppins", sans-serif;
        background: linear-gradient(135deg, #84fab0, #8fd3f4);
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

    .success-box {
        background: #fff;
        padding: 40px 50px;
        text-align: center;
        width: 380px;
        border-radius: 20px;
        box-shadow: 0 10px 30px rgba(0,0,0,0.20);
        animation: zoomIn 0.6s ease-out;
    }

    @keyframes zoomIn {
        from { transform: scale(0.7); opacity: 0; }
        to { transform: scale(1); opacity: 1; }
    }

    .tick {
        font-size: 60px;
        color: #2ecc71;
        animation: tickPop 0.6s ease-out;
    }

    @keyframes tickPop {
        0% { transform: scale(0); opacity: 0; }
        60% { transform: scale(1.3); opacity: 1; }
        100% { transform: scale(1); }
    }

    h2 {
        margin-top: 10px;
        color: #2ecc71;
        font-size: 26px;
        letter-spacing: 1px;
    }

    a {
        display: inline-block;
        margin-top: 20px;
        text-decoration: none;
        background: #2ecc71;
        padding: 12px 25px;
        color: white;
        font-size: 16px;
        border-radius: 10px;
        transition: 0.3s ease;
        box-shadow: 0 6px 18px rgba(46,204,113,0.4);
    }

    a:hover {
        background: #27ae60;
        transform: scale(1.08);
        box-shadow: 0 8px 25px rgba(39,174,96,0.5);
    }
</style>

</head>
<body>

<div class="success-box">
    <div class="tick">&#10004;</div>
    <h2>Profile Created Successfully</h2>
    <a href="showLoginPage">Login</a>
</div>

</body>
</html>
