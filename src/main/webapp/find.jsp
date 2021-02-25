
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Find by Name</title>
</head>
<body>
<form method="post">
    <input type="text" name="nameProduct">
    <input type="submit" value="Find">
</form>
<h1>Result:</h1>
<c:forEach var="product" items="${list}">
<p>${product.getId()}</p>
<p>${product.getName()}</p>
<p>${product.getPrice()}</p>
</c:forEach>

</body>
</html>
