
public class Car {
	int horsepower;
	String name;

	Boolean started = false;
	Boolean stopped = false;
	
	public void start() {

		if (started = true) {
			System.out.println("Sorry you have started already. You need to stop before starting again");
		} else {
			System.out.println("Starting the " + name);
		}
	}

	public void stop() {
		
		if (stopped = true) {
			System.out.println("Sorry, you have not started yet. Please start the car before stopping.");
		} else {
			System.out.println("Stopping the " + name);
		}
	
	}
}

