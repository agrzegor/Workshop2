package org.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/user/edit")
public class UserEdit extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDao userDao = new UserDao();
        User user = userDao.read(Integer.parseInt(request.getParameter("id")));
        request.setAttribute("user", user);
        getServletContext().getRequestDispatcher("/users/edit.jsp")
                .forward(request, response);
    }
        @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idUser = request.getParameter("id");
        response.setContentType("text/html;charset=UTF-8");

        String userName = request.getParameter("userName");
        String email = request.getParameter("userEmail");
        String password = request.getParameter("userPassword");

        UserDao userDao  = new UserDao();
       User user = userDao.read(Integer.parseInt(idUser));
       user.setUserName(userName);
       user.setEmail(email);
       user.setPassword(password);
        userDao.update(user);

        response.sendRedirect(request.getContextPath() + "/user/list");


    }

}