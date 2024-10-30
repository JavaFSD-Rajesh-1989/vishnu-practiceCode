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

@WebServlet("/getUsers")
public class GetAllUsers extends HttpServlet {
    
    private UserService service;

    public GetAllUsers() {
        this.service = new UserService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        User[] users = service.getAllUsers();
        req.setAttribute("users", users);

        RequestDispatcher rd = req.getRequestDispatcher("/welcome.jsp");
        rd.forward(req, res);

    }

    }

