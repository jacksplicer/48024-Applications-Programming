public class Exercise3 {
	public static void main(String[] args) {
		// INSERT YOUR CODE HERE

		double radius = Input.askDouble("What is the circle radius?");
        Circle circle = new Circle(radius);
        circle.showArea();
	}
}
