<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Product</title>

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
        overflow: hidden;
        background: linear-gradient(135deg, #6a11cb, #2575fc);
        background-size: 400% 400%;
        animation: gradientFlow 8s ease infinite;
    }

    /* Moving Gradient Background */
    @keyframes gradientFlow {
        0% { background-position: 0% 50%; }
        50% { background-position: 100% 50%; }
        100% { background-position: 0% 50%; }
    }

    /* Floating shapes */
    .shape {
        position: absolute;
        width: 85px;
        height: 85px;
        background: rgba(255,255,255,0.10);
        border-radius: 18px;
        animation: float 7s infinite ease-in-out;
    }

    .shape:nth-child(1) { top: 12%; left: 20%; animation-duration: 6s; }
    .shape:nth-child(2) { top: 70%; left: 10%; animation-duration: 7s; }
    .shape:nth-child(3) { top: 35%; left: 80%; animation-duration: 8s; }
    .shape:nth-child(4) { top: 82%; left: 70%; animation-duration: 6s; }

    @keyframes float {
        0%, 100% { transform: translateY(0px); }
        50% { transform: translateY(-25px); }
    }

    /* Form Box */
    .form-box {
        width: 430px;
        padding: 40px;
        background: rgba(255,255,255,0.15);
        border-radius: 20px;
        backdrop-filter: blur(10px);
        text-align: center;
        box-shadow: 0 0 25px rgba(255,255,255,0.3);
        animation: fadeIn 0.9s ease-out;
        z-index: 5;
    }

    @keyframes fadeIn {
        from { opacity: 0; transform: translateY(25px); }
        to { opacity: 1; transform: translateY(0); }
    }

    h2 {
        color: white;
        margin-bottom: 20px;
        font-size: 30px;
        font-weight: 600;
        text-shadow: 0 0 12px rgba(255,255,255,0.5);
    }

    /* Inputs */
    input[type="text"] {
        width: 90%;
        padding: 10px 14px;
        margin: 10px 0;
        border-radius: 10px;
        border: none;
        font-size: 16px;
        outline: none;
        background: rgba(255,255,255,0.75);
        transition: 0.3s;
    }

    input[type="text"]:focus {
        box-shadow: 0 0 12px rgba(255,255,255,0.7);
        transform: scale(1.03);
    }

    /* Button */
    input[type="submit"] {
        width: 95%;
        margin-top: 15px;
        padding: 12px;
        border-radius: 12px;
        border: none;
        background: white;
        cursor: pointer;
        font-size: 18px;
        font-weight: 600;
        color: #333;
        transition: 0.3s;
        box-shadow: 0 5px 18px rgba(255,255,255,0.4);
    }

    input[type="submit"]:hover {
        transform: translateY(-4px);
        box-shadow: 0 8px 25px rgba(255,255,255,0.6);
    }
</style>

</head>
<body>

<!-- Floating shapes -->
<div class="shape"></div>
<div class="shape"></div>
<div class="shape"></div>
<div class="shape"></div>

<!-- Form Card -->
<div class="form-box">
    <h2>Add Product</h2>

    <form action="addProduct" method="post">
        
        <input type="text" name="itemName" placeholder="Item Name">
        
        <input type="text" name="description" placeholder="Item Description">
        
        <input type="text" name="quantity" placeholder="Item Quantity">
        
        <input type="text" name="price" placeholder="Item Price">

        <input type="submit" value="Add Product">

    </form>
</div>

</body>
</html>
