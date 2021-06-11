public class Exercise6 {
	public static void main(String[] args) {
		// INSERT YOUR CODE HERE

		BankAccount account = new BankAccount();
        account.showBalance();
        if(account.getBalance() >= 20) {
            System.out.println("Purchasing movie ticket.");
            account.withdraw(20.0);
            account.showBalance(); 
        }
        else {
            System.out.println("You need more money to buy a movie ticket.");
        }
	}
}
