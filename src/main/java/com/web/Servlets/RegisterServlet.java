package com.web.Servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.web.Servlets.entity.User;
import com.web.Servlets.service.UserService;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    private UserService service;

    public RegisterServlet() {
        this.service = new UserService();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        Integer age = Integer.parseInt(req.getParameter("age"));

        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setAge(age);
        user.setPassword(password);

        String msg = service.registerUser(user);
        System.out.println(msg);

        req.setAttribute("msg", msg);
        RequestDispatcher rd = req.getRequestDispatcher("/success.jsp");
        rd.forward(req, res); 
    }
}
