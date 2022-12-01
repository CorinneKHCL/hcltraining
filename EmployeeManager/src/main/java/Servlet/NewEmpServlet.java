package Servlet;

import DAO.EmployeeDAO;
import Entity.Employee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SaveServlet
 */
@WebServlet("/NewEmpServlet")
public class NewEmpServlet extends HttpServlet {
	//private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String role = request.getParameter("role");
		
		Employee e = new Employee();
		e.setName(name);
		e.setPassword(password);
		e.setRole(role);
		
		Integer status = 0;
		try {
			status = EmployeeDAO.addEmployee(name, password, role);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		if(status>0) {
			out.print("<p>Employee successfully saved</p>");
			request.getRequestDispatcher("index.jsp").include(request, response);
		}else {
			out.print("<p>" + status + " Unable to save record</p>");
		}
		
		out.close();
	}

}
