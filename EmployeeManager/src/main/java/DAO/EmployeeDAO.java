package DAO;

import Entity.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;


public class EmployeeDAO {
	
	public static Session startSession() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		return session;
	}
	
	 public static Integer addEmployee(String name, String password, String role){
		 	SessionFactory session_factory = HibernateUtil.getSessionFactory();
			Session session = session_factory.openSession();
	        
	        Employee employee = new Employee();
	        employee.setName(name);
	        employee.setPassword(password);
	        employee.setRole(role);
	        session.beginTransaction();
	             
	      
	        session.save(employee);
	        session.getTransaction().commit();
	        return employee.getId();
	    }
	 
	    /* Method to  READ all the employees */
	    public static List<Employee> listEmployees( ){
	    	
	    	SessionFactory session_factory = HibernateUtil.getSessionFactory();
			Session session = session_factory.openSession();
			String hql = "FROM Entity.Employee";
			
			session.beginTransaction();
			Query<Employee> query = session.createQuery(hql);
			List<Employee> employees = query.list();

	        session.getTransaction().commit();

	    	return employees;
	    }
	    
	    
	    public static void deleteEmp(int id) {
	    	SessionFactory session_factory = HibernateUtil.getSessionFactory();
			Session session = session_factory.openSession();
			
			session.beginTransaction();
			Employee employee = (Employee)session.get(Entity.Employee.class, id);
			session.delete(employee);
			session.getTransaction().commit();
	    	
	    }
	    
	    public static Employee getEmployeeId(int id) {
	    	SessionFactory session_factory = HibernateUtil.getSessionFactory();
			Session session = session_factory.openSession();
	    	Employee e = new Employee();
	    	
	    	session.beginTransaction();
	    	e = (Employee)session.get(Entity.Employee.class, id);
	    	session.getTransaction().commit();
	    	return e;
	    	
	    }
	    
	    public static int updateEmployee(Employee e) {
	    	SessionFactory session_factory = HibernateUtil.getSessionFactory();
			Session session = session_factory.openSession();
	    	int status = 0;
	    	
	    	session.beginTransaction();
	    	Employee emp = (Employee)session.get(Entity.Employee.class, e.getId());
	    	emp.setName(e.getName());
	    	emp.setPassword(e.getPassword());
	    	emp.setRole(e.getRole());

	    	session.update(emp);
	    	session.getTransaction().commit();
	    	
	    	status = emp.getId();
	    	return status;
	    }
}
