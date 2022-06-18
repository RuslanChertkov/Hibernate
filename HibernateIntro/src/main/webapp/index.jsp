<%--
  Created by IntelliJ IDEA.
  User: Xiaomi
  Date: 01.12.2021
  Time: 21:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MainRegistration</title>
    <link rel="stylesheet" href="resources/styles.css" type="text/css">
</head>
<body>
<p>Add User:</p>
<form action="/demo/create" method="post">
    <label>Name:
        <input type="text" name="name" placeholder="Input name">
    </label>
    <br/>
    <label>Last Name:
        <input type="text" name="lName" placeholder="Input lastName">
    </label>
    <br/>
    <label>Address:
        <input type="text" name="address" placeholder="Input address">
    </label>
    <br/>
    <label for="r1">Is Married:
        <input type="radio" name="isMarried" value="true" id="r1">Yes
    </label>
    <label for="r2">
        <input type="radio" name="isMarried" value="false" id="r2">No
    </label>
    <br/>
    <input type="submit" value="Create">
    <input type="reset" value="Clear">
</form>
</body>
</html>
