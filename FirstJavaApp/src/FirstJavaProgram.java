public class FirstJavaProgram {
 public  void setIntegerArray(int[] array) {
	for(int i=0; i<array.length;i++) {
		System.out.println("The data in array is " +array[i]);
	}
	}
 public void setInt(int a) {
 }
 public static void main(String[] args) {
		int arr[]=new int [2];
		arr[0]=3;
		arr[1]=4;
		int x=5;
		
		FirstJavaProgram  obj1 = new FirstJavaProgram();
		obj1.setInt(x);
		obj1.setIntegerArray(arr);
		}
	}