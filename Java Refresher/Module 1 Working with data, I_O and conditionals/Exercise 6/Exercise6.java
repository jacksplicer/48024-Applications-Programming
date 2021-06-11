public class Exercise6 {
	public static void main(String[] args) {
		// INSERT YOUR CODE HERE
		String usr = Input.askString("Username:");
        String passwd = Input.askString("Password:");
        if(usr.equals("joe") && passwd.equals("guess")) {
            System.out.println("Welcome, joe!");
        }
        else {
            System.out.println("Incorrect username or password.");
        }
	}
}

