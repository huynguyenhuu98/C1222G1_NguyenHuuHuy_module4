<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 4/27/2023
  Time: 2:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Change money usd/vnd</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<h1>Currency Convert</h1>
<br>
<form action="/money">
<div class="input-group">
    <label for="usd">USD: </label>
    <input type="number"
           class="form-control" name="usd" id="usd" aria-describedby="helpId" placeholder="USD" value="${usd}">
</div>
<div class="input-group">
    <label for="vnd">VND: </label>
    <input type="number"
           class="form-control" name="vnd" id="vnd" aria-describedby="helpId" placeholder="VND" value="${vnd}">
</div>
<button type="submit" class="btn btn-primary">Change</button>
</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
</body>
</html>
