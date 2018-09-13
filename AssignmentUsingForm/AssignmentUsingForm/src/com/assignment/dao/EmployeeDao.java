package com.assignment.dao;

import java.util.List;

import com.assignment.model.Employee;



public interface EmployeeDao {
	public List<Employee> getJson();
	public List<Employee> getEmployeeBetwenSal(float i,float y);
	public Employee getEmployeeThroughId(int j);
	public void updateEmployee(Employee employee) ;
	public void updateEmployeeName(Employee employee);
	public void addEmployee(Employee e);
	public void deleteEmployee(int id) ;
	

}
