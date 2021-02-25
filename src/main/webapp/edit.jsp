<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Product Management Application</title>
</head>
<body>
<center>
    <h1>Product Management</h1>
    <h2>
        <a href="products?action">List All Users</a>
    </h2>
</center>
<div align="center">
    <form method="post">
        <table border="1" cellpadding="5">
            <caption>
                <h2>
                    Edit Product
                </h2>
            </caption>
<%--            <c:if test="${user != null}">--%>
<%--                <input type="hidden" name="id" value="<c:out value='${user.id}' />"/>--%>
<%--            </c:if>--%>
            <tr>
                <th>Product Name:</th>
                <td>
                    <input type="text" name="name" id="name" size="45" value="${product.getName()}"/>
                </td>
            </tr>
            <tr>
                <th>Product Price:</th>
                <td>
                    <input type="number" name="price" id="price" size="45" value="${product.getPrice()}"/>
                </td>
            </tr>
            <tr>
                <th>Product Amount</th>
                <td>
                    <input type="number" name="amount" id="amount" size="45" value="${product.getAmount()}"/>
                </td>
            </tr>
            <tr>
                <th>Product Color</th>
                <td>
                    <input type="text" name="color" id="color" size="45" value="${product.getColor()}"/>
                </td>
            </tr>
            <tr>
                <th>Product Description</th>
                <td>
                    <input type="text" name="description" id="description" size="45" value="${product.getDescription()}"/>
                </td>
            </tr>
            <tr>
                <th>Product Category</th>
                <td>
                    <input type="number" name="category" id="category" size="45" value="${product.getIdCategory()}"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Save"/>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>