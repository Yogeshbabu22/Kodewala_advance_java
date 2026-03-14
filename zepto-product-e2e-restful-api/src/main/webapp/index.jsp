<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Zepto Products</title>
<style>
    * {
        margin: 0;
        padding: 0;
        box-sizing: border-box;
        font-family: "Poppins", sans-serif;
    }

    body {
        height: 100vh;
        background: linear-gradient(135deg, #001f3f, #0074D9, #00c7ff);
        display: flex;
        align-items: center;
        justify-content: center;
        overflow: hidden;
        color: white;
    }

    /* Floating animation circles */
    .circle {
        position: absolute;
        border-radius: 50%;
        background: rgba(255, 255, 255, 0.15);
        animation: float 10s infinite ease-in-out;
    }

    .circle:nth-child(1) {
        width: 140px;
        height: 140px;
        top: 10%;
        left: 15%;
        animation-delay: 0s;
    }
    .circle:nth-child(2) {
        width: 220px;
        height: 220px;
        bottom: 15%;
        right: 10%;
        animation-delay: 2s;
    }
    .circle:nth-child(3) {
        width: 90px;
        height: 90px;
        top: 60%;
        left: 60%;
        animation-delay: 4s;
    }

    @keyframes float {
        0% { transform: translateY(0px); }
        50% { transform: translateY(-40px); }
        100% { transform: translateY(0px); }
    }

    /* Main content card */
    .container {
        background: rgba(255, 255, 255, 0.07);
        padding: 40px 60px;
        border-radius: 18px;
        text-align: center;
        backdrop-filter: blur(14px);
        box-shadow: 0px 0px 40px rgba(0, 0, 0, 0.2);
        animation: fadeIn 1.2s ease;
    }

    @keyframes fadeIn {
        0% { opacity: 0; transform: scale(0.7); }
        100% { opacity: 1; transform: scale(1); }
    }

    h1 {
        font-size: 46px;
        font-weight: 700;
        text-transform: uppercase;
        letter-spacing: 3px;
        margin-bottom: 20px;
        background: linear-gradient(to right, #ffd700, #ff5bff);
        -webkit-background-clip: text;
        -webkit-text-fill-color: transparent;
    }

    p {
        margin-bottom: 25px;
        font-size: 20px;
    }

    button {
        border: none;
        padding: 14px 32px;
        font-size: 18px;
        cursor: pointer;
        border-radius: 8px;
        background: linear-gradient(135deg, #ffd700, #ff7b00);
        color: #111;
        font-weight: 600;
        transition: 0.4s ease;
        box-shadow: 0px 0px 18px rgba(255, 191, 0, 0.4);
    }

    button:hover {
        background: linear-gradient(135deg, #ffdf00, #ff3d00);
        box-shadow: 0px 0px 30px rgba(255, 175, 0, 0.8);
        transform: translateY(-3px) scale(1.05);
    }
</style>
</head>
<body>

<div class="circle"></div>
<div class="circle"></div>
<div class="circle"></div>

<div class="container">
    <h1>Welcome to Zepto</h1>
    <p>Your trusted destination for smart product shopping</p>
    <button onclick="alert('Explore products coming soon!')">Explore Products</button>
</div>

</body>
</html>
