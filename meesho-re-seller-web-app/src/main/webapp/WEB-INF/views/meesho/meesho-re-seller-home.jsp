<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Dashboard</title>

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
        animation: gradientFlow 7s ease infinite;
    }

    /* Moving Gradient Background */
    @keyframes gradientFlow {
        0% { background-position: 0% 50%; }
        50% { background-position: 100% 50%; }
        100% { background-position: 0% 50%; }
    }

    /* Floating Shapes */
    .shape {
        position: absolute;
        width: 90px;
        height: 90px;
        background: rgba(255,255,255,0.12);
        border-radius: 20px;
        animation: float 8s infinite ease-in-out;
    }

    .shape:nth-child(1) { top: 12%; left: 18%; animation-duration: 6s; }
    .shape:nth-child(2) { top: 75%; left: 8%; animation-duration: 7s; }
    .shape:nth-child(3) { top: 35%; left: 82%; animation-duration: 8s; }
    .shape:nth-child(4) { top: 82%; left: 72%; animation-duration: 6s; }

    @keyframes float {
        0%, 100% { transform: translateY(0px); }
        50% { transform: translateY(-25px); }
    }

    /* Dashboard Box */
    .dashboard {
        width: 450px;
        padding: 40px;
        text-align: center;
        background: rgba(255,255,255,0.15);
        backdrop-filter: blur(10px);
        border-radius: 18px;
        box-shadow: 0 0 25px rgba(255,255,255,0.3);
        animation: fadeIn 0.8s ease-out;
        z-index: 5;
    }

    @keyframes fadeIn {
        from { opacity: 0; transform: translateY(25px); }
        to { opacity: 1; transform: translateY(0); }
    }

    h2 {
        font-size: 32px;
        color: white;
        margin-bottom: 25px;
        font-weight: 600;
        text-shadow: 0 0 12px rgba(255,255,255,0.5);
    }

    .menu-item {
        margin: 14px 0;
        font-size: 22px;
        padding: 12px;
        border-radius: 12px;
        background: rgba(255,255,255,0.30);
        backdrop-filter: blur(6px);
        transition: 0.35s;
        cursor: pointer;
        color: white;
        font-weight: 500;
        text-decoration: none;
        display: block;
    }

    .menu-item:hover {
        transform: translateY(-6px);
        box-shadow: 0 6px 22px rgba(255,255,255,0.6);
        background: rgba(255,255,255,0.45);
        color: #222;
    }
</style>

</head>
<body>

<!-- Floating shapes -->
<div class="shape"></div>
<div class="shape"></div>
<div class="shape"></div>
<div class="shape"></div>

<!-- Dashboard Menu -->
<div class="dashboard">
    <h2>Welcome</h2>

    <a class="menu-item" href="showAddProductPage">Add Product</a>
    <a class="menu-item" href="updateProductPage">Update Product</a>
    <a class="menu-item" href="deleteProductPage">Delete Product</a>
    <a class="menu-item" href="viewProductPage">View Product</a>
</div>

</body>
</html>
