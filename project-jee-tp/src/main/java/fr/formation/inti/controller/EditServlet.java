package fr.formation.inti.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
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
 * Servlet implementation class AfficherSevlet
 */
@WebServlet("/editer")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IEmployeeDao employeeDao;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditServlet() {
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
		String empId = request.getParameter("empid");
		if(empId != null) {
			Employee emp = employeeDao.findById(Integer.parseInt(empId));
			request.setAttribute("empe", emp);
		}

		request.getRequestDispatcher("jspf/edit.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String empId = request.getParameter("empid");
		String title = request.getParameter("title");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String startDate = request.getParameter("startDate");
		
		Date date=new Date();
		try {
			 date = new SimpleDateFormat("yyyy-MM-dd").parse(startDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		DateTimeFormatter startDate1 = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
		
		Employee emp = new Employee();
		emp.setEmpId(Integer.parseInt(empId));
		emp.setTitle(title);
		emp.setFirstName(firstName);
		emp.setLastName(lastName);
		emp.setStartDate(date);
		
		employeeDao.update(emp);

		
		request.getRequestDispatcher("/empcont").forward(request, response);
		

	}
}
