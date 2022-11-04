
public class VarArgsDemo {
	void setArray() {
		System.out.println("setArray Is Called");
		
	}
	void setVarArg(int ...paramVar) {
		System.out.println("setVarArg Called");
		for(int a:paramVar) {
			System.out.println(a);
		}
	}
	void setValues(double paramVar1, int ...paramVar2) { // If U have To Pass Multiple Arguments Always Use 3 Dots(...) Before the Variable Name
		System.out.println("setValues Is Called");
		for(int a:paramVar2 )
		System.out.println(a);
	}
////		 Not acceptable  Because Multiple Argument Parameter(eg.-int ...paramVar2) Should Always Be Defined At Last
//		void setValues2(int ...paramVar2,double paramVar1) {
//		System.out.println("setValues2");
//		for(int a:paramVar2 )
//		System. out.println(a);
//		}
//	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VarArgsDemo obj=new VarArgsDemo();
		
		obj.setArray();
		obj.setValues(1);
		
		obj.setVarArg(5,7,7);

		
	}

}