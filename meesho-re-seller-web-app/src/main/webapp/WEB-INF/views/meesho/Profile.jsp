<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Profile</title>

<style>
    body {
        margin: 0;
        padding: 0;
        font-family: "Poppins", sans-serif;
        background: linear-gradient(135deg, #a18cd1, #fbc2eb);
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        animation: fadeIn 1s ease-in-out;
    }

    @keyframes fadeIn {
        from { opacity: 0; transform: translateY(15px); }
        to { opacity: 1; transform: translateY(0); }
    }

    .form-container {
        background: #ffffff;
        padding: 40px 50px;
        width: 380px;
        border-radius: 18px;
        box-shadow: 0 10px 30px rgba(0,0,0,0.15);
        animation: popUp 0.8s ease;
    }

    @keyframes popUp {
        from { transform: scale(0.8); opacity: 0; }
        to { transform: scale(1); opacity: 1; }
    }

    h2 {
        text-align: center;
        color: #9b59b6;
        margin-bottom: 25px;
        font-size: 26px;
    }

    label {
        font-weight: bold;
        color: #555;
    }

    input {
        width: 100%;
        padding: 10px;
        margin-top: 5px;
        border: 2px solid #ddd;
        border-radius: 8px;
        font-size: 14px;
        transition: 0.3s ease;
    }

    input:focus {
        border-color: #9b59b6;
        box-shadow: 0 0 5px rgba(155, 89, 182, 0.5);
        transform: scale(1.02);
        outline: none;
    }

    button {
        width: 100%;
        padding: 12px;
        margin-top: 20px;
        background: #9b59b6;
        color: white;
        font-size: 16px;
        font-weight: bold;
        border: none;
        border-radius: 10px;
        cursor: pointer;
        box-shadow: 0 5px 18px rgba(155, 89, 182, 0.4);
        transition: 0.3s ease;
    }

    button:hover {
        background: #8e44ad;
        transform: scale(1.05);
        box-shadow: 0 8px 25px rgba(142, 68, 173, 0.6);
    }

</style>
</head>

<body>

<div class="form-container">
    <h2>Create Your Profile</h2>

    <form action="createProfile" method="post">

        <label>First Name:</label>
        <input type="text" name="firstName" required><br><br>

        <label>Last Name:</label>
        <input type="text" name="lastName" required><br><br>

        <label>Email:</label>
        <input type="email" name="email" required><br><br>

        <label>Phone Number:</label>
        <input type="text" name="phone" required><br><br>

        <label>Password:</label>
        <input type="password" name="password" required><br><br>

        <button type="submit">Create Profile</button>

    </form>
</div>

</body>
</html>
