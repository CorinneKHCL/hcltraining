package Servlet;

import DAO.EmployeeDAO;
import Entity.Employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewServlet
 */
@WebServlet("/ViewEmpServlet")
public class ViewEmpServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<a href='index.jsp'><button>Add new Employee</button></a>");
		out.println("<h1>List of Employees</h1>");
		
		List<Employee> employees = EmployeeDAO.listEmployees();
		
	
		
		out.print("<table border='1' width='100%'");
		out.print("<tr><th>Name</th><th>Password</th><th>Role</th><th>Edit</th><th>Delete</th></tr>");
		
		for (Employee e : employees) {
			
            out.print("<tr><td>"+e.getName()+"</td><td>"+e.getPassword()+"</td><td>"
                    +e.getRole()+"</td><td>" + "<td><a href='EditServlet?id="
                    +e.getId()+"'>Edit</a></td> <td><a href='DeleteEmpServlet?id="
                    +e.getId()+"'>Delete</a></td></tr>");
        }
        out.print("</table>");

        out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
