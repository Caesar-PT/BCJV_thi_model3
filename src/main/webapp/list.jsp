<%--
  Created by IntelliJ IDEA.
  User: thanh
  Date: 25/02/2021
  Time: 10:33 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Product Management Application</title>
</head>
<body>
<center>
    <h1>Product Management</h1>
    <h2>
        <a href="/products?action=create">Add New Product</a><br>
        <a href="/products?action=find">Find Product by name</a><br>
    </h2>
</center>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List of Product</h2></caption>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Price</th>
            <th>Amount</th>
            <th>Color</th>
            <th>Description</th>
            <th>Category</th>
        </tr>
        <c:forEach var="product" items="${list}">
            <tr>
                <td>${product.getId()}</td>
                <td>${product.getName()}</td>
                <td>${product.getPrice()}</td>
                <td>${product.getAmount()}</td>
                <td>${product.getColor()}</td>
                <td>${product.getDescription()}</td>
                <td>${product.getIdCategory()}</td>
                <td>
                    <a href="/products?action=edit&id=${product.getId()}">Edit</a>
                    <a href="/products?action=delete&id=${product.getId()}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
