<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Successful</title>

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
        background: linear-gradient(-45deg, #00c6ff, #0072ff, #6a11cb, #2575fc);
        background-size: 400% 400%;
        animation: gradientMove 8s ease infinite;
        overflow: hidden;
    }

    /* Moving Gradient Background */
    @keyframes gradientMove {
        0% { background-position: 0% 50%; }
        50% { background-position: 100% 50%; }
        100% { background-position: 0% 50%; }
    }

    /* Floating shapes */
    .shape {
        position: absolute;
        width: 80px;
        height: 80px;
        background: rgba(255,255,255,0.1);
        border-radius: 20px;
        animation: float 6s infinite ease-in-out;
    }

    .shape:nth-child(1) { top: 10%; left: 20%; animation-duration: 7s; }
    .shape:nth-child(2) { top: 70%; left: 10%; animation-duration: 6s; }
    .shape:nth-child(3) { top: 40%; left: 80%; animation-duration: 8s; }
    .shape:nth-child(4) { top: 85%; left: 70%; animation-duration: 7s; }

    @keyframes float {
        0%, 100% { transform: translateY(0px); }
        50% { transform: translateY(-25px); }
    }

    /* Success Box */
    .success-box {
        background: rgba(255, 255, 255, 0.15);
        padding: 50px 60px;
        border-radius: 20px;
        text-align: center;
        backdrop-filter: blur(8px);
        box-shadow: 0 0 25px rgba(255,255,255,0.4);
        animation: zoomIn 0.8s ease-out;
    }

    @keyframes zoomIn {
        from { transform: scale(0.7); opacity: 0; }
        to { transform: scale(1); opacity: 1; }
    }

    h1 {
        font-size: 35px;
        color: white;
        font-weight: 600;
        text-shadow: 0 0 12px rgba(255,255,255,0.4);
        margin-bottom: 20px;
    }

    /* Success tick */
    .tick {
        font-size: 80px;
        color: #00ff88;
        animation: pop 0.7s ease-out;
        text-shadow: 0 0 20px rgba(0,255,150,0.8);
    }

    @keyframes pop {
        from { transform: scale(0); }
        to { transform: scale(1); }
    }

    /* Button */
    .btn {
        margin-top: 25px;
        padding: 12px 25px;
        border: none;
        text-decoration: none;
        background: white;
        color: black;
        font-size: 18px;
        border-radius: 30px;
        cursor: pointer;
        transition: 0.3s;
        box-shadow: 0 5px 25px rgba(255,255,255,0.4);
    }

    .btn:hover {
        transform: translateY(-5px);
        box-shadow: 0 8px 35px rgba(255,255,255,0.6);
    }

    /* Confetti */
    @keyframes confettiFall {
        from { transform: translateY(-100px) rotate(0deg); }
        to { transform: translateY(110vh) rotate(360deg); }
    }

    .confetti {
        position: absolute;
        width: 12px;
        height: 12px;
        background: randomColor;
        animation: confettiFall linear infinite;
    }
</style>

</head>
<body>

<!-- Floating shapes -->
<div class="shape"></div>
<div class="shape"></div>
<div class="shape"></div>
<div class="shape"></div>

<!-- Success Box -->
<div class="success-box">
    <div class="tick">✔</div>
    <h1>Login Successful!</h1>
    <a class="btn" href="homePage">Go to Dashboard</a>
</div>

<!-- Auto-create Confetti -->
<script>
    function randomColor() {
        const colors = ["#ff4d4d", "#ffe600", "#00ffea", "#00ff73", "#ff55ff"];
        return colors[Math.floor(Math.random() * colors.length)];
    }

    for (let i = 0; i < 35; i++) {
        let conf = document.createElement("div");
        conf.classList.add("confetti");
        conf.style.backgroundColor = randomColor();
        conf.style.left = Math.random() * 100 + "vw";
        conf.style.animationDuration = (3 + Math.random() * 3) + "s";
        conf.style.opacity = Math.random();
        document.body.appendChild(conf);
    }
</script>

</body>
</html>
