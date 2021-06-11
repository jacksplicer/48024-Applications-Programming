public class Exercise4 {
	public static void main(String[] args) {
		// INSERT YOUR CODE HERE

		double radius = Input.askDouble("What is the circle radius?");
        Circle circle = new Circle(radius);
        if(circle.calculateArea() >= 10) {
            System.out.println("This circle is big.");
        }
        else {
            System.out.println("This circle is small.");
        }
	}
}

