package fr.formation.inti.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.formation.inti.entity.Users;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		out.println("<h1> Method Post: Bonjour " + username + " " + "</h1>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		PrintWriter out = response.getWriter();
//		String username = request.getParameter("username");
//		String password = request.getParameter("password");
////		System.out.println(email);
////      System.out.println(password);
//
//		if ("root".equals(username) && "123456".equals(password)) {
//			out.println("connection r�ussis");
//		} else {
//
//			// rester dans page
//			RequestDispatcher rd = request.getRequestDispatcher("/connect.html");
//			rd.forward(request, response);
//		}
		String username = request.getParameter("username");
		String username = request.getParameter("password");	}

	if ("root".equals(username) && "123456".equals(password)) {
		out.println("connection r�ussis");
	} else {

		RequestDispatcher rd = request.getRequestDispatcher("/connect.html");
		rd.forward(request, response);
	}
}
