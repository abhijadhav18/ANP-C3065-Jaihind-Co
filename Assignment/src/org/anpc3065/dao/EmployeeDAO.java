package org.anpc3065.dao;

import org.anpc3065.model.Employee;


public class EmployeeDAO {
	Employee empArr[]=new Employee[10];
	
	public void setEmployee(Employee employee) {
		for(int i=0;i<empArr.length;i++) {
			if(empArr==null);
			empArr[i]=employee;
			break;
		}
	}
	public Employee[] getEmployee() {
		return empArr;
	}
	
	public double getEmployeeSalary(double empSal){
		
		return empSal;
		
	}



}
