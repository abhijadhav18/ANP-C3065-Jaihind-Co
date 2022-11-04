package org.anpc3065.model;

public class Employee {
	int employeeId;
	String employeeName;
	double employeeSalary;
	float numberOfYearWithCompany;
	
	public Employee(int empId,String empName,double empSal,float empYr){
		
	}
	public Employee() {
		
	}
	
	public void setEmloyeeId(int empId) {
		employeeId=empId;
//		System.out.println("Employee Id Is :"+employeeId);
		
	}
	public void setEmloyeeName(String empName) {
		employeeName=empName;
//		System.out.println("Employee Name Is :"+employeeName);
		
	}
	public void setEmloyeeSalary(double empSal) {
		employeeSalary=empSal;
//		System.out.println("Employee Salary Is :"+employeeSalary);
		
	}
	public void setnumberOfYearWithCompany(float empYr) {
		 numberOfYearWithCompany=empYr;
//		System.out.println("Number Of Year With Company Is :"+ numberOfYearWithCompany + " Years");
		
	}
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
