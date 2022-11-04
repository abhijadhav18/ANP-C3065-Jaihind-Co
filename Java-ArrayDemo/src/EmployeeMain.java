
class Employee {
//	The Below Are The Member Varibles
	int employeeId;  
	String employeeName;
	boolean employeeStatus;
	/*
	 * Employee(){
	 * 
	 * }
	 */
//	Overloading Polymorphism With Constructor
	
//	Polymorphism Means Having Same Name Different Parameters
	
//	We Cant Have 2 Contructor which are both Parametrized Or Non-Parameterized 
//	We can Have Multiple Constructors With SAme Constructor name But the Parameters in the Constructors And Their Types Should be Different
	
	Employee(){
		System.out.println("Non Parameterized Constructor");
		}
	
	Employee(int empId){
		
	}
	Employee(String employeeName){
		
	}
	
	Employee(int empId,String empName){
		System.out.println("Parameterized Constructor");
		employeeId=empId;
		employeeName=empName;
	}
	
	void displayEmployeeDetails() {
		int empValue;
		empValue=89;
//		System.out.println(empValue);
		System.out.println(employeeId);
		System.out.println(employeeName);
		System.out.println(employeeStatus);
	}
}
	
	public class EmployeeMain{
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Employee sc=new Employee();
//		Employee sc1=new Employee(1,"Rutika");
//		sc.displayEmployeeDetails();
//		sc1.displayEmployeeDetails();
//		
//		We Can also call the methodsin this way in main Method
//		System.out.println(sc.employeeId);
//		System.out.println(sc1.employeeName);
//		
		int arr[]=new int[5];
		Employee e1=new Employee(1,"Raj");

		
		Employee employeeArr[]=new Employee[5];
		employeeArr[0]=e1;
		
//		Anonymous Object
		employeeArr[1]=new Employee(1,"Mani");   
		
		for(Employee e:employeeArr) {
			e.displayEmployeeDetails();
		}

	}

	
}

