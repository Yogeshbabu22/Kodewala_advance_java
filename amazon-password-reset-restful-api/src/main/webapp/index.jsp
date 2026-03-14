<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Set Password</title>

  <style>
    * {
      margin: 0;
      padding: 0;
      box-sizing: border-box;
      font-family: Arial, sans-serif;
    }

    body {
      background: #eaeded;
      display: flex;
      justify-content: center;
      align-items: center;
      min-height: 100vh;
    }

    .logo {
      position: absolute;
      top: 30px;
      left: 50%;
      transform: translateX(-50%);
      font-size: 28px;
      font-weight: bold;
      color: #111;
    }
    .logo span {
      color: #ff9900;
    }

    .card {
      width: 360px;
      background: white;
      border: 1px solid #d5d9d9;
      padding: 24px 22px;
      border-radius: 8px;
      box-shadow: 0 2px 4px rgba(0,0,0,0.1);
      animation: fadeIn 0.7s ease-in-out;
    }

    h2 {
      margin-bottom: 5px;
      font-size: 24px;
      font-weight: 500;
    }

    .subtitle {
      font-size: 13px;
      color: #555;
      margin-bottom: 18px;
    }

    label {
      font-size: 13px;
      font-weight: 700;
      display: block;
      margin-bottom: 4px;
    }

    .input-group {
      margin-bottom: 14px;
    }

    input {
      width: 100%;
      padding: 7px 9px;
      border: 1px solid #a6a6a6;
      border-radius: 3px;
      font-size: 13px;
      transition: 0.2s;
    }

    input:focus {
      border-color: #ff9900;
      box-shadow: 0 0 0 3px rgba(255,153,0,0.3);
      transform: translateY(-1px);
    }

    .hint {
      font-size: 11px;
      color: #555;
      margin-top: 3px;
    }

    button {
      width: 100%;
      margin-top: 10px;
      padding: 8px;
      font-size: 13px;
      border-radius: 3px;
      border: 1px solid #a88734;
      background: linear-gradient(#f7dfa5, #f0c14b);
      cursor: pointer;
      transition: 0.2s;
    }
    button:hover {
      filter: brightness(1.05);
      transform: translateY(-1px);
    }

    .small-link {
      margin-top: 14px;
      font-size: 11px;
    }
    .small-link a {
      color: #0066c0;
      text-decoration: none;
    }
    .small-link a:hover {
      text-decoration: underline;
    }

    @keyframes fadeIn {
      from { opacity: 0; transform: translateY(10px); }
      to   { opacity: 1; transform: translateY(0); }
    }
  </style>
</head>

<body>
  <div class="logo">Ama<span>zone</span></div>

  <div class="card">
    <h2>Set your password</h2>
    <p class="subtitle">Create a strong password for your account.</p>

    <form>
      <div class="input-group">
        <label>Email or phone</label>
        <input type="text" placeholder="you@example.com">
      </div>

      <div class="input-group">
        <label>New password</label>
        <input type="password">
        <p class="hint">Password must be at least 8 characters</p>
      </div>

      <div class="input-group">
        <label>Re-enter password</label>
        <input type="password">
      </div>

      <button type="submit">Save password</button>

      <p class="small-link">
        Having trouble? <a href="#">Get help</a>
      </p>
    </form>
  </div>
</body>
</html>
