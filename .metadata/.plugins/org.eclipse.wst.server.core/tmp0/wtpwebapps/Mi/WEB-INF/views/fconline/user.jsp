<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<c:set var="cp" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>User Input Processing</title>
  <script src="${cp}/resources/fcUser.js"></script>
</head>
<body>
  <form onsubmit="submitForm(event)">
    <label for="username">검색할 유저:</label>
    <input type="text" id="username" name="username">
    <div id="user1_area"></div>
    <div id="user2_area"></div>
    <div id="user3_area"></div>
    <button type="submit">Submit</button>
  </form>

</body>
</html>