package enumTest;

public enum TrafficSignal {
	// enum is used to create a fixed set of constant values
	
//	green,red,orange //here we are only declaring enum constant 
	GREEN(30),RED(60),ORANGE(5);// here we are declaring enum constant and we are assigning values to it

	int time; // here member variable of TrafficSignal Enum
	
	
	// now we are creating a constructor TrafficSignal having parameter as int time
	TrafficSignal(int time){
		this.time=time;
	}
	
	// here we created  method to return the time(value)
	int time() {
		return time;
	}
}
