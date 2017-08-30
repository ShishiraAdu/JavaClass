
public class Application {

	public static void main(String[] args) {
		System.out.println("Creating my own data types");
		
		Window W1 = new Window();
		W1.name = "Window";
		W1.placement = "Wall of house";
		W1.shape = "Rectangle";
		W1.use = "To see outside";
		Window W2 = new Window();
		W2.name = "Skylight";
		W2.placement = "In ceiling/roof";
		W2.shape = "Circle";
		W2.use = "To let in light";
		System.out.println(W1.use);
		System.out.println(W2.use);

	}

}

