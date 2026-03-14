<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Invalid Login</title>

<style>
    /* 🔥 MOVING GRADIENT BACKGROUND */
    body {
        margin: 0;
        height: 100vh;
        overflow: hidden;
        background: linear-gradient(120deg, #ff0000, #ff4b2b, #8e2de2, #1e90ff);
        background-size: 400% 400%;
        animation: gradientMove 10s ease infinite;
        display: flex;
        justify-content: center;
        align-items: center;
        flex-direction: column;
        font-family: Arial, sans-serif;
        position: relative;
    }

    @keyframes gradientMove {
        0% { background-position: 0% 50%; }
        50% { background-position: 100% 50%; }
        100% { background-position: 0% 50%; }
    }

    /* 🔥 ANIMATED RED INVALID MESSAGE */
    h1 {
        font-size: 50px;
        color: #ff1c1c;
        text-shadow: 0 0 20px red, 0 0 40px crimson;
        animation: pulse 1.8s infinite alternate;
    }

    @keyframes pulse {
        from { transform: scale(1); opacity: 1; }
        to { transform: scale(1.12); opacity: 0.8; }
    }

    /* 🔥 ROTATING LOGO */
    .logo {
        width: 120px;
        margin-bottom: 20px;
        animation: spin 5s linear infinite;
    }

    @keyframes spin {
        0% { transform: rotate(0deg); }
        100% { transform: rotate(360deg); }
    }

    /* 🔥 3D CARD HOVER BOX */
    .card {
        width: 320px;
        height: 150px;
        background: white;
        border-radius: 20px;
        margin-top: 20px;
        display: flex;
        justify-content: center;
        align-items: center;
        font-size: 26px;
        font-weight: bold;
        transition: transform .3s ease, box-shadow .3s ease;
        box-shadow: 0 10px 25px rgba(0,0,0,0.2);
    }

    .card:hover {
        transform: perspective(600px) rotateY(15deg) rotateX(10deg) scale(1.1);
        box-shadow: 0 20px 45px rgba(0,0,0,0.4);
    }

    /* 😍 FLOATING EMOJIS */
    .emoji {
        position: absolute;
        font-size: 40px;
        animation: floatUp 6s linear infinite;
        pointer-events: none;
    }

    @keyframes floatUp {
        0% { transform: translateY(0px) scale(1); opacity: 1; }
        100% { transform: translateY(-900px) scale(1.4); opacity: 0; }
    }
</style>

</head>
<body>

<!-- Rotating logo (use any image you want) -->
<img src="https://upload.wikimedia.org/wikipedia/commons/a/a7/React-icon.svg" class="logo">

<h1>Invalid Credentials</h1>

<div class="card">Please Try Again ❗</div>

<script>
/* 🎉 CONFETTI EXPLOSION */
function confettiExplosion() {
    for (let i = 0; i < 60; i++) {
        let conf = document.createElement("div");
        conf.style.position = "absolute";
        conf.style.width = "8px";
        conf.style.height = "8px";
        conf.style.borderRadius = "50%";
        conf.style.background = `hsl(${Math.random()*360},100%,50%)`;
        conf.style.left = "50%";
        conf.style.top = "50%";
        conf.style.transform = `translate(-50%, -50%)`;
        conf.style.transition = "transform 1s ease, opacity 1s ease";
        document.body.appendChild(conf);

        setTimeout(() => {
            conf.style.transform = `translate(${(Math.random()-0.5)*800}px, ${(Math.random()-0.5)*800}px)`;
            conf.style.opacity = 0;
        }, 50);

        setTimeout(() => conf.remove(), 1200);
    }
}

setInterval(confettiExplosion, 2500);

/* 😍 FLOATING EMOJIS */
const emojis = ["🔥","❌","⚡","💢","🚫","😡","💥","😤"];

function spawnEmoji() {
    let e = document.createElement("div");
    e.className = "emoji";
    e.innerText = emojis[Math.floor(Math.random() * emojis.length)];
    e.style.left = Math.random() * window.innerWidth + "px";
    e.style.bottom = "-50px";
    e.style.animationDuration = (4 + Math.random() * 3) + "s";
    document.body.appendChild(e);

    setTimeout(() => e.remove(), 7000);
}

setInterval(spawnEmoji, 600);
</script>

</body>
</html>
