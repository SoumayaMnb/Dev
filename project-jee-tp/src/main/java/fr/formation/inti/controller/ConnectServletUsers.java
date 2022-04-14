package fr.formation.inti.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import fr.formation.inti.dao.UsersDaoImpl;
import fr.formation.inti.dao.IUsersDao;
import fr.formation.inti.entity.Users;

/**
 * Servlet implementation class ConnectServlet
 */
@WebServlet("/connectuser")
public class ConnectServletUsers extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private IUsersDao dao;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ConnectServletUsers() {
		dao = new UsersDaoImpl();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Users> list = dao.findAll();
		PrintWriter out = response.getWriter();
		list.forEach(System.out::println);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		 Users user = dao.findUsersBy (username,password);
		 
		if (user !=null) {
			response.getWriter().println("<h1> Connexion Success " +user.getUsername()+"</h1>");
		} else {

			// rester dans page
		response.sendRedirect("connect.html");
		}

	}


}

//response.setContentType("text/html");
//PrintWriter out = response.getWriter();
//String id = request.getParameter("id"); 
//String mdp = request.getParameter("mdp");
//if("root@gmail.com".equals(id) && "123456".equals(mdp)) {
//	out.println("<h1> Vous êtes connecté en tant que  "+id+"</h1>");
//} else {
//	response.sendRedirect("login3.html");
//}
