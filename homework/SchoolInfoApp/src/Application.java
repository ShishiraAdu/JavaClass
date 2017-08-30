import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		System.out.print("What is your grade?");
		Scanner scanner = new Scanner(System.in);
		int grade = scanner.nextInt();
		
		if( grade < 6) {
			System.out.println("You are in elementary school.");
		}
		else if ( grade < 9) {
			System.out.println("You are in middle school.");
		}
		else if (grade < 13) {
			System.out.println("You are in high school.");
		}
		else {
			System.out.println("You are in college.");
		}
		
		scanner.close();
	}

}

