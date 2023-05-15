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
    <title>Calculator</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <form action="/calculator">
        <div class="input-group">
            <h4 for="firstNumber">FIRST NUMBER:</h4>
            <input type="number"
                   class="form-control" name="firstNumber" id="firstNumber" placeholder="">
            <br>
            <h4 for="calculation">calculation</h4>
            <select class="form-select" name="operator" id="calculation">
                <option value="+">Addition</option>
                <option value="-">Subtraction</option>
                <option value="*">Multiplication</option>
                <option value="/">Division</option>
            </select>
            <br>
            <h4 for="secondNumber">SECOND NUMBER:</h4>
            <input type="number"
                   class="form-control" name="secondNumber" id="secondNumber" placeholder="">
            <h4 for="result">RESULT:</h4>
            <input type="number"
                   class="form-control" name="result" id="result" value="${result}" readonly>
            <button class="btn btn-primary">Calculate</button>
        </div>
    </form>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
</body>
