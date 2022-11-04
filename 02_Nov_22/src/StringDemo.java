import java.util.Scanner;
import java.util.StringTokenizer;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 90;

//		Assigning Literals Direct To Object Is Called As Auto-Boxing
		Integer iObj = 90;
		Boolean bObj = true;

		String str2 = "Welcome";

		String str1 = new String("Welcome"); // String Is Not A Primitive Datatype In Java
		boolean result = str1 == str2 ? true : false;
		System.out.println(result);
		System.out.println(str1.equals(str2));
		
		
		
		String sentence="Welcome Here";
		String strArr[]=sentence.split(" ");
		for(String s:strArr)
			System.out.println(s);
		

	
	Scanner sc=new Scanner(System.in);
	String data=sc.nextLine();
	StringTokenizer st=new StringTokenizer(data);
	while(st.hasMoreElements()) {
		System.out.println(st.nextElement());
	}
	}
	
}

