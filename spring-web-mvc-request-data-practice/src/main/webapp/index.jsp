<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>

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
        background: linear-gradient(135deg, #1c1c1c, #2a2a2a);
        color: white;
    }

    /* Floating shapes animation */
    .shape {
        position: absolute;
        width: 80px;
        height: 80px;
        background: rgba(255,255,255,0.08);
        border-radius: 15px;
        animation: float 6s infinite ease-in-out;
        filter: blur(1px);
    }

    .shape:nth-child(1) { top: 15%; left: 10%; animation-duration: 7s; }
    .shape:nth-child(2) { top: 60%; left: 20%; animation-duration: 6s; }
    .shape:nth-child(3) { top: 30%; left: 70%; animation-duration: 8s; }
    .shape:nth-child(4) { top: 75%; left: 80%; animation-duration: 7s; }

    @keyframes float {
        0%, 100% { transform: translateY(0px) rotate(0deg); }
        50% { transform: translateY(-25px) rotate(8deg); }
    }

    /* Main content box */
    .container {
        text-align: center;
        animation: fadeIn 1.2s ease-in-out;
        z-index: 5;
    }

    @keyframes fadeIn {
        from { opacity: 0; transform: translateY(20px); }
        to { opacity: 1; transform: translateY(0); }
    }

    h2 {
        font-size: 42px;
        margin-bottom: 20px;
        font-weight: 600;
        text-shadow: 0 0 15px rgba(255,255,255,0.25);
    }

    /* Zepto-style button */
    a {
        display: inline-block;
        padding: 12px 28px;
        background: #ffffff;
        color: #1c1c1c;
        font-weight: 600;
        text-decoration: none;
        border-radius: 30px;
        font-size: 18px;
        transition: 0.3s;
        box-shadow: 0 5px 25px rgba(255,255,255,0.25);
    }

    a:hover {
        background: #eeeeee;
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

<!-- Main content -->
<div class="container">
    <h2>Zepto Login</h2>
    <a href="showLogin">Login</a>
</div>

</body>
</html>
