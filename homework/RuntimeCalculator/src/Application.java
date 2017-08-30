import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		System.out.print("Give number of laps:");
		Scanner scanner = new Scanner(System.in);
		int numberOfLaps = scanner.nextInt();
		if (numberOfLaps > 0) {
			System.out.print("Give time taken for lap in minutes:");
			double totalTimeTakenForLaps = scanner.nextDouble();
			for (int i = 0; i < numberOfLaps - 1; i = i + 1) {
				System.out.print("Give time taken for lap in minutes:");
				double timeTakenForLap = scanner.nextDouble();
				totalTimeTakenForLaps = totalTimeTakenForLaps + timeTakenForLap;
			}
			System.out.println("Total time taken is " + totalTimeTakenForLaps + " minute(s).");
		}	
		else {
			System.out.println("Please enter number of laps that is greater than 0.");
		}
		scanner.close();
	}
	
}

