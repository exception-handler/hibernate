package com.assignment.dao;

import java.util.ArrayList;
import java.util.List;

import com.assignment.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	static List<Employee> emp = new ArrayList<Employee>();
	static {
		emp.add(new Employee(1, "amit", "HR", 20000));
		emp.add(new Employee(2, "harish", "Manager", 23000));
		emp.add(new Employee(3, "ramesh", "CEO", 65000));
	}

	public List<Employee> getJson() {

		return emp;
	}

	List<Employee> emp1 = new ArrayList<Employee>();

	public List<Employee> getEmployeeBetwenSal(float x, float y) {
		for (int i = 0; i < emp.size(); i++) {
			if (emp.get(i).getSalary() < y && emp.get(i).getSalary() > x) {
				emp1.add(emp.get(i));
			}
		}
		return emp1;

	}

	public Employee getEmployeeThroughId(int j) {
		for (int i = 0; i < emp.size(); i++) {

			if (emp.get(i).getEmpId() == j) {
				System.out.println("mil gya");
				Employee e = emp.get(i);
				return e;
			}
		}
		return null;

	}

	public void updateEmployee(Employee employee) {
		int p = employee.getEmpId();
		for (int i = 0; i < emp.size(); i++) {
			if (emp.get(i).getEmpId() == p) {
				emp.get(i).setName(employee.getName());
				emp.get(i).setSalary(employee.getSalary());
				emp.get(i).setDesignation(employee.getDesignation());

			}
		}

	}

	public void updateEmployeeName(Employee employee) {
		int p = employee.getEmpId();
		for (int i = 0; i < emp.size(); i++) {
			if (emp.get(i).getEmpId() == p) {
				emp.get(i).setName(employee.getName());

			}
		}

	}

	public void addEmployee(Employee e) {
		emp.add(e);

	}

	public void deleteEmployee(int id) {
		for (int i = 0; i < emp.size(); i++) {
			if (emp.get(i).getEmpId() == id) {
				emp.remove(i);

			}
		}

	}
	
	public void insert(Employee e)
	{
		emp.add(e);
		System.out.println("Total Number of project"+emp.size());
		System.out.println("resource added successfully");
		
	}

}
