<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Zepto Order Mgmt</title>

<style>
    body {
        margin: 0;
        padding: 0;
        font-family: "Poppins", sans-serif;
        background: linear-gradient(135deg, #ff4e50, #f9d423);
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        animation: fadeIn 1.2s ease-in;
    }

    .container {
        text-align: center;
        background: white;
        padding: 40px 60px;
        border-radius: 18px;
        box-shadow: 0px 10px 25px rgba(0,0,0,0.2);
        animation: popUp 0.7s ease-out;
    }

    h2 {
        margin: 0 0 20px 0;
        font-size: 30px;
        color: #333;
        animation: slideDown 1s ease-out;
    }

    a {
        text-decoration: none;
        font-size: 20px;
        padding: 12px 30px;
        background: #ff4e50;
        color: white;
        border-radius: 12px;
        display: inline-block;
        transition: 0.3s;
        animation: fadeUp 1s ease-out;
    }

    a:hover {
        background: #e63946;
        transform: scale(1.08);
        box-shadow: 0px 6px 15px rgba(255, 98, 98, 0.5);
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

<div class="container">
    <h2>Zepto Order Mgmt</h2>
    <a href="orderPage">Show Order Page</a>
</div>

</body>
</html>
