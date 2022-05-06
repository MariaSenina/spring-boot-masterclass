<%@ page import="java.time.LocalDate" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <title>Yahoo!!! ...from JSP</title>
  </head>
  <body>
      <%
          LocalDate date = LocalDate.now();
      %>
      <h1>Welcome! ${name}</h1>
      <div>Local date is <%=date%></div>
      <p style="color: red">${errorMessage}</p>
      <p>Enter your Login information below</p>
      <form action="login.do" method="post">
          <label>Name: </label><input type="text" name="name" /><br><br>
          <label>Password: </label><input type="password" name="password" /><br><br>
          <input type="submit" value="Login">
      </form>
  </body>
</html>
