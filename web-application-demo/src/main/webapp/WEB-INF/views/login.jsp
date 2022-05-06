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
  </body>
</html>
