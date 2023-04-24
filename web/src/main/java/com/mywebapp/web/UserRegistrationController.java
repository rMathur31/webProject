package com.mywebapp.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import dao.UserDao;
import model.User;

@WebServlet("/register")
public class UserRegistrationController extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private UserDao userDao;

    public void init() {
        userDao = new UserDao();
    }

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		 response.sendRedirect("register.jsp");

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		User user = new User();

		user.setUsername(username);
		user.setPassword(password);

		userDao.saveUser(user);

		RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
		dispatcher.forward(request, response);

	}
	
}
