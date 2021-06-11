public class Exercise5 {
	public static void main(String[] args) {
		// INSERT YOUR CODE HERE
		Rectangle rectangle = new Rectangle(8, 4);
        System.out.println("The initial rectangle dimensions are " + rectangle);
        rectangle.changeDimensions(6, 5);
        System.out.println("The new rectangle dimensions are " + rectangle);
        int area = rectangle.calculateArea();
        if(area > 10) {
            System.out.println("This is a big rectangle.");
        }
        else {
            System.out.println("This is a small rectangle.");
        }
	}
}
