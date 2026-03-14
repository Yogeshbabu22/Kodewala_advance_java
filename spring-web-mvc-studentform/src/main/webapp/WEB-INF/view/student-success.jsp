<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration Successful</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            background: #eef2f3;
            margin: 0;
            padding: 0;
        }

        .container {
            width: 50%;
            margin: 80px auto;
            background: #fff;
            padding: 25px;
            border-radius: 10px;
            box-shadow: 0px 4px 12px rgba(0,0,0,0.1);
        }

        h2 {
            text-align: center;
            color: #28a745;
        }

        p {
            font-size: 18px;
            margin: 12px 0;
        }

        strong {
            color: #333;
        }

        a {
            display: inline-block;
            margin-top: 20px;
            text-decoration: none;
            background: #007bff;
            color: white;
            padding: 10px 18px;
            border-radius: 5px;
            transition: 0.3s;
        }

        a:hover {
            background: #0056b3;
        }
    </style>

</head>

<body>

<div class="container">
    <h2>Student Registration Successful!</h2>

    <strong>First Name:</strong> ${student.firstName}
    <strong>Last Name:</strong> ${student.lastName}
    <strong>Email:</strong> ${student.email}

    <a href="studentForm">Register Again</a>
</div>

</body>
</html>
