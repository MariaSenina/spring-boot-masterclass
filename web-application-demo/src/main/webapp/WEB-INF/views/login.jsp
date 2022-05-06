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
      <div>Local date is <%=date%></div>
      <p>My first JSP ${name}</p>
      <form action="/login.do" method="post">
          <label>Enter your name</label><input type="text" name="name" /><input type="submit">
      </form>
  </body>
</html>
