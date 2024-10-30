package com.web.Servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class MyServlet extends HttpServlet {
    
   // private static final String PROXY_URI = "https://proxy.example.com/app";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        try {
            String username = req.getParameter("username");
            String password = req.getParameter("password");

            if ("admin".equals(username) && "admin".equals(password)) {
                HttpSession session = req.getSession();
                session.setAttribute("username", username);
                
                req.getRequestDispatcher("/welcome.jsp").forward(req, res);

            } else {
            	req.getRequestDispatcher("/error.jsp").forward(req, res);
               // res.sendRedirect("error.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
            res.sendRedirect("error.jsp");
        }
    }
}
