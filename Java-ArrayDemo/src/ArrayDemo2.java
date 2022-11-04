
public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[Rows][Columns]=new int[3][2];  We Can Assign Array With Thus Method
//		arr[0][0]=90;
//		arr[0][1]=45;
//		arr[1][0]=34;
//		arr[1][1]=85;
//		arr[2][0]=23;
//		arr[2][1]=14;
//		
////		System.out.println(arr[2][0]);
//		
//		int arr1[][]= {{2,5},{3,6},{4,5}}; We assign Array With Initialization With Declration
		
//		for(int i=0;i<arr1.length;i++) {
//			for(int j=0;j<arr1[i].length;j++) {
//				System.out.print(arr1[i][j]+" ");
//				
//			}
//				System.out.println();
//			}
//		Enhanced For Loop For 2-D Array
		int arr[][]= {{1,2,3},{3,4,5},{5,6,7}};
		for(int[] a:arr) {
			for(int b:a) {
			System.out.print(b+" ");
		}
		
		System.out.println("");
		}
		

	}
}

