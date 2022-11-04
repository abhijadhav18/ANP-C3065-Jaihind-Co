class Student{
//	Constructors Are Methods Which Dont Have Return Type
	Student(){
		System.out.println("Constructor");
	}
	void Student() {
		System.out.println("Method");
	}
}
public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student std=new Student(); 
		std.Student();
		

	}

}
