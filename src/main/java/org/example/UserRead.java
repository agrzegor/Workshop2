package org.example;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet("/user/show")
public class UserRead extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        response.setContentType("text/html;charset=UTF-8");

        String idUser = request.getParameter("id");

        UserDao userDao = new UserDao();
        User user = userDao.read(Integer.parseInt(idUser));

        String userName = user.getUserName();
        String email = user.getEmail();

        request.setAttribute("userName", userName);
        request.setAttribute("email", email);
        getServletContext().getRequestDispatcher("/users/details.jsp")
                .forward(request, response);

    }
}