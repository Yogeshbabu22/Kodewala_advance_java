<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Meesho Re-Seller</title>

<style>
    body {
        margin: 0;
        font-family: "Poppins", sans-serif;
        background: linear-gradient(135deg, #ff9a9e, #fad0c4);
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        animation: fadeIn 1.2s ease-in-out;
    }

    @keyframes fadeIn {
        from { opacity: 0; transform: translateY(20px); }
        to { opacity: 1; transform: translateY(0); }
    }

    .container {
        background: white;
        padding: 40px 60px;
        border-radius: 18px;
        box-shadow: 0 10px 25px rgba(0,0,0,0.15);
        text-align: center;
        animation: popUp 0.8s ease;
    }

    @keyframes popUp {
        from { transform: scale(0.7); opacity: 0; }
        to { transform: scale(1); opacity: 1; }
    }

    h2 {
        color: #ff476f;
        font-size: 28px;
        letter-spacing: 1px;
        margin-bottom: 20px;
    }

    a {
        display: inline-block;
        padding: 12px 25px;
        background: #ff476f;
        color: white;
        text-decoration: none;
        border-radius: 8px;
        font-size: 16px;
        transition: 0.3s ease;
        box-shadow: 0 5px 15px rgba(255,71,111,0.4);
    }

    a:hover {
        background: #ff2c59;
        transform: scale(1.08);
        box-shadow: 0 8px 20px rgba(255,44,89,0.6);
    }
</style>

</head>
<body>

<div class="container">
    <h2>Welcome to Meesho Re-Seller</h2>
    <a href="showProfilePage">Click to Create Profile</a>
</div>

</body>
</html>
