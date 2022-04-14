package fr.formation.inti.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class ConnectServlet
 */
@WebServlet("/connect")
public class ConnectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ConnectServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String email = request.getParameter("email");
		String password = request.getParameter("password");
//		System.out.println(email);
//      System.out.println(password);

		if ("root@gmail.com".equals(email) && "123456".equals(password)) {
			out.println("connection réussis");
		} else {

			// rester dans page
			RequestDispatcher rd = request.getRequestDispatcher("/connect.html");
			rd.forward(request, response);
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
