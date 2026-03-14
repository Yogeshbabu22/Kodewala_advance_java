<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <form action="addProduct" method="post">
        
        <input type="text" name="itemName" placeholder="Item Name">
        
        <input type="text" name="description" placeholder="Item Description">
        
        <input type="text" name="quantity" placeholder="Item Quantity">
        
        <input type="text" name="price" placeholder="Item Price">

        <input type="submit" value="Update Product">

    </form>

</body>
</html>