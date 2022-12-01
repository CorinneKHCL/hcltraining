package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.EmployeeDAO;
import Entity.Employee;

/**
 * Servlet implementation class EditEmpServlet
 */
//@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>Update Employee Information</h1>");
		String sid = request.getParameter("id");
		int id = Integer.parseInt(sid);
		
		Employee employee = EmployeeDAO.getEmployeeId(id);
		
		 	out.print("<form action='EditSubmitServlet' method='post'>");
	        out.print("<table>");
	        out.print("<tr><td></td><td><input type='hidden' name='id' value='"+employee.getId()+"'/></td></tr>");
	        out.print("<tr><td>Name:</td><td><input type='text' name='name' value='"+employee.getName()+"'/></td></tr>");
	        out.print("<tr><td>Password:</td><td><input type='password' name='password' value='"+employee.getPassword()+"'/> </td></tr>");
	        out.print("<tr><td>Role:</td><td>");
	        out.print("<select name='role' style='width:150px'>");
	        out.print("<option>Manager</option>");
	        out.print("<option>Developer</option>");
	        out.print("<option>HR</option>");
	        out.print("<option>Trainer</option>");
	        out.print("</select>");
	        out.print("</td></tr>");
	        out.print("<tr><td colspan='2'><input type='submit' value='Edit & Save '/></td></tr>");
	        out.print("</table>");
	        out.print("</form>");

	        out.close();
	}


}
