<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Place Order</title>

<style>
    body {
        margin: 0;
        padding: 0;
        font-family: "Poppins", sans-serif;
        background: linear-gradient(135deg, #ff512f, #dd2476);
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        animation: fadeIn 1.2s ease-in;
    }

    .card {
        background: #ffffff;
        width: 400px;
        padding: 35px 40px;
        border-radius: 16px;
        box-shadow: 0 12px 28px rgba(0,0,0,0.25);
        animation: popUp 0.8s ease-out;
    }

    h2 {
        text-align: center;
        margin-bottom: 25px;
        font-size: 28px;
        color: #333;
        animation: slideDown 1s ease-out;
    }

    label {
        font-size: 16px;
        font-weight: 500;
        color: #444;
    }

    input[type="text"] {
        width: 100%;
        padding: 10px 14px;
        margin: 8px 0 18px 0;
        border-radius: 10px;
        border: 1px solid #aaa;
        font-size: 15px;
        transition: 0.3s;
    }

    input[type="text"]:focus {
        border-color: #dd2476;
        box-shadow: 0 0 8px rgba(221,36,118,0.4);
        transform: scale(1.02);
    }

    input[type="submit"] {
        width: 100%;
        padding: 12px;
        font-size: 18px;
        border-radius: 10px;
        border: none;
        background: #ff512f;
        color: white;
        cursor: pointer;
        transition: 0.3s;
        margin-top: 10px;
        animation: fadeUp 1s ease-out;
    }

    input[type="submit"]:hover {
        background: #dd2476;
        transform: scale(1.05);
        box-shadow: 0px 8px 18px rgba(255, 81, 47, 0.4);
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
</style>

</head>
<body>

<div class="card">
    <h2>Place Your Order</h2>

    <form action="placeOrder" method="post">
        <label>Item Name:</label>
        <input type="text" name="item" required>

        <label>Quantity:</label>
        <input type="text" name="qty" required>

        <label>Price:</label>
        <input type="text" name="price" required>

        <label>Address:</label>
        <input type="text" name="address" required>

        <input type="submit" value="Place Order">
    </form>
</div>

</body>
</html>
