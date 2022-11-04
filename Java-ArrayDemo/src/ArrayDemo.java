
public class ArrayDemo {

	public static void main(String[] args) {
		
		
		
		
		int arr1[]= {1,2,3,4,5,6};
		// Enhanced For Loop
		for(int i:arr1) {
			System.out.println(i);
		}
		
		float arr2[]= {1.2f,2.2f,3.3f,4.4f};
		for(float a:arr2) {
			float b=a+2;
			System.out.println("Old Value is:" +a+ "New Value Is:" +b);
		}

	}

}
