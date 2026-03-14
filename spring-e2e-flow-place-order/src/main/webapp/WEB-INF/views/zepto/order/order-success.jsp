<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Order Confirmation</title>

<style>
    body {
        margin: 0;
        padding: 0;
        font-family: "Poppins", sans-serif;
        background: linear-gradient(135deg, #6a11cb, #2575fc);
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        animation: fadeIn 1.2s ease-in;
    }

    .card {
        background: white;
        padding: 40px 60px;
        border-radius: 18px;
        text-align: center;
        box-shadow: 0 10px 25px rgba(0,0,0,0.2);
        animation: popUp 0.7s ease-out;
    }

    h2 {
        margin: 0 0 10px 0;
        font-size: 30px;
        color: #333;
        animation: slideDown 1s ease-out;
    }

    p {
        font-size: 20px;
        color: #555;
        animation: fadeUp 1s ease-out;
    }

    .order-id {
        font-size: 26px;
        font-weight: bold;
        color: #2575fc;
        background: #e4f0ff;
        padding: 8px 18px;
        border-radius: 12px;
        display: inline-block;
        margin-top: 10px;
        animation: glow 1.5s infinite alternate ease-in-out;
    }

    /* Animations */
    @keyframes fadeIn {
        from { opacity: 0; }
        to { opacity: 1; }
    }

    @keyframes popUp {
        from { transform: scale(0.7); opacity: 0; }
        to { transform: scale(1); opacity: 1; }
    }

    @keyframes slideDown {
        from { transform: translateY(-20px); opacity: 0; }
        to { transform: translateY(0); opacity: 1; }
    }

    @keyframes fadeUp {
        from { transform: translateY(20px); opacity: 0; }
        to { transform: translateY(0); opacity: 1; }
    }

    @keyframes glow {
        from { box-shadow: 0 0 5px #2575fc; }
        to { box-shadow: 0 0 15px #6a11cb; }
    }
</style>

</head>
<body>

<div class="card">
    <h2>Order Confirmed 🎉</h2>
    <p>Your order has been placed successfully!</p>

    <div class="order-id">
        ${orderId}
    </div>
</div>

</body>
</html>
