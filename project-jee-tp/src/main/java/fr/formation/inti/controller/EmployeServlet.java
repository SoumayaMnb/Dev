package fr.formation.inti.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.formation.inti.dao.EmployeeDaoImpl;
import fr.formation.inti.dao.IEmployeeDao;
import fr.formation.inti.entity.Employee;

/**
 * Servlet implementation class EmployeServlet
 */
@WebServlet("/emp")
public class EmployeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IEmployeeDao employeeDao;

	public EmployeServlet() {
		super();
		employeeDao = new EmployeeDaoImpl();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName =  request.getParameter("firstName");
		String lastName =  request.getParameter("lastName");
		// branch =  request.getParameter("branch");
		String startDate =  request.getParameter("startDate");
		Date date1 = null;
		try {
			date1 = new SimpleDateFormat("yyyy-MM-dd").parse(startDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		String endDate =  request.getParameter("endDate");
		String password =  request.getParameter("password");
		String title =  request.getParameter("title");
		
		Employee employee = new Employee();
		employee.setFirstName(firstName);
    	employee.setLastName(lastName);
    //	employee.setBranch(branch);
    	employee.setStartDate(date1);
    	employee.setTitle(title);
    	
    	employeeDao.save(employee);
    	
    	request.getRequestDispatcher("/empcont").forward(request, response);
	}
	
}

