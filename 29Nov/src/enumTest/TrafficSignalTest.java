package enumTest;

public class TrafficSignalTest {
	
	//here we are declaring member variable of type TrafficSignal
	
	TrafficSignal color;
	
	// now we createed a parameterised constructor having parameter of type TrafficSignal
	TrafficSignalTest(TrafficSignal color){
		this.color=color;
		
	}
	
	
	//here we are creating a method selectColor
	
	void selectColor() {
		switch(color) {
		case GREEN:
			System.out.println(color.time());
			break;
		case RED:
			System.out.println(color.time());
			break;
		case ORANGE:
			System.out.println(color.time());
			break;
		}
	}

	public static void main(String[] args) {
		
		java.util.Scanner sc=new java. util.Scanner(System. in);
		System.out.println("Please Enter Traffic colour");
		String color = sc.next();
		
		TrafficSignalTest light= new TrafficSignalTest(TrafficSignal.valueOf(color));
	    
		System.out.println("Timer Is :");
	    light.selectColor();
		

	}

}
