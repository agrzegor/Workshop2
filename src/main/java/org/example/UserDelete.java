package org.example;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet("/user/delete")
public class UserDelete extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDao userDao = new UserDao();
        User user = userDao.read(Integer.parseInt(request.getParameter("id")));
        request.setAttribute("user", user);
        getServletContext().getRequestDispatcher("/users/delete.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String idUser = request.getParameter("id");
        UserDao userDao = new UserDao();
        userDao.delete(Integer.parseInt(idUser));
        response.sendRedirect("/user/list");

    }
}