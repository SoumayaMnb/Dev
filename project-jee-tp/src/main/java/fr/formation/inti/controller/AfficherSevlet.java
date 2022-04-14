package fr.formation.inti.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.formation.inti.dao.EmployeeDaoImpl;
import fr.formation.inti.dao.IEmployeeDao;
import fr.formation.inti.entity.Employee;

/**
 * Servlet implementation class AfficherSevlet
 */
@WebServlet("/afficher")
public class AfficherSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IEmployeeDao employeeDao;
	//bonjour
	 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AfficherSevlet() {
        super();
        employeeDao = new EmployeeDaoImpl();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empId = request.getParameter("empid");
		String action = request.getParameter("action");
		
		Integer id = Integer.parseInt(empId);
		Employee deptid = employeeDao.findById(id);
		request.setAttribute("employee", deptid);
		
		if("affiche".equals(action)) {
			request.getRequestDispatcher("jspf/afficher.jsp").forward(request, response);
			
			
			
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
