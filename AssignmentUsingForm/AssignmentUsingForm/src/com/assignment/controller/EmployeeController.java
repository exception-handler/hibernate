package com.assignment.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.assignment.dao.EmployeeDaoImpl;
import com.assignment.model.Employee;





@Path("empser")
public class EmployeeController {
	EmployeeDaoImpl emp=new EmployeeDaoImpl();
	 @Path("greet")
	    @GET
	    @Produces(MediaType.TEXT_HTML)
		public String greet()
		{
			return "Welcome to project management api";
		}
	 
	@Path("getJson1")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getJson() {
		// TODO Auto-generated method stub
		return emp.getJson();
	}
	 
	@Path("getsal/{x}/{y}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)

	public List<Employee> employeeSalaryList(@PathParam("x") float x1, @PathParam("y") float y1) {
		List<Employee> e = emp.getEmployeeBetwenSal(x1, y1);

		return e;
	}
	 
	@Path("getid/{x}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)

	public Employee employeeById(@PathParam("x") int x1) {
		return emp.getEmployeeThroughId(x1);
	}
	
	 @Path("management/update")
	    @PUT
	    @Produces(MediaType.TEXT_PLAIN)
	    @Consumes(MediaType.APPLICATION_JSON)
	    public String updateEmployee(Employee em)
	    {
	             emp.updateEmployee(em);
	    	return "record updated";
	    }
	    
	 
	 @Path("management/updateEmployeeName")
	    @PUT
	    @Produces(MediaType.TEXT_PLAIN)
	    @Consumes(MediaType.APPLICATION_JSON)
	    public String updateEmployeeName(Employee em)
	    {
	             emp.updateEmployeeName(em);
	    	return "name updated";
	    }
	    
	 
	 
	 @Path("management/add")
	    @POST
	    @Produces(MediaType.TEXT_PLAIN)
	   
	    public String addEmployee(Employee e)
	    {
	    	emp.addEmployee(e);
	    	return  "Record added";
	    
	    }

	 
	 
	    @Path("management/delemp/{id}")
	    @DELETE
	    @Produces(MediaType.TEXT_PLAIN)
	   
	    public String deleteEmployee(@PathParam("id") int pid)
	    {
	    	emp.deleteEmployee(pid);
	    	return  "Record Deleted";
	    
	    }
	    
	    @POST
		@Path("insert")
		@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
		public void addProject(@FormParam("employeeId") int Id,@FormParam("empName") String Name,
				@FormParam("designation")  String designation,@FormParam("salary")  float sal){
			System.out.println("enter controller");
			Employee e=new Employee(Id, Name, designation, sal);
			
			emp.insert(e);
				}
}

