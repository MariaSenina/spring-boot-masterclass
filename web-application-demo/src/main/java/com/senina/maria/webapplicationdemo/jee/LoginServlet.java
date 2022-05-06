package com.senina.maria.webapplicationdemo.jee;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
    private UserValidationService validationService = new UserValidationService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String name = request.getParameter("name");
        request.setAttribute("name", name);

        request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        boolean userIsValid = validationService.isValidUser(name, password);

        if (userIsValid) {
            request.setAttribute("name", name);
            request.setAttribute("password", password);

            request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
        } else {
            request.setAttribute("errorMessage", "Invalid credentials were entered");
            request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
        }
    }
}
