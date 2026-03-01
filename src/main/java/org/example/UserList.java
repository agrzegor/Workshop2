package org.example;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/user/list")
public class UserList extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        UserDao userDao = new UserDao();
        request.setAttribute("users", userDao.findAll());

        getServletContext().getRequestDispatcher("/users/list.jsp")
                .forward(request, response);

    }

}