import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.util.Scanner;

class Demo{
	void display() {
		//Concrete Method are called using Object
		System.out.println("display Method");
	}
	static void gree() {
		//Static Method are called using Class
		System.out.println("gree Method");
	}
}
public class LocalDateTimeDemo {
	
//Private Modifier Is Not Applicable for Outer Class
// Default Modifier Is Accessible for Outer Classs I
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTimeDemo obj=new LocalDateTimeDemo();
		
		
		
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Date");
//		String stringDOB=sc.next();
//		
//		LocalDate localDate=LocalDate.parse(stringDOB);//yyyy-mm-dd
		
		LocalDate localDate2=LocalDate.now();
		DateTimeFormatter myDateFormat=DateTimeFormatter.ofPattern("dd/MM/YYYY");
		System.out.println(localDate2.format(myDateFormat));
		
		LocalTime localtime=LocalTime.now();
		System.out.println(localtime);
		
		LocalDateTime localDateTime=LocalDateTime.now();
		System.out.println(localDateTime);

	}

}
