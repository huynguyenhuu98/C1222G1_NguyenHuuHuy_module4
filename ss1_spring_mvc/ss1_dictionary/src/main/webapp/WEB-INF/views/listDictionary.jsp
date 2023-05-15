<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 4/27/2023
  Time: 8:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Dictionary English to Vietnamese </title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<h2>DICTIONARY</h2>
<form action="/dictionary">
<div class="input-group">
    <label for="english">English</label>
    <input type="text"
           class="form-control" name="english" id="english" aria-describedby="helpId" placeholder="ENG"
           value="${english}">

    <label for="vietnamese">Vietnamese</label>
    <input type="text"
           class="form-control" name="vietnamese" id="vietnamese" aria-describedby="helpId" placeholder="VNA"
           value="${vietnamese}">

    <button type="submit">Translate</button>
</div>
</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
</body>
</html>
