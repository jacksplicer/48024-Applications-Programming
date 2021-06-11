import java.util.Random;
public class Exercise5 {
	public static void main(String[] args) {
		// INSERT YOUR CODE HERE

		Random gen = new Random(7777);
        int rand = gen.nextInt(100);
        System.out.println("Here is a random number: " + rand);
	}
}
