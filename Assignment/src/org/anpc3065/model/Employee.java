package org.anpc3065.model;

public class Employee {
	//Here we declare member variables
	int employeeId;
	String employeeName;
	double employeeSalary;
	float numberOfYearWithCompany;
	
	// here we declared a parameterised constructor
	public Employee(int empId,String empName,double empSal,float empYr){
		
	}
	
	// here we declared a non-parameterised constructor
	public Employee() {
		
	}
	
	
	// In Set Method we setting the information of employees
	// here we are declaring parameterised method without return type for employee ID
	public void setEmloyeeId(int empId) { // here empId is reference(parametric) variable
		employeeId=empId;// here we are assigning empId value to member variable
//		System.out.println("Employee Id Is :"+employeeId);
		
	}
	
	// here we are declaring parameterised method without return type for employee name
	public void setEmloyeeName(String empName) {
		employeeName=empName;
//		System.out.println("Employee Name Is :"+employeeName);
		
	}
	
	// here we are declaring parameterised method without return type for employee salary
	public void setEmloyeeSalary(double empSal) {
		employeeSalary=empSal;
//		System.out.println("Employee Salary Is :"+employeeSalary);
		
	}
	
	// here we are declaring parameterised method without return type for employee years 
	public void setnumberOfYearWithCompany(float empYr) {
		 numberOfYearWithCompany=empYr;
//		System.out.println("Number Of Year With Company Is :"+ numberOfYearWithCompany + " Years");
		
	}
	
	
	// With Help of getter method we access the information of employees set by the setter method
	public int getEmployeeId() {
		return employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public float getnumberOfYearWithcompany() {
		return numberOfYearWithCompany;
	}
	


}
